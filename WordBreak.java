//Brute-Force solution or recrusion


class Solution 
{
    public boolean wordBreak(String s, List<String> wordDict) 
    {
        return findWord(0, s, new HashSet<String>(wordDict));
        
    }
    
    public boolean findWord(int start, String s, HashSet set)
    {
        if(start == s.length())
        {
            return true;
        }
        
        for(int i = start + 1; i <= s.length(); i++)
        {
            if(set.contains(s.substring(start, i)) && findWord(i, s, set))
            {
                return true;
            }
        }
        
        return false;
    }
} 


//memoization

class Solution 
{
    public boolean wordBreak(String s, List<String> wordDict) 
    {
        Boolean memo[] = new Boolean[s.length()];
        return findWord(0, s, new HashSet<String>(wordDict), memo);
        
    }
    
    public boolean findWord(int pos, String s, HashSet set, Boolean memo[])
    {
        if(pos == s.length())
        {
            return true;
        }
        
        if(memo[pos] != null)
        {
            return memo[pos];
        }
        
        for(int i = pos + 1; i <= s.length(); i++)
        {
            if(set.contains(s.substring(pos, i)) && findWord(i, s, set, memo))
            {
                return memo[pos] = true;
            }
        }
        
        return memo[pos] = false;
    }
}      