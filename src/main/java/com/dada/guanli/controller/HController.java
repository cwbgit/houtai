package com.dada.guanli.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lenovo
 * @create 2019-05-13 15:37
 * @desc
 **/
@RestController
public class HController {
    @RequestMapping("/")
    public String hi(){
        return "Congratulations! It works!";
    }
}
