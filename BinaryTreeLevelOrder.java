import java.util.*;




public class Main


{
  
  public static void main(String[] args)
  
 
  {
   
   BinaryTree  b= new BinaryTree();
  
  

  
 BinaryTree.Node n1 = new BinaryTree.node(20);
   
   BinaryTree.Node n2 = new BinaryTree.node(56);
   
   BinaryTree.Node n3 = new BinaryTree.node(89);
     
   BinaryTree.node n4 = new BinaryTree.node(34);
    
   BinaryTree.node n5 = new BinaryTree.node(90);
 
     
  
    n1.left = n2;
   
    n1.right = n3;
   
    n2.left = n4;
   
    n3.right = n5;
      
 
    b.root = n1;

    

      
   
  }


}








////////////////////////////////////////////////////////////



import java.util.*;

public class BinaryTree
 {
  
public static class Node
{
  
  public int data;
    
public Node left;
    
public Node right;
    
    
public Node(int value)
{

      data=value;
    
}

  }
public Node root;  
  
  
public void printLevelOrder()
{

    ArrayList<Node> list=new ArrayList<>();
    
list.add(root);

    while(list.size()>0)
{
 
     Node node = list.remove(0);
      
System.out.print(node.data+" ");
      
if(node.left!=null)
{
 
       list.add(node.left);
      
}
      
if(node.right!=null)
{
        

list.add(node.right);
      
}
    
}
  
}


}
