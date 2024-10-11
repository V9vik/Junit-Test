package org.example;

class SimpleAccount extends Account {
    @Override
    public boolean pay(long amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

