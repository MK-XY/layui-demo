package layui.demo.layuidemo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import layui.demo.layuidemo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LayuiDemoApplicationTests {

    @Test
    public void contextLoads() {
        List<User> list= new ArrayList<User>();
        list.add(new User());
        list.add(new User());
        list.add(new User());
        list.add(new User());
        String s = JSON.toJSONString(list);
        System.out.println("s = " + s);
    }

}
