package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneBook {
    private final Map<String, List<String>> phoneBook = new HashMap<>();


    public void add(String lastName, String phoneNumber) {
        phoneBook.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }


    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }
}