import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Tree {

    int data;
    Tree left;
    Tree right;

    Tree(int data){
        this.data = data;
        left = null;
        right = null;
    }



    public void recursiveInorder(Tree node,List<Integer> arr){

        if(node==null){
            return ;
        }

        recursiveInorder(node.left,arr);
        arr.add(node.data);
        recursiveInorder(node.right, arr);

    }
    public static List<Integer> iterativeInorder(Tree root){

        List<Integer> arr = new ArrayList<>();
        Stack<Tree> st = new Stack<>();
        Tree node = root;

        while(true){

            if(node!=null){
                st.push(node);
                node = node.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                arr.add(node.data);
                node = node.right;
            }
            
        }
        return arr;

    }

    public void recursivePreorder(Tree node ,List<Integer> arr){

        if(node==null){
            return ;
        }
        arr.add(node.data);
        recursivePreorder(node.left, arr);
        recursivePreorder(node.right, arr);
    }

    public static List<Integer> iterativePreorder(Tree root){

        List<Integer> arr = new ArrayList<>();
        Stack<Tree> st = new Stack<>();
        Tree node = root;

        while(node != null || !st.isEmpty()){
            if(node!=null){
                arr.add(node.data);
                st.push(node);
                node = node.left;
            }
            else{
                
                    node = st.pop();
                    node = node.right;
                
            }

        }
        return arr;
    }

    public static List<Integer> iterativePreorderBetter(Tree root){

        List<Integer> arr = new ArrayList<>();
        Stack<Tree> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
           Tree node = st.pop();
           arr.add(node.data);

           if(node.right!=null){
            st.push(node.right);
           }
           if(node.left!=null){
            st.push(node.left);
           }
           

        }
        return arr;
    }

    public void recursivePostorder(Tree node ,List<Integer> arr){

        if(node==null){
            return ;
        }
        recursivePostorder(node.left, arr);
        recursivePostorder(node.right, arr);
        arr.add(node.data);
    }

    public static List<Integer> iterativePostorder(Tree root){


        List<Integer> arr = new ArrayList<>();
        if(root==null){
            return arr;
        }
        Stack<Tree> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){

            Tree node = st.pop();
            arr.add(node.data);

            if(node.left!=null) st.push(node.left);
            
            if(node.right!=null) st.push(node.right);

           
        }
        Collections.reverse(arr);
        return arr;
    }

    public static void recursiveLevelOrder(Tree node, List<Integer> arr){

       Queue<Tree> qe =  new LinkedList<>();
    }


    public static int countNodes(Tree node){

        int x,y;

        if(node !=null){

            x = countNodes(node.left);
            y = countNodes(node.right);
            return x+y+1;
        }
        return 0;
    }

    public static int countNodesWithDegreeTwo(Tree node) {

        int x, y;

        if (node != null) {
            x = countNodesWithDegreeTwo(node.left);
            y = countNodesWithDegreeTwo(node.right);

            if (node.left != null && node.right != null) {
                return x + y + 1;
            } else {
                return x + y;
            }
        }
        return 0;

    }

    public static int hightOfTree(Tree node) {

        int x, y;

        if (node != null) {
            x = hightOfTree(node.left);
            y = hightOfTree(node.right);

            if (x>y) {
                return x+ 1;
            } else {
                return y+1;
            }
        }
        return 0;

    }
   
    




    public static void main(String[] args) {

        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        System.out.println(hightOfTree(root));

        List<Integer> arr = new ArrayList<>();
        recursiveLevelOrder(root, arr);
        System.out.println(root);


        // System.out.println(iterativeInorder(root));
        // System.out.println(iterativePostorder(root));
        
        

        // List<Integer> retsul = new ArrayList<>();
        // root.recursivePreorder(root, retsul);
        // root.recursivePostorder(root,retsul);
        // root.recursiveInorder(root, retsul);
        // System.out.println("Inorder Traversal: " + retsul);
        // System.out.println("PreeOrder Traversal: " + retsul);
        // System.out.println("Postorder Traversal: "+ retsul);
        
    }
    
}
