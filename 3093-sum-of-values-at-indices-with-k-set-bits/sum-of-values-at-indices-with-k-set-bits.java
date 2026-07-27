class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0; 
        int j = 0;
        for(int idx: nums){
            int sum = 0;
            int i = j;
            while(i > 0){
                if((i&1) != 0)sum++;
                i >>= 1;
            }
            if(sum == k) ans += idx;
            j++;
        }
        return ans;
    }
}