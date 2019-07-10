package layui.demo.layuidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class LayuiDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LayuiDemoApplication.class, args);
    }

}
