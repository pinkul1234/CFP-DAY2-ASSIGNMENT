package com.bridgelabz.HelloWorld.controller;

import com.bridgelabz.HelloWorld.dto.User;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/hello")
    public class HelloWorldController {
        @RequestMapping(value = {"", "/", "/home"})

        @GetMapping("/getdata")
        public String helloworld() {
            return "Hello from bridgelabz";
        }
        @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
        public String helloWorld(@RequestParam(value = "name") String name){
            return "Hello" + name + "!";
        }
        @GetMapping("/param/{name}")
        public String helloWorldParam(@PathVariable String name){
            return "Hello" + name + "!";
        }
        @PostMapping("/post")
        public String helloWorld(@RequestBody User user){
            return "Hello" + user.getFirstName() + " " + user.getLastName() + "!";
        }
        @PutMapping("/put/{firstName}")
        public String helloWorld(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
            return "Hello" + firstName + " " + lastName + "!";
        }

    }

