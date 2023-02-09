package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {

    @Test
    public void constructorShouldCreateObjectsWhenValidData() {

        Financing financing =  new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(100000.0, financing.getTotalAmount());
        Assertions.assertEquals(2000.0, financing.getIncome());
        Assertions.assertEquals(80, financing.getMonths());
    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing =  new Financing(100000.0, 2000.0, 20);
        });
    }

    @Test
    public void setTotalAmountShouldUpdateValuesWhenValidData() {

        Financing financing =  new Financing(100000.0, 2000.0, 80);
        financing.setTotalAmount(90000.0);

        Assertions.assertEquals(90000.0, financing.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldThrowExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing =  new Financing(100000.0, 2000.0, 80);
            financing.setTotalAmount(110000.0);
        });
    }

    @Test
    public void setIncomeShouldUpdateValuesWhenValidData() {

        Financing financing =  new Financing(100000.0, 2000.0, 80);
        financing.setIncome(2100.0);

        Assertions.assertEquals(2100.0, financing.getIncome());
    }

    @Test
    public void setIncomeShouldThrowExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing =  new Financing(100000.0, 2000.0, 80);
            financing.setIncome(1900.0);
        });
    }

    @Test
    public void setMonthsShouldUpdateValuesWhenValidData() {

        Financing financing =  new Financing(100000.0, 2000.0, 80);
        financing.setMonths(100);

        Assertions.assertEquals(100, financing.getMonths());
    }

    @Test
    public void setMonthsShouldThrowExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing =  new Financing(100000.0, 2000.0, 80);
            financing.setMonths(60);
        });
    }

    @Test
    public void entryShouldCalculateEntryValue() {

        Financing financing =  new Financing(100000.0, 2000.0, 80);

        Assertions.assertTrue(() -> financing.entry() == 20000.0);
    }

    @Test
    public void quotaShouldCalculateInstallment() {

        Financing financing =  new Financing(100000.0, 2000.0, 80);

        Assertions.assertTrue(() -> financing.quota() == 1000.0);
    }
}