class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        Set<Integer> map = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            map.add(nums[i]);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!map.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}