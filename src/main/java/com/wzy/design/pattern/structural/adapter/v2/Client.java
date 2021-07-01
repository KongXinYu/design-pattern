package com.wzy.design.pattern.structural.adapter.v2;

import com.wzy.design.pattern.utils.XmlUtil;

/**
 * <p> </p>
 *
 * @author WuZhenYu
 * @since 2021/7/1 0001
 */
public class Client {
    public static void main(String[] args) {
        DbOpreation opreation = XmlUtil.getFristBean("config.xml", "adapterv2");

        assert opreation != null;
        opreation.commandEncrypt("ds");
        opreation.emailEncrypt("6666@163.com");
    }
}
