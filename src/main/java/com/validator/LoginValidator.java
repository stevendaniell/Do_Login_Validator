package com.validator;

public class LoginValidator {
    
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";
    
    public boolean validateLogin(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        return VALID_USERNAME.equals(username.trim()) && VALID_PASSWORD.equals(password.trim());
    }
    
    public boolean validateUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            return false;
        }
        return username.trim().length() >= 3;
    }
    
    public boolean validatePassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            return false;
        }
        return password.trim().length() >= 6;
    }
    
    public String getValidationMessage(String username, String password) {
        if (validateLogin(username, password)) {
            return "Login successful! Welcome, " + username.trim() + ".";
        }
        if (!validateUsername(username)) {
            return "Invalid username. Username must be at least 3 characters.";
        }
        if (!validatePassword(password)) {
            return "Invalid password. Password must be at least 6 characters.";
        }
        return "Login failed. Please check your credentials.";
    }

    public boolean isUsernameAdmin(String username) {
        return username != null && VALID_USERNAME.equals(username.trim());
    }

    public static void main(String[] args) {
        LoginValidator validator = new LoginValidator();
        System.out.println(validator.getValidationMessage("admin", "password123"));
        System.out.println(validator.getValidationMessage("user", "pass"));
    }
}
