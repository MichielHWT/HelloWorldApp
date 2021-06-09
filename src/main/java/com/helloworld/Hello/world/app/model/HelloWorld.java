package com.helloworld.Hello.world.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HelloWorld {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;

    public HelloWorld(String text) {
        this.text = "Hello world!";
    }

    public HelloWorld(){}

    public String getText() {
        return text;
    }

}
