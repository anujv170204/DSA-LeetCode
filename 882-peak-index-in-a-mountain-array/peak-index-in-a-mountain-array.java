class Solution {
    public int peakIndexInMountainArray(int[] arr) {
    if(arr.length == 1) return 0;
       if(arr[arr.length-1] > arr[arr.length-2]) return arr.length-1;
       if(arr[0] > arr[1]) return 0;

       int left = 1; 
       int right = arr.length-2;

       while(left <= right){
        int mid = left + (right-left)/2;
        if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return mid;

        if(arr[mid] > arr[mid-1]) left = mid+1;
        else if(arr[mid] > arr[mid+1]) right = mid-1;
        else left = mid+1;
       }
       return -1;
    }
}