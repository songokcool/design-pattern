package com.fibonacci.pattern.factory.abstrac;

/**
 * @author fibonacci
 * @date 2021-05-31 22:52
 */
public class SqlServerDepartment implements IDepartment{
    @Override
    public void insert(Department department) {
        System.out.println("在SQL Server中给Department插入一条数据");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在SQL Server中根据id查询Department数据");
        return null;
    }
}
