package com.fibonacci.pattern.builder.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fibonacci
 * @date 2021-05-30 22:04
 */
public class Product {

    private List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        parts.forEach(System.out::println);
    }
}
