static int find(int x,HashMap<Integer,Integer> parent){
        if(parent.get(x) == x) return x;
        return find(parent.get(x),parent);
    }
    static int union(int x,int y,HashMap<Integer,Integer> parent, HashMap<Integer,Integer> size,int max1) {
        int x_p = find(x,parent);
        int y_p = find(y,parent);
        int max = max1;
        if(x_p != y_p){
            if(size.get(x_p) > size.get(y_p)){
                parent.put(y_p,x_p);
                size.put(x_p, size.get(x_p)+size.get(y_p));
                //size[x_p] += size[y_p];
                if(size.get(x_p) > max) max = size.get(x_p);
            }
            else{
                parent.put(x_p,y_p);
                //parent[x_p] = y_p;
                size.put(y_p, size.get(y_p)+size.get(x_p));
                //size[y_p] += size[x_p];
                if(size.get(y_p) > max) max = size.get(y_p);
            }
            
        }
        return max;
    }
    static int[] maxCircle(int[][] queries) {
        int n = queries.length;
        int [] res = new int[n];
        final int max_size = 1000000;
        //int [] parent = new int[max_size+1];
        //int [] size = new int[max_size+1];
        HashMap<Integer,Integer> parent = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> size = new HashMap<Integer,Integer>();
        int max = 1;
        //inicializar
        for(int i=0;i<n;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            parent.put(a, a);
            parent.put(b, b);
            size.put(a, 1);
            size.put(b, 1);
            //int tmp_max = union(a,b,parent,size,max);
            //if(tmp_max > max) max = tmp_max;
            //res[i] = max;
        }
        /*for(int i=1;i<=max_size;i++){
            //parent[i] = i;
            //size[i] = 1;
            parent.put(i,i);
            size.put(i,1);
        }*/
        //System.out.println("bien");
        //return res;
        for(int i=0;i<n;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int tmp_max = union(a,b,parent,size,max);
            if(tmp_max > max) max = tmp_max;
            res[i] = max;
        }
        return res;
    }
