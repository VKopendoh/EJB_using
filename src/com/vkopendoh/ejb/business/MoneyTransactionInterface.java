package com.vkopendoh.ejb.business;

import javax.ejb.Remote;

@Remote
public interface MoneyTransactionInterface {
    String transactMoney();
}
