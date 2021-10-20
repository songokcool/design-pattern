package com.fibonacci.pattern.composite.demo.unsafe;

import java.util.ArrayList;
import java.util.List;

/**
 * 树叶构件
 *
 * @author fibonacci
 * @date 2021-10-20 23:09
 */
public class Composite implements Component {

    private List<Component> child = new ArrayList<>();

    @Override
    public void add(Component c) {
        child.add(c);
    }

    @Override
    public void remove(Component c) {
        child.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return child.get(i);
    }

    @Override
    public void operation() {
        for (Component c : child) {
            c.operation();
        }
    }
}
