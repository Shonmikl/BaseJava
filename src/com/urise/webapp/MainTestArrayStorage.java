package com.urise.webapp;

import com.urise.webapp.model.Resume;
import com.urise.webapp.storage.ListStorage;


public class MainTestArrayStorage {
    private static final ListStorage ARRAY_STORAGE = new ListStorage();

    public static void main(String[] args) {

        final Resume r1 = new Resume("uuid9");
        final Resume r2 = new Resume("uuid33");
        final Resume r3 = new Resume("uuid3");

        ARRAY_STORAGE.save(r3);
        ARRAY_STORAGE.save(r1);
        ARRAY_STORAGE.save(r2);

        /**
         *  a new resume + update();
         */

        System.out.println("Get r1: " + ARRAY_STORAGE.get(r1.getUuid()));
        System.out.println("Size: " + ARRAY_STORAGE.size());

   //     System.out.println("Get dummy: " + ARRAY_STORAGE.get("dummy"));

        printAll();
        ARRAY_STORAGE.delete(r1.getUuid());
        printAll();
        ARRAY_STORAGE.clear();
        printAll();

        System.out.println("Size: " + ARRAY_STORAGE.size());
    }

    static void printAll() {
        System.out.println("\nGet All");
        for (Resume r : ARRAY_STORAGE.getAll()) {
            System.out.println(r);
        }
    }
}