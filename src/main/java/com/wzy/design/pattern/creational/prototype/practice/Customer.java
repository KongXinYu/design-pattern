package com.wzy.design.pattern.creational.prototype.practice;

import lombok.SneakyThrows;

import java.io.*;

/**
 * @author: WuZY
 * @time: 2021/05/19
 */
public class Customer implements Cloneable, Serializable {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * 浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Customer clone() throws CloneNotSupportedException {
        return (Customer) super.clone();
    }

    /**
     * 深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
//    @Override
//    protected Customer clone() throws CloneNotSupportedException {
//        Customer customer = null;
//        ObjectInputStream ois = null;
//        try (
//                // 将对象写到流中
//                ByteArrayOutputStream bos = new ByteArrayOutputStream();
//                ObjectOutputStream oos = new ObjectOutputStream(bos);
//                ){
//            oos.writeObject(this);
//
//            // 从流中读取对象
//            ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
//            customer = (Customer) ois.readObject();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (ois != null) {
//                try {
//                    ois.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return customer;
//    }
}
