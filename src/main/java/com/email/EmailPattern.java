package com.email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPattern {

        public void emailValidate() {
            Scanner scanner = new Scanner(System.in);
            String email = scanner.next();

            Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]{2,14}+@(.+).com$");
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("Email is Valid");
            } else {
                System.out.println("Email is Invalid");
        }
    }
}
