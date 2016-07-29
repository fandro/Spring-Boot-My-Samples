package mysample.web.controller;


import mysample.domain.Address;
import mysample.domain.User;
import mysample.service.AddressService;
import mysample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by fuwb on 16/7/4.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UserService userService;
    @Autowired
    private AddressService addressService;

    @RequestMapping("")
    String home(Map<String,Object> model) {
        List<User> all = userService.findAll();
        List<Address> AddressAll = addressService.findAll();
        model.put("users",all);
        model.put("addresses",AddressAll);

        model.put("time", new Date());
        model.put("message", "haha");

        return "index";
    }
}
