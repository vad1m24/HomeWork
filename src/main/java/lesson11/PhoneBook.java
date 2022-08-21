package lesson11;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

        HashMap<Integer, String> phoneBook = new HashMap<>();
        
        public void addPerson (Integer number, String surname){
            phoneBook.put(number, surname);
        }

    public ArrayList <Integer> getPerson(String surname) {
//        for (int i = 0; i < phoneBook.size(); i++) {
        ArrayList<Integer> integers = new ArrayList<>();


        for (Integer number : phoneBook.keySet()) {
            if (phoneBook.get(number).equals(surname)) {
                integers.add(number);
            }
        }
        return integers;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}

