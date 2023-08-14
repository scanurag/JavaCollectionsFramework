package Tree;
import java.util.Queue;
import java.util.LinkedList;
class Node {
    int key;
    Node left;
    Node right;
	public Node rigth;
Node( int key) {
        this.key = key;
    }
}
class LevelOrder {
    Node root = null;
    private int count = 0;
    private boolean flag;
    public boolean add(int k) {
        flag = true;
        root = addNode(root, k);
        return flag;
    }
private Node addNode(Node n, int k) {
        if (n == null) {
            n = new Node(k);
            count++;
            return n;
        }
        if (k < n.key) {
            n.left = addNode(n.left, k);
        } else if ( k >n.key) {
            n.right = addNode(n.right, k);
        } else {
            flag = false;
        }
        return n;
    }
//*****************************LEVEL ORDER**************************************
public void levelOrder() {
	Queue<Node> q=new LinkedList<>();
	if(root!=null) q.add(root);
	while(!q.isEmpty()) {
		Node curr=q.poll();
		System.out.println(" "+curr.key);
		if(curr.left!=null) q.add(curr.left);
		if(curr.right!=null) q.add(curr.right);
	}
	System.out.println();
}
//******************************POST ORDER*****************************************

public void postOrder()
{
	postOrderTraverse(root);
}
private void postOrderTraverse(Node n) {
	if(n==null) return;
	postOrderTraverse(n.left);
	postOrderTraverse(n.right);
	System.out.println(n.key);
	
}
//******************************IN ORDER**********************************************
public void inOrder() {
	inOrderTraverse(root);
}
private void inOrderTraverse(Node n) {
	if(n==null) return;
	inOrderTraverse(n.left);
	System.out.println(n.key);
	inOrderTraverse(n.right);
}
//********************************PER ORDER********************************************
public void perOrder() {
	perOrderTraverse(root);
}
public void perOrderTraverse(Node n) {
	if(n==null) return;
	System.out.println(n.key);
	perOrderTraverse(n.left);
	perOrderTraverse(n.right);	
}
public int maxDepth(Node root) {
    if (root == null) {
        return 0;
    }

    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);

    return 1 + Math.max(leftDepth, rightDepth);
}

}
public class LevelOrderTraverse {
    public static void main(String[] args) {
        // Create a new instance of the binary search tree and add some elements to it.
        LevelOrder levelOrderTree = new LevelOrder();
        levelOrderTree.add(50);
        levelOrderTree.add(25);
        levelOrderTree.add(80);
        levelOrderTree.add(10);
        levelOrderTree.add(30);
        levelOrderTree.add(60);
        levelOrderTree.add(90);
        levelOrderTree.levelOrder();
        int maxDepth = levelOrderTree.maxDepth(levelOrderTree.root);
        System.out.println("Maximum Depth of the Tree: " + maxDepth);

        // Perform level-order traversal and print the elements of the tree.
    }
}
