class Solution 
{
    public List<Integer> getRow(int rowIndex)
    {
        Integer arr[] = new Integer[rowIndex + 1];
        Arrays.fill(arr, 1); 
        for(int i = 1; i < rowIndex; i++)
        {
            for(int j = i ; j > 0; j--)
            {
                arr[j] = arr[j] + arr[j - 1];
            }
         
        }
        
        return Arrays.asList(arr);
        
    }
}
