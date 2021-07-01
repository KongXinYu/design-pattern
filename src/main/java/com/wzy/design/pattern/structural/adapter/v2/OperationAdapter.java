package com.wzy.design.pattern.structural.adapter.v2;

/**
 * <p> </p>
 *
 * @author WuZhenYu
 * @since 2021/7/1 0001
 */
public class OperationAdapter implements DbOpreation{
    private CommandSercet commandSercet;

    private EmailSercet emailSercet;

    public OperationAdapter() {
        commandSercet = new CommandSercet();
        emailSercet = new EmailSercet();
    }


    @Override
    public String commandEncrypt(String command) {
        return commandSercet.encrypt(command);
    }

    @Override
    public String emailEncrypt(String email) {
        return emailSercet.encrypt(email);
    }
}
