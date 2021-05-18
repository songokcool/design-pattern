package com.fibonacci.pattern.decorator.demo;

/**
 * @author fibonacci
 * @date 2021-05-18 22:19
 */
public class ConcreteComponent extends Component{

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }

}
