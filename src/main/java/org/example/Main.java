package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount();
        CreditAccount creditAccount = new CreditAccount(1000);

        simpleAccount.add(500);
        creditAccount.add(300);

        simpleAccount.pay(200);
        creditAccount.pay(800);

        simpleAccount.transfer(creditAccount, 100);
        System.out.println("Баланс простого счета: " + simpleAccount.getBalance());
        System.out.println("Баланс кредитного счета: " + creditAccount.getBalance());
    }
}