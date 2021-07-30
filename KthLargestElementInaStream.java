//this is the easiest method i learnt, when i will learn the sorting algorithm i will update this

class KthLargest 
{
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;
    
    public KthLargest(int k, int[] nums) 
    {
        this.k = k;
        for(int i : nums)
        {
            pq.add(i);
            if(pq.size() > k)
                pq.poll();
        }
        
    }
    
    public int add(int val)
    {
        pq.add(val);
        if(pq.size() > k)
            pq.poll();
        return pq.peek();
    }
}
