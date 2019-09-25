static long arrayManipulation(int n, int[][] queries) {
        long A[] = new long[n];
        long D[] = new long[n+1];
        for(int i=0;i<n;i++){
          A[i] = 0;
          D[i] = 0;
        }     
        for(int i=0;i<queries.length;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];

            D[a-1]+=k;
            D[b]-=k;
        }
        long max = 0;
        
        for(int i=0;i<n;i++){
            if(i==0) A[i]=D[i];
          else{
            A[i] = D[i] + A[i-1];
          }
          if(A[i]>max){
            max = A[i];
          }
        }
        return max;
    }
