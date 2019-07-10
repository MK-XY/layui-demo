package layui.demo.layuidemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/demo")
public class DemoController {

//    @GetMapping("/get")
//    public String demo(HttpServletRequest request){
//        HttpSession session = request.getSession();
//        session.setAttribute("date",new Date());
//        return "demo";
//    }
    @GetMapping("/get")
    public String demo(ModelMap model){

        model.put("date",new Date());
        return "demo";
    }

}
