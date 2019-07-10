package layui.demo.layuidemo.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import layui.demo.layuidemo.mapper.UserMapper;
import layui.demo.layuidemo.model.Result;
import layui.demo.layuidemo.model.SearchUser;
import layui.demo.layuidemo.model.User;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/demo/layui")
public class JsDemoController {

    @Autowired
    private UserMapper mapper;

    @Autowired
    ServletContext context;

    @GetMapping
    public Result query(@RequestParam(value = "page",defaultValue = "1") Integer page, @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize, SearchUser user){
        Page<User> users = PageHelper.startPage(page, pageSize).doSelectPage(() -> mapper.query(user));
        if(page > users.getPages()){
            page = users.getPages();
            users = PageHelper.startPage(page, pageSize).doSelectPage(() -> mapper.query(user));
        }
        return Result.sucess(0,"",users.getTotal(),users.getResult());
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable("id") Integer id){
        int num = mapper.deleteById(id);
        return num;
    }

    @DeleteMapping
    public void delete(@RequestParam("id") List<Integer> id){
        mapper.delete(id);
    }

    @PostMapping
    public void add(@RequestBody User user) throws IOException, ServletException {

//        store(files.get(0),user);
        mapper.add(user,String.join(",",user.getHobby()));
    }

    @PutMapping
    public void edit(@RequestBody User user) throws IOException {
//        store(avatarFile,user);
        mapper.edit(user,String.join(",",user.getHobby()));
    }

    private void store(MultipartFile headImgFile, User user) throws IOException {
        String rootDir = context.getRealPath("/");
        File uploadDir = new File(rootDir, "uploads");
        String url = String.format("%s/%s.%s",
                new SimpleDateFormat("yyyy/MM/dd").format(new Date()),
                UUID.randomUUID().toString(),
                headImgFile.getOriginalFilename().replaceAll("^.*\\.(.*)$", "$1"));

        File storePath = new File(uploadDir, url);

        if (!storePath.getParentFile().exists()) {
            storePath.getParentFile().mkdirs();
        }
        headImgFile.transferTo(storePath);
        user.setAvatar("/uploads/" + url);
    }
}
