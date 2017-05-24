package com.websi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gabriel on 23/05/17.
 */

@Controller
public class ControllerGeral {

    @RequestMapping("/")
    @ResponseBody
    public String home () {
        return "TESTANDO";
    }

    @RequestMapping("/home")
    @ResponseBody
    public String teste () { return "TESTE"; }


}
