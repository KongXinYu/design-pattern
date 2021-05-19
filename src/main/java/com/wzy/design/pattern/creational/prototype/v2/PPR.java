package com.wzy.design.pattern.creational.prototype.v2;

/**
 * @author: WuZY
 * @time: 2021/05/18
 */
public class PPR implements OfficialDocument  {
    @Override
    public OfficialDocument clone() {
        OfficialDocument ppr = null;
        try {
            ppr = (OfficialDocument) super.clone();
        } catch (Exception e) {
            System.out.println("不支持复制！");
        }
        return ppr;
    }

    @Override
    public void display() {
        System.out.println("《项目进展报告》");
    }
}
