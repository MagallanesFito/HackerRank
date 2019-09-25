 static int hourglassSum(int[][] arr) {
        int res = -999999;
        
        int n = arr.length;
        int m = arr[0].length;
        int besti = 0;
        int bestj = 0;
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                
                    int hor = arr[i][j]+arr[i+1][j]+arr[i-1][j]+arr[i+1][j-1]+arr[i+1][j+1]+arr[i-1][j-1]+arr[i-1][j+1];
                    if(hor > res){
                        
                        res = hor;
                        besti = i;
                        bestj = j;
                    }
                
                
            }
        }
        
        return res;
    }
