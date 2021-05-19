package com.wzy.design.pattern.creational.prototype.practice;

/**
 * @author: WuZY
 * @time: 2021/05/19
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Customer customer1 = new Customer();
        Address address = new Address();
        customer1.setAddress(address);
        Customer customer2 = customer1.clone();
        System.out.println(customer1 == customer2);
        System.out.println(customer1.getAddress() == customer2.getAddress());
    }
}
