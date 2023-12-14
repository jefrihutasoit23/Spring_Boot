package com.aplikasi.karyawan.ch4.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/v1/mvc/")
public class HelloControolerMVC { ///v1/mvc/hello_world
    @RequestMapping(value = "/hello_world", method = RequestMethod.GET)
    public String printHelloWorld(ModelMap modelMap){

        // add attribute to load modelMap
        modelMap.addAttribute("message","Hello World and Welcome to Spring MVC!");
        modelMap.addAttribute("nama","RIKI ALDI PARI");
        // nama file FE
        return "hello_world";
    }

    @RequestMapping(value = "/sample1", method = RequestMethod.GET)
    public String sample2(ModelMap modelMap){

        // nama file FE
        return "sample";
    }

}
