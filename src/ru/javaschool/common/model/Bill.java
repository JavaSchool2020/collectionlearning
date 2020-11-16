package ru.javaschool.common.model;

import java.time.LocalDate;
import java.util.Objects;

public class Bill {
    LocalDate date;
    Person person;
    Sum sum;

    public Bill(LocalDate date, Person person, Sum sum) {
        this.date = date;
        this.person = person;
        this.sum = sum;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Sum getSum() {
        return sum;
    }

    public void setSum(Sum sum) {
        this.sum = sum;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "date=" + date +
                ", person=" + person +
                ", sum=" + sum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return Objects.equals(date, bill.date) &&
                Objects.equals(person, bill.person) &&
                Objects.equals(sum, bill.sum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, person, sum);
    }
}
