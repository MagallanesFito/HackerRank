static int minimumSwaps(int[] arr) {
        int n = arr.length;
        int sum = 0;
        boolean [] visited = new boolean[n];
        int vis,index;
        for(int i=0;i<n;i++){
            visited[i] = false;
        }
        for(int i=0;i<n;i++){
            index = i;
            vis = 0;
            if(!visited[index]){
                while(!visited[index]){
                visited[index] = true;
                index = arr[index] -1;
                vis++;
            }
            vis--;
            }
            sum+=vis;
        }
        return sum;
    }
