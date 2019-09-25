 public static Node lca(Node root, int v1, int v2) {
          // Write your code here.
        if(v1>v2){
            int tmp = v1;
            v1 = v2;
            v2 = tmp;
        }
        if(v1 <= root.data && v2>=root.data){
            return root;
        }
        else{
            if(v1<= root.data && v2<=root.data && root.left != null){
                return lca(root.left,v1,v2);
            }
            else{
                if(root.right != null) return lca(root.right,v1,v2);
                
            }
        }
        return root;
    }
