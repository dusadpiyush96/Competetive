	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	// Write your code here.
        int hl=0;
        int hr=0;
        if(root==null) return 0;
        if(root.left!=null) hl=1+height(root.left);
        if(root.right!=null) hr=1+height(root.right);
        return Math.max(hl,hr);
    }