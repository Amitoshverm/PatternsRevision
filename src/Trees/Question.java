package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        System.out.println(sol(root));
    }

    public static List<Integer> sol(Node root) {
        List<Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()) {
            int s = q.size();
            for (int i = 0; i < s; i++) {
                Node temp = q.poll();
                if (i == 0) {
                    res.add(temp.val);
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right!= null) {
                    q.add(temp.right);
                }
            }
        }
        // done
        return res;
    }
}
