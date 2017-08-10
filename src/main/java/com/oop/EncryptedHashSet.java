package com.oop;

import java.util.HashSet;

public class EncryptedHashSet<E> extends HashSet<E> {

    @Override
    public boolean add(E input) {
        return super.add(encrypt(input));
    }

    public E encrypt(E input) {
        // Implement encryption logic
        return input;
    }

}
