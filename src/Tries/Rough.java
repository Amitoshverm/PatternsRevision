package Tries;

import java.util.Arrays;

public class Rough {
    public static void main(String[] args) {
        Character[] arr = new Character[26];
        insert('t', arr);
        insert('a', arr);
        insert('e', arr);
        insert('i', arr);
        insert('o', arr);
        insert('u', arr);
        insert('e', arr);
        insert('i', arr);
        insert('o', arr);
        insert('s', arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void insert(char ch, Character[] characters) {
        characters[ch - 'a'] = ch;
    }

}
