package Tries;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
//
//        trie.insert("apple");
//        trie.insert("app");
//        trie.insert("apple");
//        trie.insert("application");
//        trie.insert("apply");
//        trie.insert("apt");
//        trie.insert("bat");
//        trie.insert("ball");
//        trie.insert("band");

//        System.out.println(trie.search("app"));    // true
//        System.out.println(trie.search("ap"));     // false — prefix only, not a word
//        System.out.println(trie.search("bat"));    // true
//        System.out.println(trie.search("cat"));    // false
//        System.out.println(trie.root.toString());
//        ArrayList<String> A = new ArrayList<>(List.of("hat", "cat", "rat"));
//        A.add("hat");
//        A.add("cat");
//        A.add("rat");

//        List<String> B = new ArrayList<>(List.of("cat", "ball"));
//
//        System.out.println(solve(A, B));
        trie.insert("apple");
        trie.insert("apple");
        trie.insert("apple");   // freq 3 — most popular
        trie.insert("app");
        trie.insert("app");     // freq 2
        trie.insert("application");
        trie.insert("application");
        trie.insert("application");// freq 1
        trie.insert("apply");       // freq 1
        trie.insert("apt");         // freq 1
        trie.insert("appetite");    // freq 1

        System.out.println(trie.getSuggestions("a"));   // [] — too short
        System.out.println(trie.getSuggestions("ap"));  // [apple, app, application, apply, apt]
        System.out.println(trie.getSuggestions("app")); // [apple, app, application, apply]

    }

    public static ArrayList<Integer> solve(List<String> A, List<String> B) {
        Trie trie = new Trie();
        ArrayList<Integer> res = new ArrayList<>();
        int n = A.size();

        for (int i = 0; i < n; i++) {
            trie.insert(A.get(i));
        }

        int m = B.size();
        for (int i = 0; i < m; i++) {
            if (trie.search(B.get(i))) {
                res.add(1);
            }
            else{
                res.add(0);
            }
        }
        return res;
    }
}
