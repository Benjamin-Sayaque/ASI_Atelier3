package com.sp.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserTest {
    private User user;

    @BeforeEach
    public void setup() {
        // Initialize a User object before each test
        user = new User(1, "john", "password", 12345, "Doe", "John", "john@example.com",
                Arrays.asList(1, 2, 3), 100);
    }

    @Test
    public void testGetters() {
        // Test getter methods
        Assertions.assertTrue(1== user.getId());
        Assertions.assertTrue("john"== user.getLogin());
        Assertions.assertTrue("password"== user.getPwd());
        Assertions.assertTrue(12345== user.getAccount());
        Assertions.assertTrue("Doe"== user.getLastName());
        Assertions.assertTrue("John"== user.getSurName());
        Assertions.assertTrue("john@example.com"== user.getEmail());
        Assertions.assertTrue(Arrays.asList(1, 2, 3)== user.getCardList());
        Assertions.assertTrue(100== user.getWallet());
    }

    @Test
    public void testSetters() {
        // Test setter methods
        user.setId(2);
        Assertions.assertTrue(2== user.getId());

        user.setLogin("jane");
        Assertions.assertTrue("jane"== user.getLogin());

        user.setPwd("newpassword");
        Assertions.assertTrue("newpassword"== user.getPwd());

        user.setAccount(54321);
        Assertions.assertTrue(54321== user.getAccount());

        user.setLastName("Smith");
        Assertions.assertTrue("Smith"== user.getLastName());

        user.setSurName("Jane");
        Assertions.assertTrue("Jane"== user.getSurName());

        user.setEmail("jane@example.com");
        Assertions.assertTrue("jane@example.com"== user.getEmail());

        List<Integer> newCardList = new ArrayList<Integer>(Arrays.asList(4, 5, 6));
        user.setCardList(newCardList);
        Assertions.assertTrue(newCardList== user.getCardList());

        user.setWallet(200);
        Assertions.assertTrue(200== user.getWallet());
    }
}
