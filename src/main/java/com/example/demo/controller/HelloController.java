package com.example.demo.controller;

import com.example.demo.pojo.Author;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello")
public class HelloController {
    @RequestMapping(value="/index")
    @ResponseBody
    public Author hello(){
        Author author = new Author();
        author.setId(1L);
        author.setRealName("小小芳");
        author.setNickName("My love");
        return author;
    }
}
