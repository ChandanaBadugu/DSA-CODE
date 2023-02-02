	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
// 	public static class  Pair{
//     Node root;
//     int level;
//     public  Pair(Node root, int level){
//         this.root=root;
//         this.level=level;
        
//     }
// }
    public static void topView(Node root) {
      if(root==null){
          return;
      }
        
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList();
        
        
      q.add(new Pair(root,0));
        
        while(!q.isEmpty()){
            
            int size = q.size();
            for(int i=0;i<size;i++){
                
                Pair curr = q.poll();
                Node k =curr.root;
                int c = curr.level;
                if(!map.containsKey(c)){
                    map.put(c,k.data);
                }
                if(k.left!=null){
                    q.add(new Pair(k.left,c-1));
                }
                if(k.right!=null){
                    q.add(new Pair(k.right,c+1));
                }
            }
        }
        
        
        for(Map.Entry<Integer,Integer> e: map.entrySet())
            System.out.print(e.getValue()+" ");
    }


public static class  Pair{
    Node root;
    int level;
    public  Pair(Node root, int level){
        this.root=root;
        this.level=level;
        
    }
}
