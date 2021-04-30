package com.wzy.design.pattern.creational.singleton.v1;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/29 0029
 */
public class EnumSingleton {

    private EnumSingleton() {
//        if (ContainerHolder.HOLDER.INSTANCE != null) {
//            throw new RuntimeException("单例构造器禁止反射调用");
//        }
    }

    public static EnumSingleton getInstance() {
        return ContainerHolder.HOLDER.INSTANCE;
    }


    private enum ContainerHolder{
        HOLDER;
        private EnumSingleton INSTANCE;
        ContainerHolder(){
            INSTANCE = new EnumSingleton();
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        EnumSingleton o1 = EnumSingleton.getInstance();
//        EnumSingleton o2 = EnumSingleton.ContainerHolder.class.getDeclaredField();

//        System.out.println(o1 == o2);
    }

}
