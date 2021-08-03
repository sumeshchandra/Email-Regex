package com.email;

public class EmailValidation {
    public static void main(String[] args) {
        System.out.println("Welcome to Email Validation");
        System.out.println("Enter Email for Validation check : ");

        EmailPattern emailPattern = new EmailPattern();
        emailPattern.emailValidate();
    }
}
