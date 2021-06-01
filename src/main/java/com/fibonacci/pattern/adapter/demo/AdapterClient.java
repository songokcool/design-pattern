package com.fibonacci.pattern.adapter.demo;

/**
 * @author fibonacci
 * @date 2021-06-02 0:52
 */
public class AdapterClient {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }

}
