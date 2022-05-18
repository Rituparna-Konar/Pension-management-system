package com.pms.detail.model;

import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class BankLogTest {

    @Test
    void testNoArgs_BankLog() {
        assertThat(new BankLog()).isNotNull();
    }
    @Test
    void testAllArgs_BankLog() {
        LocalDate localDate = LocalDate.of(2014, 9, 11);
        Date date = Date.valueOf(localDate);
        BankLog bl =new BankLog("HDFC",date, "ABCD1234E", 125000,4000,
                "self",123456789,"HDFC",123456,500,
                12890.90,date);
        assertThat(bl).isNotNull();
    }

    @Test
    void testBankLogSetterMethod() {
        LocalDate localDate = LocalDate.of(2014, 9, 11);
        Date date = Date.valueOf(localDate);
        BankLog bl = new BankLog();
        bl.setAadhaarNumber(123455666);
        bl.setAllowances(5000);
        bl.setName("Krishna");
        bl.setBankName("HDFC");
        bl.setBankServiceCharge(500);
        bl.setSalary(15000);
        bl.setAccountNumber(1234567890);
        bl.setDateOfBirth(date);
        bl.setDateOfTransaction(date);
        bl.setId(1);
        bl.setPanNumber("ABCD1234E");
        bl.setPensionAmount(120000);
        bl.setTypeOfPension("self");

        assertThat(bl).isNotNull();
    }
}
