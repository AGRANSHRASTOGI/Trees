class Node
{
    int key;
    Node left, right;
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
public class BTreeTraversal
{   Node root;
    BTreeTraversal()
    { root = null; }
    void printPostorder(Node node)
    {   if (node == null)
          return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }
    void printInorder(Node node)
    {   if (node == null)
                return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }
    void printPreorder(Node node)
    {   if (node == null)
                return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    void printPostorder() { printPostorder(root); }
    void printInorder() { printInorder(root); }
    void printPreorder() { printPreorder(root); }

    public static void main(String[] args)
    {
            BTreeTraversal tree = new BTreeTraversal();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);
            System.out.println("Preorder traversal of binary tree is ");
            tree.printPreorder();
            System.out.println("\nInorder traversal of binary tree is ");
            tree.printInorder();
            System.out.println("\nPostorder traversal of binary tree is ");
            tree.printPostorder();
    }
}

