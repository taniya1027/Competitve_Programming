//sorting method, it is not a efficient approach, it takes more than 180ms.

class Solution
{ 
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        System.out.println(Arrays.toString(nums));
        
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != nums[i -1])
            {
                 if(nums[i] == nums[i - 1] + 1)
                 {
                     System.out.println(nums[i]);
                     count++;
                 }
                 else
                 {
                      max = Math.max(count, max);
                     count = 1;
                  }
            
            }
           
           
        }
        return Math.max(count, max);
    }
  
//Efficient solution using hashset
  
  class Solution
{ 
    public int longestConsecutive(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();
            for(int n : nums) {
                set.add(n);
            }
        int best = 0;
        
        for(int n : set)
        {
            if(!set.contains(n - 1))
            {
               int m = n + 1;
            
                while(set.contains(m))
                {
                    m++;
                }
                best = Math.max(best, m - n);
            }
        }
        return best;
    }
    
}

}
