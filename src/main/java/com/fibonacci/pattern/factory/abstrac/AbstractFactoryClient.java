package com.fibonacci.pattern.factory.abstrac;

/**
 * @author fibonacci
 * @date 2021-05-31 22:59
 */
public class AbstractFactoryClient {

    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        IFactory factory = new AccessFactory();

        IUser factoryUser = factory.createUser();
        factoryUser.insert(user);
        factoryUser.getUser(1);

        IDepartment factoryDepartment = factory.createDepartment();
        factoryDepartment.insert(department);
        factoryDepartment.getDepartment(1);
    }

}
