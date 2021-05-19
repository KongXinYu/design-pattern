package com.wzy.design.pattern.creational.prototype.v2;

/**
 * 可行性分析报告(Feasibility Anlysis Report)类
 * @author: WuZY
 * @time: 2021/05/18
 */
public class FAR implements OfficialDocument {

    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (Exception e) {
            System.out.println("不支持复制！");
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
