package com.practise.login.registration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;


@Service

public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {

        // TODO: Regex to validate email
        return true;
    }
}
