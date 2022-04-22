import java.util.*;
import java.lang.Math;


/*
height = max(height(root.left)-height(root.right))
balancing factor= height(root.left) - height(root.right)
*/

class AVLNode
{
    int data;
    AVLNode left;
    AVLNode right;
    int heigth;
    int balance;
    AVLNode(int data){
        this.data=data;
        this.heigth=-1;
        this.balance=0;
    }
}

public class AVLTree
{

    public static void heigth(AVLNode r)
    {
        heigth(r.left);
        heigth(r.right)
        r.heigth= Math.max(r.left.heigth, r.right.heigth);
        return;
    }

    public static void balaningFactor(AVLNode r){
        r.balance= r.left.heigth - r.right.heigth;

    }

    public static AVLNode RightRotation(AVLNode r){
        AVLNode temp= new AVLNode(r.left.data);
        // have to consider the cases where apart from the three nodes into consideration, there are more nodes attached.




        return r;


    }

    public static AVLNode LeftRotation(AVLNode r){
        return r;
    }

    public static AVLNode LeftRightRotation(AVLNode r){
        return r;
    }

    public static AVLNode RightLeftRotation(AVLNode r){
        return r;
    }

    public static void main(String[] args){

    }

}
