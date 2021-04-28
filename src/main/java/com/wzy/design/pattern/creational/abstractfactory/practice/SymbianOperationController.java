package com.wzy.design.pattern.creational.abstractfactory.practice;

/**
 * @description: 塞班游戏操作控制类：具体产品
 * @author: WuZY
 * @time: 2021/4/28 0028
 */
public class SymbianOperationController implements OperationController {
    @Override
    public void display() {
        System.out.println("显示塞班游戏操作控制！");
    }
}
