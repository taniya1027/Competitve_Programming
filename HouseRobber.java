class Solution 
{
    public int rob(int[] nums) 
    {
        int memo[] = new int[nums.length + 1];
        Arrays.fill(memo, -1);
       return rob(nums, nums.length - 1, memo);
    }
    
    public int rob(int[] nums, int i,int memo[])
    {
        if(i < 0)
        {
            return 0;
        }
        
        if(memo[i] >= 0)
        {
            return memo[i];
            
        }
        
        int result = Math.max(rob(nums, i - 2, memo) + nums[i] , rob(nums, i - 1, memo));
        memo[i] = result;
        
        return result;
        
    }
   
}
