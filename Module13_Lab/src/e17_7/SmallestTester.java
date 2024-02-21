package e17_7;

public class SmallestTester
{
   public static void main(String[] args)
   {
      BinarySearchTree names = new BinarySearchTree();
      names.add("Romeo");
      names.add("Juliet");
      names.add("Tom");
      names.add("Dick");
      names.add("Harry");

      System.out.println(names.smallest());
      System.out.println("Expected: Dick");
   }
}
