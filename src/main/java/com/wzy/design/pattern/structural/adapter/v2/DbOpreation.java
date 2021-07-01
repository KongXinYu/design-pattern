package com.wzy.design.pattern.structural.adapter.v2;

/**
 * <p> </p>
 *
 * @author WuZhenYu
 * @since 2021/7/1 0001
 */
public interface DbOpreation {

    /**
     * 口令加密
     * @param command 口令
     * @return 加密后的口令
     */
    public String commandEncrypt(String command);

    /**
     * 邮箱加密
     * @param email 邮箱
     * @return 加密后的邮箱
     */
    public String emailEncrypt(String email);

}
