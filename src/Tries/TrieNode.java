package Tries;

import java.util.Arrays;

public class TrieNode {
    char data;
    int freq;
    TrieNode[] children = new TrieNode[26];

    public TrieNode(char data, int freq, TrieNode[] children) {
        this.data = data;
        this.freq = freq;
        this.children = children;
    }

    public TrieNode(char data) {
        this.data = data;
    }

//    void insert(String word, TrieNode root) {
//        TrieNode current = root;
//        int l = word.length();
//        for (int i = 0; i < l; i++) {
//            int index = word.charAt(i) - 'a';
//            if (current.children[index] == null) {
//                current.children[index] = new TrieNode(word.charAt(i));
//            }
//            current = current.children[index];
//        }
//        current.freq++;
//    }

//    boolean search (String word, TrieNode root) {
//        TrieNode current = root;
//        int l = word.length();
//        for (int i = 0; i < l; i++) {
//            int index = word.charAt(i) - 'a';
//            if (current.children[index] == null) {
//                return false;
//            }
//            current = current.children[index];
//        }
//        if  (current.freq > 0) {
//            return true;
//        }
//        return false;
//
//    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", freq=" + freq +
                ", children=" + Arrays.toString(children) +
                '}';
    }

//    public static void main(String[] args) {
//        TrieNode root = new TrieNode('a');
//        root.insert("apple", root);
//
//        System.out.println(root);
//    }
}
