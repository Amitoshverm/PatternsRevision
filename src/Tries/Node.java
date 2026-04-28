package Tries;

import java.util.Arrays;

public class Node {
    char data;
    int freq;
    Node[] children = new  Node[26];

    public Node(char data, int freq, Node[] children) {
        this.data = data;
        this.freq = freq;
        this.children = children;
    }

    public Node(char data) {
        this.data = data;
    }

    void insert(String word, Node root) {
        Node current = root;
        int l = word.length();
        for (int i = 0; i < l; i++) {
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null) {
                current.children[index] = new Node(word.charAt(i));
            }
            current = current.children[index];
        }
        current.freq++;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", freq=" + freq +
                ", children=" + Arrays.toString(children) +
                '}';
    }

    public static void main(String[] args) {
        Node root = new Node('a');
        root.insert("apple", root);

        System.out.println(root);
    }
}
