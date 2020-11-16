package ru.javaschool;

import ru.javaschool.common.model.Bill;
import ru.javaschool.service.BillSumComparator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExploring {

    public static void main(String[] args) {
        List<Bill> list = new ListArrayExploring().buildBillsArrayList();
        HashSet<Bill> set = new SetExploring().buildBillsHashSet(list);
        System.out.println("*****");
        System.out.println(set);

        Set<Bill> billTreeSet = new SetExploring().buildBillTreeSet(list);
        System.out.println("*****");
        System.out.println(billTreeSet);

        Set<Bill> billSetReversed = new SetExploring().buildBillTreeSetReversed(list);
        System.out.println("*****");
        System.out.println(billSetReversed);
    }

    HashSet<Bill> buildBillsHashSet(List<Bill> bills) {
        HashSet<Bill> setBills = new HashSet<>(bills);

        return setBills;
    }

    TreeSet<Bill> buildBillTreeSet(List<Bill> bills) {
        TreeSet<Bill> billTreeSet = new TreeSet<>(new BillSumComparator());
        billTreeSet.addAll(bills);

        return billTreeSet;
    }

    TreeSet<Bill> buildBillTreeSetReversed(List<Bill> bills) {
        TreeSet<Bill> billTreeSet = new TreeSet<>(new BillSumComparator().reversed());
        billTreeSet.addAll(bills);

        return billTreeSet;
    }

}
