package com.wzy.design.pattern.creational.prototype.v2;

/**
 * @title 带原型管理器的原型模式
 * @description  Sunny软件公司在日常办公中有许多公文需要创建、递交和审批，例如《可行性分析报告》、
 * 《立项建议书》、《软件需求规格说明书》、《项目进展报告》等，为了提高工作效率，
 * 在OA系统中为各类公文均创建了模板，用户可以通过这些模板快速创建新的公文，
 * 这些公文模板需要统一进行管理，系统根据用户请求的不同生成不同的新公文。
 * @author: WuZY
 * @time: 2021/05/18
 */
public class Client {

    public static void main(String[] args) {
        // 获取原型管理器对象
        PrototypeManager pm = PrototypeManager.getPrototypeManager();
        OfficialDocument doc1, doc2, doc3, doc4, doc5, doc6;
        doc1 = pm.getOffcialDocument("far");
        doc1.display();
        doc2 = pm.getOffcialDocument("far");
        doc2.display();
        System.out.println(doc1 == doc2);

        doc3 = pm.getOffcialDocument("srs");
        doc3.display();
        doc4 = pm.getOffcialDocument("srs");
        doc4.display();
        System.out.println(doc3 == doc4);

        doc5 = pm.getOffcialDocument("ppr");
        doc5.display();
        doc6 = pm.getOffcialDocument("ppr");
        doc6.display();
        System.out.println(doc5 == doc6);
    }

}
