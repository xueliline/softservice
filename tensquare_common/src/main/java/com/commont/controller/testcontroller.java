package com.commont.controller;

import com.commont.entity.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

@RestController
@RequestMapping("/label")
public class testcontroller {
    @Autowired
    com.commont.service.testservice testservice;

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @ResponseBody
    public Label searchone(@PathVariable String id) {
        Label label = testservice.get(id);
        System.out.println("传过来的用户id为" + id);
        return label;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Label> searchall() {
        List<Label> list = testservice.getall();
        return list;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public int  update(@RequestBody Label label) {
        int res = testservice.update(label);
        return res;
    }
}
