static long repeatedString(String s, long n) {
        long result;
        int numa = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a') numa++;
        }
        result = n/s.length()*numa;
        long substr = n%s.length();
        for(int i=0;i<substr;i++){
            if(s.charAt(i) == 'a') result++;
        }
        return result;
    }
