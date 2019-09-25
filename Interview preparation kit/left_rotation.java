static int[] rotLeft(int[] a, int d) {
        int n=a.length;
        int [] D = new int[n];
        for(int i=0;i<n;i++){
            int m = (i-d);
            if(m<0) m+=n;
            int newpos = (m)%n;
            D[newpos] = a[i];
        }
        return D;
    }
