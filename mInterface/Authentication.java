package mInterface;

import users.Account;

public interface Authentication {

    public abstract void register();
    
    public static boolean login(Account account)
    {
        for (Account acc : Account.accountList) {
            if (account.equals(acc)) {
                return true;
            }
            
        }
        return false;
    }
}
