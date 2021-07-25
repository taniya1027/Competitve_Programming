class Solution 
{
    public int findMin(int[] nums) 
    {
        return findPivot(nums, 0, nums.length - 1);
    
    }
    
    public int findPivot(int[] nums, int low, int high)
    {
        if(nums.length == 1)
        {
            return nums[0];
        }
        
        if(nums[high] > nums[0])
            return nums[0];
        
        int mid = low + (high - low)/2;
        
        if(mid < high && nums[mid] > nums[mid + 1])
            return nums[mid + 1];
        
        if(mid > low && nums[mid] < nums[mid - 1])
            return nums[mid];
        
        if(nums[low] >= nums[mid])
            return findPivot(nums, low, mid - 1);
        else
            return findPivot(nums, mid + 1, high);
        
        
    }
}
