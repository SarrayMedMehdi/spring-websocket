package com.demo.springsec.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@CrossOrigin(origins = "*", allowedHeaders = "*" , methods = RequestMethod.GET)
@RestController
public class AuthController {

    @GetMapping("/resource")
    public Map<String,Object> home () {
        Map<String,Object> model =  new HashMap<String,Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello Word!");
        return model;
    }
}
