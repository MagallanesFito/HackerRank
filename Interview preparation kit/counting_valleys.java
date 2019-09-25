static int countingValleys(int n, String s) {
        int valleys = 0;
        boolean negativo = false;
        int cuenta = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'U'){
                cuenta++;
                if(cuenta == 0) valleys++;
            }
            else cuenta--;
        }
        return valleys;

    }
