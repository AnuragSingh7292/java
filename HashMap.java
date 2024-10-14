class Solution {
    public int findLucky(int[] arr) 
    {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i<arr.length; i++)
        {
            int val = arr[i];
            if(hm.containsKey(val) == true)
            {
                hm.put(val,hm.get(val)+1);
            }else
            {
                hm.put(val,1);
            }
        }

        int ans = -1;
        for(int key : hm.keySet())
        {
            if(hm.get(key) == key)
            ans = Math.max(ans,key);
        }

        return ans;
    }
}