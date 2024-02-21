package e17_8;

/**
Reimplement the addNode method of the Node class
in BinarySearchTree (from Section 16.3, below)
as a static method of the BinarySearchTree class:

   private static Node addNode(Node parent, Node newNode)

If parent is null, return newNode. Otherwise, recursively
add newNode to parent and return parent. Your implementation
should replace the three null checks in the add and original
addNode methods with just one null check.
Note: this means you'll need to modify the add() method
of the BinarySearchTree as well.
*/
@SuppressWarnings("unchecked")
public class BinarySearchTree
	{
	private Node root;
	
	/**
	   Constructs an empty tree.
	*/
	public BinarySearchTree()
	{
	   root = null;
	}
	
	/**
	   Inserts a new node into the tree.
	   @param obj the object to insert
	*/
	public void add(Comparable obj)
	{
	   Node newNode = new Node();
	   newNode.data = obj;
	   newNode.left = null;
	   newNode.right = null;
	   Node.addNode(root, newNode); 
	}
	
	/**
	   Tries to find an object in the tree.
	   @param obj the object to find
	   @return true if the object is contained in the tree
	*/
	public boolean find(Comparable obj)
	{
	   Node current = root;
	   while (current != null)
	   {
	      int d = current.data.compareTo(obj);
	      if (d == 0) { return true; }
	      else if (d > 0) { current = current.left; }
	      else { current = current.right; }
	   }
	   return false;
	}
	
	/**
	   Tries to remove an object from the tree. Does nothing
	   if the object is not contained in the tree.
	   @param obj the object to remove
	*/
	public void remove(Comparable obj)
	{
	   // Find node to be removed
	
	   Node toBeRemoved = root;
	   Node parent = null;
	   boolean found = false;
	   while (!found && toBeRemoved != null)
	   {
	      int d = toBeRemoved.data.compareTo(obj);
	      if (d == 0) { found = true; }
	      else
	      {
	         parent = toBeRemoved;
	         if (d > 0) { toBeRemoved = toBeRemoved.left; }
	         else { toBeRemoved = toBeRemoved.right; }
	      }
	   }
	
	   if (!found) { return; }
	
	   // toBeRemoved contains obj
	
	   // If one of the children is empty, use the other
	
	   if (toBeRemoved.left == null || toBeRemoved.right == null)
	   {
	      Node newChild;
	      if (toBeRemoved.left == null)
	      {
	         newChild = toBeRemoved.right;
	      }
	      else
	      {
	         newChild = toBeRemoved.left;
	      }
	
	      if (parent == null) // Found in root
	      {
	         root = newChild;
	      }
	      else if (parent.left == toBeRemoved)
	      {
	         parent.left = newChild;
	      }
	      else
	      {
	         parent.right = newChild;
	      }
	      return;
	   }
	
	   // Neither subtree is empty
	
	   // Find smallest element of the right subtree
	
	   Node smallestParent = toBeRemoved;
	   Node smallest = toBeRemoved.right;
	   while (smallest.left != null)
	   {
	      smallestParent = smallest;
	      smallest = smallest.left;
	   }
	
	   // smallest contains smallest child in right subtree
	
	   // Move contents, unlink child
	
	   toBeRemoved.data = smallest.data;
	   if (smallestParent == toBeRemoved)
	   {
	      smallestParent.right = smallest.right;
	   }
	   else
	   {
	      smallestParent.left = smallest.right;
	   }
	}
	
	/**
	   Prints the contents of the tree in sorted order.
	*/
	public void print()
	{
	   print(root);
	   System.out.println();
	}
	
	/**
	   Prints a node and all of its descendants in sorted order.
	   @param parent the root of the subtree to print
	*/
	private static void print(Node parent)
	{
	   if (parent == null) { return; }
	   print(parent.left);
	   System.out.print(parent.data + " ");
	   print(parent.right);
	}
	public Comparable smallest() {
        if (root == null) {
            return null; // or throw an exception depending on your design
        }
        return smallest(root);
    }

    private static Comparable smallest(Node node) {
        if (node.left == null) {
            return node.data;
        } else {
            return smallest(node.left);
        }
    }
    public interface Visitor {
        void visit(Comparable data);
    }
    
    public void preorder(Visitor v) {
        preorder(root, v);
    }

    private static void preorder(Node node, Visitor v) {
        if (node == null) {
            return;
        }
        v.visit(node.data);
        preorder(node.left, v);
        preorder(node.right, v);
    }

    public void inorder(Visitor v) {
        inorder(root, v);
    }

    private static void inorder(Node node, Visitor v) {
        if (node == null) {
            return;
        }
        inorder(node.left, v);
        v.visit(node.data);
        inorder(node.right, v);
    }

    public void postorder(Visitor v) {
        postorder(root, v);
    }

    private static void postorder(Node node, Visitor v) {
        if (node == null) {
            return;
        }
        postorder(node.left, v);
        postorder(node.right, v);
        v.visit(node.data);
    }

    
	/**
	   A node of a tree stores a data item and references
	   to the left and right child nodes.
	*/
	class Node
	{
	   public Comparable data;
	   public Node left;
	   public Node right;
	
	   /**
	      Inserts a new node as a descendant of this node.
	      @param newNode the node to insert
	   */
	    private static Node addNode(Node parent, Node newNode) {
	        if (parent == null) {
	            return newNode;
	        }
	        int comp = newNode.data.compareTo(parent.data);
	        if (comp < 0) {
	            parent.left = addNode(parent.left, newNode);
	        } else if (comp > 0) {
	            parent.right = addNode(parent.right, newNode);
	        }
	        return parent;
	    }

	    public void add(Comparable obj) {
	        Node newNode = new Node();
	        newNode.data = obj;
	        newNode.left = null;
	        newNode.right = null;
	        root = addNode(root, newNode);
	    
	   }
	}
}




