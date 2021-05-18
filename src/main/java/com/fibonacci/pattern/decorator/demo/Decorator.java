package com.fibonacci.pattern.decorator.demo;

/**
 * @author fibonacci
 * @date 2021-05-18 22:20
 */
public abstract class Decorator extends Component{

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
