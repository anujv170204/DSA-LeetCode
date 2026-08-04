class Solution {
    public long time(int[] piles, int h){
        long th = 0;
        for(int i = 0; i < piles.length; i++){
            // th += (int)Math.ceil((float)piles[i]/(float)h);
            th += (piles[i] + h - 1) / h;
        }
        return th;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i: piles){
            if(i > max) max = i;
        }
        int left = 1;
        int right = max;
        int ans = max;
        while(left <= right){
            int mid = left+ (right-left)/2;
            long reqTime = time(piles, mid);
            if(reqTime <= h){
                ans = mid;
                right = mid-1;
            }else left = mid+1;
        }
        return ans;
    }
}