class NodeList{
    int id;
    int daysToDie;
    public NodeList(int id,int daystodie){
        this.id = id;
        this.daysToDie = daystodie;
    }
}
public class Solution {

    // Complete the poisonousPlants function below.
    static int max(int a,int b){
        if(a>b) return a;
        return b;
    }
    static int poisonousPlants(int[] p) {
        Stack<NodeList> s = new Stack<>();
        s.push(new NodeList(0,-1));
        int maxdays = -1;
        int n = p.length;
        
        for(int i=1;i<n;i++){
            int daysToDie = 1;
            while(!s.isEmpty()){
                if(p[s.peek().id]>=p[i]){
                    daysToDie = max(daysToDie,s.peek().daysToDie+1);
                    s.pop();
                }
                else{
                 break;
                }
            }
            if(s.isEmpty()){
                daysToDie = -1;
            }
            
            maxdays = max(maxdays,daysToDie);
            s.push(new NodeList(i,daysToDie));
        }
        if(maxdays<0) return 0;
        return maxdays;
    }
}
