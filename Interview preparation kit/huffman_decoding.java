void decode(String s, Node root) {
        String finalString = "";
        Node actualNode = root;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                actualNode = actualNode.left;
            }
            else{
                actualNode = actualNode.right;
            }
            //Si se llego a una hoja, vuele a la raiz
            if(actualNode.left == null && actualNode.right == null){
                System.out.print(actualNode.data);
                actualNode = root;
            }
        }
    }
