package mysamples.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by fuwb on 16/7/4.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Value("${application.message:is not exist}") // application.message不存在时显示后面的值,注意不是application.message为空。
    private String message = "Hello World";

    @RequestMapping("index")
    String home(Map<String,Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);

        return "index";
    }

}
