class Solution {
    public boolean search(int[] nums, int target) {
        // int low = 0;
        // int high = nums.length-1;
        // while(low <= high){
        //     int mid = (low + high) >>1;
        //     if(nums[mid] == target) return true;
        //     if(nums[low] == target) return true;
        //     if(nums[high] == target) return true;

        //     if(target < nums[mid]){
        //         if(low <= mid){
        //             int l = low;
        //             int r = mid;
        //             while(l < r){
        //                 if(nums[l] == target) return true;
        //                 if(nums[r] == target) return true;
        //             }
        //         }
                
        //     }else low = mid+1;
        // }
        // return false;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) return true;
        }
        return false;
    }
}