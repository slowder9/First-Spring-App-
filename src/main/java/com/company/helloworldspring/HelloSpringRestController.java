package com.company.helloworldspring;

import com.company.helloworldspring.models.Cheeseburger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.ArrayList;

@RestController
public class HelloSpringRestController {
    @RequestMapping(path = "/burgers", method = RequestMethod.GET)
    public List<Cheeseburger> getCheeseburgers() {
        List<Cheeseburger> burgers = new ArrayList<>();

        burgers.add(new Cheeseburger(3, true, true, Cheeseburger.CheeseType.PEPPER_JACK));
        burgers.add(new Cheeseburger(4, true, true, Cheeseburger.CheeseType.PROVOLONE));

        return burgers;
    }
}
