static int sockMerchant(int n, int[] ar) {
        int res = 0;
        int [] freq = new int[101];
        for(int a:ar){
            freq[a]++;
        } 
        for(int f:freq){
            res+=(f/2);
        }
        return res;
    }
