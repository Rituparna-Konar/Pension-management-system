package com.pms.detail.util;

import com.pms.detail.exception.AadharNumberNotFound;
import com.pms.detail.model.Bank;
import com.pms.detail.model.PensionerDetail;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonUtilsTest {
    @Test
    void calculateBankCharge_private() {
        String bankType = "private";
        assertEquals(CommonUtils.calculateBankCharge(bankType),550); ;
    }
    @Test
    void calculateBankCharge_public() {
        String bankType = "public";
        assertEquals(CommonUtils.calculateBankCharge(bankType),500); ;
    }
}
