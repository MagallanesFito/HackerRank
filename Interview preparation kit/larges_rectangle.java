static long largestRectangle(int[] h) {
        
        
        int i=0;
        int n=h.length;
        long maxarea = 0;
        long tmp_area = 0;
        Stack<Integer> stack = new Stack<Integer>();
        while(i<n){
            if(stack.isEmpty() || h[i]>=h[stack.peek()]){
                stack.push(i++);
            }
            else{
                int tmp = stack.pop();
                /*if(stack.isEmpty()){
                    tmp_area = h[tmp]*i;
                }
                else{*/
                    tmp_area = h[tmp]*(stack.isEmpty()? i :i-stack.peek()-1);
                    if(tmp_area > maxarea) maxarea = tmp_area;
                /*}*/
                
            }
        }
        while(!stack.isEmpty()){
            int tmp = stack.pop();
                /*if(stack.isEmpty()){
                    tmp_area = h[tmp]*i;
                }
                else{*/
                    tmp_area = h[tmp]*(stack.isEmpty()? i :i-stack.peek()-1);
                    if(tmp_area > maxarea) maxarea = tmp_area;
               /* }*/
                
        }
        return maxarea;
    }

