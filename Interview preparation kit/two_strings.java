static String twoStrings(String s1, String s2) {
        HashMap<Character,Boolean> table = new HashMap<Character,Boolean>();
        for(int i=0;i<s1.length();i++){
            char currChar = s1.charAt(i);
            if(!table.containsKey(currChar)){
                table.put(currChar,true);
            }
        }
        boolean contains = false;
        for(int i=0;i<s2.length();i++){
            char currChar = s2.charAt(i);
            if(table.containsKey(currChar)){
                contains = true;
                break;
            }
        }
        if(contains){
            return "YES";
        }
        return "NO";
    }
