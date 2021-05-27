class Node{
	int key;
	Node left, right;
	Node(int k){
		key=k;
	}
}

class main{
	Node root;
	void inorder(Node n){
		if(n!=null){
			inorder(n.left);
			System.out.println(n.key+" ");
			inorder(n.right);
		}
	}

	void preorder(Node n){
		if(n!=null){
			System.out.println(n.key+" ");
			inorder(n.left);
			inorder(n.right);
		}
	}

	void postorder(Node n){
		if(n!=null){
			inorder(n.left);
			inorder(n.right);
			System.out.println(n.key+" ");
		}
	}

	void inorder(){
		inorder(root);
	}
	void preorder(){
		preorder(root);
	}
	void postorder(){
		postorder(root);
	}

	public static void main(String[] args){
		main tree = new main();
		tree.root= new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		System.out.println("The in-order traversal is:");
		tree.inorder();
		System.out.println("The pre-order traversal is:");
		tree.preorder();
		System.out.println("The post-order traversal is:");
		tree.postorder();

	}
}