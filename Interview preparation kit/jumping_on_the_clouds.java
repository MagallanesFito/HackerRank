static int jumpingOnClouds(int[] c) {
        int saltos = 0;
        int i=0;
        int n=c.length;
        while(i!=n-1){
            if(i+2<n && c[i+2] ==0)i+=2;
            else i++;
            saltos++;
        }
        return saltos;

    }
