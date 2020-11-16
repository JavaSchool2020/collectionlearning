package ru.javaschool.service;

import ru.javaschool.common.model.Bill;

import java.math.BigDecimal;
import java.util.Comparator;

public class BillSumComparator implements Comparator<Bill> {

    @Override
    public int compare(Bill o1, Bill o2) {
        BigDecimal sum1 = o1.getSum().getAmount().add(o1.getSum().getCommission());
        BigDecimal sum2 = o2.getSum().getAmount().add(o2.getSum().getCommission());

        return sum1.compareTo(sum2);
    }
}
