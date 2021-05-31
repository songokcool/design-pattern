package com.fibonacci.pattern.factory.abstrac;

/**
 * @author fibonacci
 * @date 2021-05-31 22:51
 */
public interface IUser {

    void insert(User user);

    User getUser(int id);
}
