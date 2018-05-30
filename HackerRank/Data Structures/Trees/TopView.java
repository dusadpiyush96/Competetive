	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	void topView(Node root) {
      if(root==null) return;
      topView(root.left);
      System.out.print(root.data +" ");
      x(root.right);
    }

    void x(Node root){
        if(root==null) return;
        System.out.print(root.data +" ");
        x(root.right);
    }