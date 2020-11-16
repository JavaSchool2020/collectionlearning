package ru.javaschool;

import ru.javaschool.common.model.Bill;
import ru.javaschool.common.model.Person;
import ru.javaschool.common.model.Sum;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ImmutableExploring {
    public static void main(String[] args) {
        Bill bill = new Bill(LocalDate.now(), new Person("Antonina", "Kalinkina"),
                new Sum(new BigDecimal("1000"), new BigDecimal("2")));
        List<Bill> singleList = Collections.singletonList(bill);

        System.out.println(singleList);

        Bill bill2 = new Bill(LocalDate.now(), new Person("Antonina", "Kalinkina"),
                new Sum(new BigDecimal("1002"), new BigDecimal("2")));

         List<Bill> listFromArray = Arrays.asList(bill, bill2);
        System.out.println(listFromArray);

        Bill bill3 = new Bill(LocalDate.now(), new Person("Antonina", "Kalinkina"),
                new Sum(new BigDecimal("1003"), new BigDecimal("2")));

        Set<Bill> unmodifiable =  Collections.unmodifiableNavigableSet(new SetExploring().buildBillTreeSet(new ListArrayExploring().buildBillsArrayList()));
        unmodifiable.add(bill3);
    }
}
