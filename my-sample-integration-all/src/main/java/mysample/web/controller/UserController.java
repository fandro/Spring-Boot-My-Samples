package mysample.web.controller;

import mysample.domain.Address;
import mysample.domain.User;
import mysample.service.AddressService;
import mysample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.Map;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by fuwb on 16/7/4.
 */
@Controller
@EnableSwagger2
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private AddressService addressService;

    @RequestMapping("/index")
    //@ResponseBody
    String home(Map<String,Object> model) {
        List<User> all = userService.findAll();
        List<Address> AddressAll = addressService.findAll();
        model.put("users",all);
        model.put("addresses",AddressAll);

        return "index";
    }


    @Bean
    public Docket swaggerSpringMvcPlugin() {
        ApiInfo apiInfo = new ApiInfo("sample of springboot", "sample of springboot", null, null, null, null, null);
        Docket docket = new Docket(DocumentationType.SWAGGER_2).select().paths(regex("/user/.*")).build()
                .apiInfo(apiInfo).useDefaultResponseMessages(false);
        return docket;
    }
}
