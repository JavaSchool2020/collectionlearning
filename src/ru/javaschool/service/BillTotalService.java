package ru.javaschool.service;

import ru.javaschool.common.model.Bill;

import java.math.BigDecimal;

public class BillTotalService {
    public static BigDecimal calculate(Bill bill) {
        return bill.getSum().getAmount().add(bill.getSum().getCommission());
    }
}
