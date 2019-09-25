static long[] riddle(long[] arr){
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        long [] res = new long[n+1];
        long[] left = new long[n+1];
        long[] right = new long[n+1];
        
        for(int i=0;i<n;i++){
            left[i] = -1;
            right[i] = n;
        }
        
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                left[i] = s.peek();
            }
            s.push(i);
        }
        while(!s.empty()) s.pop();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                right[i] = s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<=n;i++){
            res[i] =0;
        }
        for(int i=0;i<n;i++){
            int len = (int)(right[i]-left[i]-1);
            res[len] = Math.max(res[len], arr[i]);
        }
        long[] res2 = new long[n];
        for(int i=n-1;i>=1;i--){
            res[i] = Math.max(res[i],res[i+1]);
        }
        for(int i=1;i<=n;i++){
            res2[i-1] = res[i];
        }
        return res2;
    }
