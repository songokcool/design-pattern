package com.fibonacci.pattern.composite.demo.unsafe;

/**
 * 抽象构件
 *
 * @author fibonacci
 * @date 2021-10-20 23:06
 */
public interface Component {

    public void add(Component c);

    public void remove(Component c);

    public Component getChild(int i);

    public void operation();
}
