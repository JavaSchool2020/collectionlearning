package ru.javaschool;

import ru.javaschool.common.model.Bill;
import ru.javaschool.service.BillTotalService;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Set;

public class IteratorExploring {
    public static void main(String[] args) {
        Set<Bill> billTreeSet = new SetExploring().buildBillTreeSet(new ListArrayExploring().buildBillsArrayList());

        Iterator<Bill> iterator = billTreeSet.iterator();
        short count = 0;
        while (iterator.hasNext()) {
            Bill element = iterator.next();
            System.out.println("element " + count + ": " + element);
            count++;
        }

        BigDecimal total = new BigDecimal("0");
        for(Bill element: billTreeSet) {
            total = total.add(BillTotalService.calculate(element));
        }
        System.out.println("total " + total);
    }
}
