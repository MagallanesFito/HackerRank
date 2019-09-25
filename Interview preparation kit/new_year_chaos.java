static void minimumBribes(int[] q){
        int res = 0;
        for(int i=q.length-1;i>=0;i--){
        if(q[i]-(i+1)>2){
            System.out.println("Too chaotic");
            return;
        }
        int start= 0;
        if(q[i]-2>0)start = q[i]-2;
            for(int j=start;j<i;j++){
                if(q[j]>q[i])res++;
            }
        }
        System.out.println(res);
    }
