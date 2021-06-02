package com.fibonacci.pattern.adapter.example;

/**
 * @author fibonacci
 * @date 2021-06-02 21:51
 */
public class AdapterClient {

    public static void main(String[] args) {
        Player b = new Forwards("巴蒂尔");
        b.attack();

        Player m = new Guards("麦克格雷迪");
        m.defense();

        Player y = new Translator("姚明");
        y.attack();
    }

}
