//Sliding Window question

class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        if(s2.length() < s1.length())
            return false;
        
        int count = s1.length();
        
        int right = 0;
        int left = 0;
        
        int hash[] = new int[256];
        
        for(char c : s1.toCharArray())
        {
            hash[c]++;
        }
        
        while(right < s2.length())
        {
            if(hash[s2.charAt(right)] >= 1)
                count--;
            
            hash[s2.charAt(right)]--;
            right++;
            
            if(count == 0)
                return true;
            
            while(right - left == s1.length())
            {
                if(hash[s2.charAt(left)] >= 0)
                {
                    count++;
                }
                
                hash[s2.charAt(left)]++;
                left++;
            }
        }
        
        return false;
    }
