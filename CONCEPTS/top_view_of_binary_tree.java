package CONCEPTS;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Pair {
    TreeNode node;
    int vt; // Vertical position

    Pair(TreeNode node, int vt) {
        this.node = node;
        this.vt = vt;
    }
}

class Solution {

    public List<Integer> topView(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Root has vertical position 0
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {

            Pair rp = q.poll();

            // Add only the first node seen at this vertical position
            if (!map.containsKey(rp.vt)) {
                map.put(rp.vt, rp.node.val);
            }

            // Left child -> vertical position -1
            if (rp.node.left != null) {
                q.add(new Pair(rp.node.left, rp.vt - 1));
            }

            // Right child -> vertical position +1
            if (rp.node.right != null) {
                q.add(new Pair(rp.node.right, rp.vt + 1));
            }
        }

        // TreeMap automatically stores keys in sorted order
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
}