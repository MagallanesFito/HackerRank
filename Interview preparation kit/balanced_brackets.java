static String isBalanced(String s) {
        Stack<String> stack = new Stack<String>();
        //int tope = 0;
        String actual;
        String ans = "YES";
        for(int i=0;i<s.length();i++){
            actual = Character.toString(s.charAt(i));
            
            if(actual.equals("(")||actual.equals("[")||actual.equals("{")){
                //System.out.println("aqui");
                //stack[tope++] = actual;
                stack.push(actual);
            }
            else{
                if(stack.isEmpty()) return "NO";
                String top = stack.pop();
                //String top = stack[--tope];
                if(actual.equals(")")){
                    if(!top.equals("(")) {
                        return "NO";
                    }
                }
                if(actual.equals("]")){
                    if(!top.equals("[")) {
                        return "NO";
                    }
                }
                if(actual.equals("}")){
                    if(!top.equals("{")) {
                        return "NO";
                    }
                }
            }
        }
        if(!stack.isEmpty()) ans = "NO";
        return ans;
    }
