public static int height(Node root) {
        if(root == null){
            return -1;
        }
        else{
            int hl = height(root.left);
            int hr = height(root.right);
            if(hl>hr){
                return 1+hl;
            }
            else{
                return 1+hr;
            }
        }
    }
