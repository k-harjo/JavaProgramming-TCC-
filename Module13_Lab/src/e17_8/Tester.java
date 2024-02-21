package e17_8;

public class Tester
{
   public static void main(String[] args)
   {
      BinarySearchTree tree = new BinarySearchTree();
      tree.add("Apple");
      tree.add("Banana");
      tree.add("Cherry");

      tree.inorder(data -> System.out.println(data));
   }
}
