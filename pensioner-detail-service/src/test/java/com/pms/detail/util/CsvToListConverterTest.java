package com.pms.detail.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class CsvToListConverterTest {
    @InjectMocks
    private CsvToListConverter csvUtils;
    @Test
    void  processTxt() throws IOException {
        assertEquals(20,csvUtils.processTxt().size());
    }
}
