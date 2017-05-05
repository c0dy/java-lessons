package concurrency.example;

import javax.naming.InsufficientResourcesException;

/**
 * Created by c0dyy on 3/7/17.
 */
public class Operations {
    public static void main(String[] args) throws InsufficientResourcesException {
        final Account a = new Account(1000);
        final Account b = new Account(2000);

        new Thread(() -> {
            try {
                transfer(a, b, 500);
            } catch (InsufficientResourcesException e) {
                e.printStackTrace();
            }
        }).start();
        transfer(b, a, 300);
    }

    static void transfer(Account acc1, Account acc2, int amount) throws InsufficientResourcesException {
        if (acc1.getBalance() < amount)
            throw new InsufficientResourcesException();
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
}
