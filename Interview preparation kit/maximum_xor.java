class TrieNode {
    //public static int ALPHABET_SIZE = 26;
    //left y right
    TrieNode[] children = new TrieNode[2];
    
    public void add_(int s,int bits){
        add(s,bits-1);
    }
    public TrieNode getNode(int pos){
        return children[pos];
    }
    public void setNode(int pos,TrieNode node){
        children[pos] = node;
    }
    public void add(int s,int shift){
        if(shift <0) return;
        //El ultimo numero de izq a derecha (0 o 1)
        int current = s&(1<<shift);
        if(current>0) current = 1;
        TrieNode child = getNode(current);
        if(child == null){
            child = new TrieNode();
            setNode(current,child);
        }
        child.add(s,shift-1);
    }
    // s ya esta procesado
    public int findCount(int original,int s,int shift,int init){
        if(shift<0){
            //System.out.println("init:"+init);
            //System.out.println("init:"+init);
            int res = original^init;
            return res;
        }
        int current = s&(1<<shift);
        
        //System.out.println(current+":current");
        if(current>0) current = 1;
        //System.out.println("current:"+current);
        TrieNode child = getNode(current);
        //Si no encontro en la posicion que se queria, busca en el otro lado
        if(child == null){
            child = getNode(1-current);
            current = 1-current;
        }
        if(child == null)return 0;
        int a = (init<<1)|current;
        //System.out.println("a:"+a);
        return child.findCount(original,s, shift-1,a);
    }
}
public class Solution {

    // Complete the maxXor function below.
    static int getMask(int bits){
        int a  = 1;
        for(int i=0;i<bits-1;i++){
            a = (a<<1)|1;
        }
        return a;
    }
    static int[] maxXor(int[] arr, int[] queries) {
        int n = queries.length;
        int [] result = new int[n];
        TrieNode root = new TrieNode();
        int maxbits = 0;
        
        maxbits = 31;
        for(int a:arr){
            root.add_(a,maxbits);
        }
        
        
        for(int i=0;i<n;i++){
            //Con los bits volteados y a 31 bits
            //System.out.println("finale:"+getMask(maxbits));
            int finale = ~queries[i]&getMask(maxbits);
            //System.out.println("f:"+finale);
            result[i] = root.findCount(queries[i],finale,maxbits-1, 0);
        }
        
        return result;
    }
}
