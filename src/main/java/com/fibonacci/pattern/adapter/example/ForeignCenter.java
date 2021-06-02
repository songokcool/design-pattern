package com.fibonacci.pattern.adapter.example;

/**
 * @author fibonacci
 * @date 2021-06-02 21:46
 */
public class ForeignCenter {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jingong() {
        System.out.println("外籍中锋" + name + "进攻");
    }

    public void fangshou(){
        System.out.println("外籍中锋" + name + "防御");
    }
}
