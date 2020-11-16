package ru.javaschool.common.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Sum {
    BigDecimal amount;
    BigDecimal commission;

    public Sum() {
    }

    public Sum(BigDecimal amount, BigDecimal commission) {
        this.amount = amount;
        this.commission = commission;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "Total{" +
                "amount=" + amount +
                ", commission=" + commission +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sum sum = (Sum) o;
        return amount.equals(sum.amount) &&
                commission.equals(sum.commission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, commission);
    }
}
