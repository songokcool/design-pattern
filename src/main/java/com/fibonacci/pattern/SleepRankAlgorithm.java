package com.fibonacci.pattern;


import com.fibonacci.pattern.template.Child;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 排序算法
 *
 * @author fibonacci
 * @date 2021-08-09 15:51
 */
public class SleepRankAlgorithm {

    public static void main(String[] args) {

        Child fibo = new Child("fibo", 23);
        System.out.println(fibo.getName());
        System.out.println(fibo.getAge());

        int[] ints = {23, 4, 7, 6, 12, 15, 77, 43, 28};
        ExecutorService executorService = Executors.newFixedThreadPool(ints.length);
        for (int i = 0; i < ints.length; i++) {
            int fi = i;
            executorService.submit(() -> {
                try {
                    Thread.sleep(ints[fi]);
                    System.out.println(ints[fi]);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown();
    }
}
