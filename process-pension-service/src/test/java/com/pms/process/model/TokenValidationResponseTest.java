package com.pms.process.model;

import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class TokenValidationResponseTest {
    @Test
    void testNoArgs_TokenValidationResponse() {
        assertThat(new TokenValidationResponse()).isNotNull();
    }

    @Test
    void testAllArgs_TokenValidationResponse() {
        assertThat(new TokenValidationResponse(true)).isNotNull();
    }
    @Test
    void testTokenValidationResponseSetterMethod() {
        TokenValidationResponse tokenValidationResponse = new TokenValidationResponse();
        tokenValidationResponse.setValid(true);
        assertThat(tokenValidationResponse).isNotNull();
    }
}
