//It is really a good question
class Solution 
{
    public boolean canPartition(int[] nums)
    {
        int total = 0;
        for(int i : nums)
        {
            total += i;
        }
        
        if(total % 2 != 0)
            return false;
        
        HashMap<String, Boolean> map = new HashMap<>();
        return canPartition(nums, total, 0, 0, map);
    }
    
    public boolean canPartition(int[] nums, int total,int sum, int index, HashMap<String, Boolean> map)
    {
        String curr = index + " " + sum;
        
        if(map.containsKey(curr))
            return map.get(curr);
        
        if(sum*2 == total)
            return true;
        
        if(sum > total || index >= nums.length)
            return false;
        
        boolean found = canPartition(nums, total, sum, index + 1, map) || canPartition(nums, total, sum + nums[index], index + 1, map);
        
        map.put(curr, found);
        
        return found;
    }
}
