package com.fibonacci.pattern.composite.demo.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fibonacci
 * @date 2021-10-20 23:18
 */
public class Composite implements Component {

    private List<Component> child = new ArrayList<>();

    public void add(Component c) {
        child.add(c);
    }

    public void remove(Component c) {
        child.remove(c);
    }

    public Component get(int i) {
        return child.get(i);
    }

    @Override
    public void operation() {
        for (Component c : child) {
            c.operation();
        }
    }
}
