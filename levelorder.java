/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node d = q.remove();
            System.out.print(d.data+" ");
            if(d.left!=null){
                q.add(d.left);
            }
             if(d.right != null){
                q.add(d.right);
            }
        } 
      
    }
