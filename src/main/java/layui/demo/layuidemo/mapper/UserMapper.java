package layui.demo.layuidemo.mapper;

import layui.demo.layuidemo.model.SearchUser;
import layui.demo.layuidemo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 新增用户
     * @param user
     */
    void add(@Param("user") User user, @Param("hobby") String hobby);

    /**
     * 删除用户信息
     * @param ids
     */
    void delete(@Param("ids") List<Integer> ids);

    /**
     * 删除用户信息根据id
     * @param id
     */
    int deleteById(Integer id);

    /**
     * 修改用户信息
     * @param user
     */
    void edit(@Param("user") User user, @Param("hobby") String hobby);

    /**
     * 查询用户信息根据条件
     * @return userList
     */
    List<User> query(SearchUser searchUser);

    /**
     * 查询用户
     * @param id
     * @return
     */
    User queryUserById(Integer id);
}
