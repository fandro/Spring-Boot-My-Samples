package mysample.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;
import java.util.Map;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by fuwb on 16/7/4.
 */
@Controller
@EnableSwagger2
//@RequestMapping("/order")
public class OrderController {

    @Value("${application.message}")
    private String msg = "today is good day!";

    @RequestMapping("/")
    String home(Map<String,Object> model) {
        model.put("time", new Date());
        model.put("msg", this.msg);
        return "welcome";
    }


    @Bean
    public Docket swaggerSpringMvcPlugin() {
        ApiInfo apiInfo = new ApiInfo("sample of springboot", "sample of springboot", null, null, null, null, null);
        Docket docket = new Docket(DocumentationType.SWAGGER_2).select().paths(regex("/user/.*")).build()
                .apiInfo(apiInfo).useDefaultResponseMessages(false);
        return docket;
    }
}
