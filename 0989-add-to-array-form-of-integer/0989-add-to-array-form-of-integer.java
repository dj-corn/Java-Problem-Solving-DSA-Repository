class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = num.length-1;
        for(int i=n; i>=0; i--){
            k += num[i];
            ans.add(0,k%10);
            k /= 10;
        }
        while(k>0){
            ans.add(0,k%10);
            k /= 10;
        }
        return ans;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        // ---- INT OVERFLOW ----
        // ---- INT OVERFLOW ----
        
        // int digit = 0;
        // for(int i=0; i<num.length-1; i++){
        //     digit += num[i];
        //     digit  *= 10;
        // }
        // digit += num[num.length-1];
        // System.out.print(digit);
        // digit += k;
        // k=0;
        // while(digit > 0){gffg
        //     k = digit%10;
        //     ans.add(0,k);
        //     digit /= 10;
        // } 
        // return ans;
    }
}