package com.example.cachewithredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private CacheManager cacheManager;

    @GetMapping
    @Cacheable("hello")
    public String hello() {
        System.out.println("Sem cache!");
        return "Hello world!";
    }

    @GetMapping(value = "/cancel")
    @CacheEvict("hello")
    public String cancel() {
        System.out.println("Limpando cache!");
        return "Cache cancelado!";
    }

    @GetMapping("/list")
    public List<String> list() {

    }

}
