package org.example;

class CreditAccount extends Account {
    private final long creditLimit;

    public CreditAccount(long creditLimit) {
        super();
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean pay(long amount) {
        if (amount > 0 && (balance + creditLimit) >= amount) {
            balance -= amount; // Может уходить в минус до кредитного лимита
            return true;
        }
        return false;
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount > 0) {
            System.out.println("Операция не может быть выполнена. Баланс не может быть больше 0");
            return false;
        }
        balance += amount;
        return true;
    }
}
