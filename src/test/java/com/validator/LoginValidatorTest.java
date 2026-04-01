package com.validator;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginValidatorTest {
    
    @Test
    public void testValidLogin() {
        LoginValidator validator = new LoginValidator();
        assertTrue(validator.validateLogin("admin", "password123"));
    }
    
    @Test
    public void testInvalidLogin() {
        LoginValidator validator = new LoginValidator();
        assertFalse(validator.validateLogin("wrong", "wrong"));
    }
    
    @Test
    public void testValidateUsername() {
        LoginValidator validator = new LoginValidator();
        assertTrue(validator.validateUsername("admin"));
        assertFalse(validator.validateUsername("ab"));
    }
    
    @Test
    public void testValidatePassword() {
        LoginValidator validator = new LoginValidator();
        assertTrue(validator.validatePassword("password123"));
        assertFalse(validator.validatePassword("12345"));
    }
}
