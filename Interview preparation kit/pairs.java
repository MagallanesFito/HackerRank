static boolean binarySearch(int lo,int hi,int [] arr,int k,int num){
        //System.out.println(num);
        while(lo<hi){
            int m = (hi+lo)/2;
            int diff = Math.abs(arr[m]-num);
            if(diff == k){
                //System.out.print(arr[m]+" ");
                return true;
            }
            if(diff<k){
                lo = m+1;
            }
            else{
                hi = m;
            }
        }
        return false;
    }
    static int pairs(int k, int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<n;i++){
            int elem = arr[i];
            if(binarySearch(i+1,n,arr,k,elem)){
                //System.out.println("----"+elem);
                count++;
            }
        }
        return count;
    }
