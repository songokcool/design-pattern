package com.fibonacci.pattern.factory.abstrac;

/**
 * @author fibonacci
 * @date 2021-05-31 22:55
 */
public class AccessUser implements IUser{
    @Override
    public void insert(User user) {
        System.out.println("在Access中给User插入一条数据");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Access中根据id查询User数据");
        return null;
    }
}
