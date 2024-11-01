package com.cbfacademy.words;

public class ReverseCharSequence implements CharSequence {
    private String original;

    public ReverseCharSequence(String original) {
        this.original = original;
    }

    @Override
    public int length() {
        return original.length();
    }

    @Override
    public char charAt(int index) {
        return original.charAt(length() - 1 - index); // Reverse indexing
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder subSequence = new StringBuilder(original.substring(start, end));
        return subSequence.reverse().toString(); // Reverse the substring
    }

    @Override
    public String toString() {
        return new StringBuilder(original).reverse().toString();
    }
}
