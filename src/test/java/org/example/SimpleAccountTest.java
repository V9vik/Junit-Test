package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleAccountTest {
    private SimpleAccount simpleAcount;
    private CreditAccount creditAccount;

    @BeforeEach
    public void setUp(){
        simpleAcount = new SimpleAccount();
        creditAccount = new CreditAccount(1000);
    }

    @Test
    public void testSimpleAcount(){
        int value = 200;
        simpleAcount.add(500);
        simpleAcount.pay(400);
        simpleAcount.add(100);
        Assertions.assertEquals(simpleAcount.balance, value);
    }
    @Test
    public void testCreditAcount(){
        int value = -450;
        creditAccount.pay(500);
        creditAccount.add(50);
        Assertions.assertEquals(creditAccount.balance, value);
    }
    @Test
    public void setSimpleAcount2(){
        int value = 500;
        simpleAcount.add(500);
        simpleAcount.transfer(creditAccount, 800);
        Assertions.assertEquals(simpleAcount.balance, value);
    }
}