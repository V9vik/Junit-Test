package org.example;

class Account {
    protected long balance;

    public Account() {
        this.balance = 0;
    }

    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean pay(long amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            return account.add(amount);
        }
        return false;
    }

    public long getBalance() {
        return balance;
    }
}


