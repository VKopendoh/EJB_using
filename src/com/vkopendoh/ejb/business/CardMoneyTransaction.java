package com.vkopendoh.ejb.business;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Local


public class CardMoneyTransaction {
    public String transactMoney() {
        return "Money was transacted via Credit card";
    }
}