import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Binary {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(2);
        Node n4 = new Node(3);
        Node n5 = new Node(7);
        Node n6 = new Node(5);

        Node root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        System.out.println(minimumInTree(root));

        System.out.println(areCousins(root, 7, 5));
        List<Integer> ans = new ArrayList<>();
        nodeAtLevelK(root, 2, ans);
        System.out.println(ans);

    }

    private static void nodeAtLevelK(Node root, int level, List<Integer> ans) {
        if (root == null || level < 0)
            return;
        if (level == 0) {
            ans.add(root.data);
        }
        nodeAtLevelK(root.left, level - 1, ans);
        nodeAtLevelK(root.right, level - 1, ans);
    }

    static Node xPar, yPar;
    static int xLevel, yLevel;

    static void areCosinHelper(Node node, Node par, int x, int y, int level) {
        if (node == null)
            return;
        if (node.data == x) {
            xPar = par;
            xLevel = level;
        }
        if (node.data == y) {
            yPar = par;
            yLevel = level;
        }
        areCosinHelper(node.left, node, x, y, level + 1);
        areCosinHelper(node.right, node, x, y, level + 1);
    }

    static boolean areCousins(Node root, int x, int y) {
        areCosinHelper(root, null, x, y, 0);
        boolean onSameLevel = xLevel == yLevel;
        boolean diffrenceLevel = xPar != yPar;
        return onSameLevel && diffrenceLevel;
    }

    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static int minimumInTree(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;
        int minfromleft = minimumInTree(root.left);
        int minfromright = minimumInTree(root.right);
        return Math.min(Math.min(minfromleft, minfromright), root.data);
    }

    static int height(Node root) {
        if (root == null)
            return 0;
        int hl = height(root.left);
        int hr = height(root.right);
        return Math.max(hl, hr) + 1;
    }

}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }

}
