package com.helloworld.Hello.world.app.domain;

import com.helloworld.Hello.world.app.model.HelloWorld;
import com.helloworld.Hello.world.app.repositories.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

@RestController
public class HelloWorldEndpoint {

    @Autowired
    HelloWorldRepository hwr;

    @GetMapping("/get_hello_world")
    public String getHelloWorld(){
        return "Hello world";
    }

    @GetMapping("/get_hello_world_database")
    public String getHelloWorldDatabase(){
        String hw = "";
        Iterator<HelloWorld> iter = hwr.findAll().iterator();
        while(iter.hasNext()){
            hw = iter.next().getText();
            break;
        }
        return hw;
    }
}
