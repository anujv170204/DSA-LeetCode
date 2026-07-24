class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        int prev = nums[0];
        for(int i = 1; i< nums.length; i++){
            int curr = nums[i];
            if(prev == curr){
                if(!list.contains(curr)){
                    list.add(nums[i]);
                }
            }
            prev =nums[i];
            
        }
        return list;
    }
}