static int stepPerms(int n) {
        int [] DP = new int[37];
        DP[0] = 0;
        DP[1] = 1;
        DP[2] = 2;
        DP[3] = 4;
        if(n<4) return DP[n];
        for(int i=4;i<=n;i++){
            DP[i] = DP[i-1] + DP[i-2] + DP[i-3];
        }
        return DP[n];
    }
