class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set <Integer> visited = new HashSet <>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(visited.contains(nums[i])){
                return true;
            }
            else
            {
                visited.add(nums[i]);
            }
        }
        return false;
    }
}