package com.fibonacci.pattern.factory.abstrac;

/**
 * @author fibonacci
 * @date 2021-05-31 22:56
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();

}
