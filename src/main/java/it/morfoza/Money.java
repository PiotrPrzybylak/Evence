package it.morfoza;

import java.math.BigDecimal;

/**
 * Created by widzew on 2016-09-20.
 */
public class Money {

    private BigDecimal value;

    public Money(double value) {
        this.value = new BigDecimal(value);
    }

    public Money(BigDecimal value) {
        this.value = value;
    }


    public double getDoubleValue() {
        return value.doubleValue();
    }
}
