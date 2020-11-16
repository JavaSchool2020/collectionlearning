package ru.javaschool;

import ru.javaschool.common.model.Bill;
import ru.javaschool.common.model.Person;
import ru.javaschool.common.model.Sum;
import ru.javaschool.service.BillTotalService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class MapExploring {
    public static void main(String[] args) {
        Set<Bill> billTreeSet = new SetExploring().buildBillTreeSet(new ListArrayExploring().buildBillsArrayList());
        LocalDate date = LocalDate.now();

        billTreeSet.add(new Bill(date, new Person("Antonina", "Kalinkina"),
                new Sum(new BigDecimal("102"), new BigDecimal("2"))));

        Map<Person, Collection<Bill>> personBillMap = new MapExploring().buildBillsMap(billTreeSet);
        System.out.println(personBillMap);

        Map<Person, BigDecimal> total = new MapExploring().total(personBillMap);

        System.out.println(total);
    }

    Map<Person, Collection<Bill>> buildBillsMap(Set<Bill> billTreeSet) {
        Map<Person, Collection<Bill>> personBillMap = new HashMap<>();

        for (Bill element: billTreeSet) {
            Person person = element.getPerson();
            Collection<Bill> billsOfPerson = personBillMap.get(person);
            if (billsOfPerson == null) {
                billsOfPerson = new ArrayList<>();
                personBillMap.put(person, billsOfPerson);
            }
            billsOfPerson.add(element);
        }

        return personBillMap;
    }

    Map<Person, BigDecimal> total(Map<Person, Collection<Bill>> personBillMap) {
        Map<Person, BigDecimal> totals = new HashMap<>();
        for(Map.Entry<Person, Collection<Bill>> entry: personBillMap.entrySet()) {
            BigDecimal sum = new BigDecimal("0");
            for (Bill bill: entry.getValue()) {
                sum = sum.add(BillTotalService.calculate(bill));
            }
            totals.put(entry.getKey(), sum);
        }

        return totals;
    }
}
