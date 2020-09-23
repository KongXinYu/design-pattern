package com.wzy.design.pattern.structural.decorator.v1;/**
 * @description:
 * @author: Administrator
 * @time: 2020/9/22 0022 下午 5:08
 */

/**
 *
 * 能满足现有场景，如果还需要真加新的场景者，如加两个蛋的场景就需要在增加类
 *@author: WuZY
 *@time: 2020/9/22 0022 下午 5:08
 *
 */
public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+" 销售价格:"+battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+" 销售价格:"+battercakeWithEgg.cost());

        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc()+" 销售价格:"+battercakeWithEggSausage.cost());


    }
}
