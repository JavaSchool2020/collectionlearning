package ru.javaschool;

import ru.javaschool.common.model.Bill;
import ru.javaschool.common.model.Person;
import ru.javaschool.common.model.Sum;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListArrayExploring {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("lime");
        arrayList.add("cherry");

        System.out.println(arrayList);
        arrayList.remove("lime");

        System.out.println("******");
        System.out.println(arrayList);

        List<Bill> bills = new ListArrayExploring().buildBillsArrayList();

        System.out.println("*****");
        System.out.println(bills);
        System.out.println("Second " + bills.get(1));
    }

    public List<Bill> buildBillsArrayList() {
        LocalDate date = LocalDate.now();
        Bill bill1 = new Bill(date, new Person("Antonina", "Kalinkina"),
                new Sum(new BigDecimal("100"), new BigDecimal("2")));
        List<Bill> bills = new ArrayList<>(2);
        bills.add(bill1);
        bills.add(new Bill(date, new Person("Konstantin", "Petrov"),
                new Sum(new BigDecimal("150"), new BigDecimal("0.20"))));
        bills.add(new Bill(date, new Person("Antonina", "Kalinkina"),
                new Sum(new BigDecimal("100"), new BigDecimal("2"))));

        return bills;
    }
}
