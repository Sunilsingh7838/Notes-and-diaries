 class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public int getBalance() {
        return balance;
    }
}


public

class Threads {
    public static
    void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Runnable depositRunnable = () -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100);
                try {
                    Thread.sleep(100); // Simulating processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable withdrawRunnable = () -> {
            for (int i = 0; i < 5; i++) {
                account.withdraw(200);
                try {
                    Thread.sleep(100); // Simulating processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread depositThread = new Thread(depositRunnable);
        Thread withdrawThread = new Thread(withdrawRunnable);

        depositThread.start();
        withdrawThread.start();

        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
