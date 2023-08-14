package Tree;
class NodeT{
	int key;
	NodeT left;
	NodeT right;
	public NodeT root;
	public NodeT rigth;
	NodeT(int key ){
		this.key=key;
	}
}
class Binery1{
	 NodeT root=null;
	private int count=0;
	private boolean flag=true;
	public boolean add(int k) {
		flag=false;
		root=addNode(root,k);
		return flag;
		
	}
	private NodeT addNode(NodeT n,int k) {
		if(n==null) {
			n=new NodeT(k);
			count++;
			return n;
		}
		if(k<n.key) {
			n.left=addNode(n.left,k);
		}
		else if(k>n.key) {
			n.right=addNode(n.right,k);
		}
		else {
			flag=false;
		}
		return n;
	}
	public int maxDepth(NodeT root) {
		if(root==null) return 0;
		 
		int maxDepth=0;
		int left=maxDepth(root.left);
		int rigth=maxDepth(root.rigth);
		maxDepth=1+Math.max(left,rigth);
		return maxDepth;
	}
}
public class MaxDepth {
	public static void main(String[] args) {
		Binery1 bw=new Binery1();
		bw.add(3);
		bw.add(9);
		bw.add(20);
		bw.add(15);
		bw.add(7);
		int maxDepth = bw.maxDepth(bw.root);
        System.out.println("Maximum Depth of the Tree: " + maxDepth);
	}
	
	

}
