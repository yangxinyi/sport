package com.sport.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hidehai on 2015/10/26.
 */
@RestController
@RequestMapping(value = "/")
public class IndexController {


    @RequestMapping(value ="/", method = {RequestMethod.GET,RequestMethod.HEAD})
    public ModelAndView index() {
        return new ModelAndView("/sys/login");
    }

    @RequestMapping(value ="/main", method = RequestMethod.GET)
    public ModelAndView main() {
        return new ModelAndView("/main");
    }


}
