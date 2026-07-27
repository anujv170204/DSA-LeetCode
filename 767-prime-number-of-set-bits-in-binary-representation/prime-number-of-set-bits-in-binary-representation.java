class Solution {
    public boolean prime(int n){
        if(n <= 1) return false;
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for(int i = left ; i <= right; i++){
            int j = i;
            int sum = 0;
            while(j > 0){
                if((j&1) != 0) sum++;
                j = j>>1;
            }
            if(prime(sum)){
                res++;
            }
        }
        return res;
    }
}