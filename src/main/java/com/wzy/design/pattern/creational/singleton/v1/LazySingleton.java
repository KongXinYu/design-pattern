package com.wzy.design.pattern.creational.singleton.v1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description: 懒汉式单例
 * 因为在方法上加了synchronized并发效率低
 * @author: WuZY
 * @time: 2021/4/29 0029
 */
public class LazySingleton {

    private static LazySingleton instance;
    private LazySingleton(){
        if(instance != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }


    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objClass = LazySingleton.class;
        Constructor c = objClass.getDeclaredConstructor();
        c.setAccessible(true);

        LazySingleton o1 = LazySingleton.getInstance();
//        LazySingleton o2 = (LazySingleton) c.newInstance();
//
        System.out.println(o1);
//        System.out.println(o2);
//        System.out.println(o1 == o2);
    }

}
