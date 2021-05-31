package com.fibonacci.pattern.factory.abstrac;

/**
 * @author fibonacci
 * @date 2021-05-31 22:48
 */
public interface IDepartment {

    void insert(Department department);

    Department getDepartment(int id);
}
