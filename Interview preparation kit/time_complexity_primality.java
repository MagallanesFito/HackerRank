static String primality(int n) {
        if(n==2) return "Prime";
        if(n%2 == 0 || n==1) return "Not prime";
        for(int i=3;i<=(int)Math.sqrt(n);i+=2){
            if(n%i==0) return "Not prime";
        }
        return "Prime";
    }
