package com.vkopendoh.ejb.business;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(MoneyTransactionInterface.class)


public class PayPalMoneyTransaction implements MoneyTransactionInterface {
    @Override
    public String transactMoney() {
        return "Money was transacted via PayPal";
    }
}
