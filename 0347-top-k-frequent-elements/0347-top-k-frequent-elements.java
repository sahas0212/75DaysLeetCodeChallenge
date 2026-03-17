class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;)
        {
            int count=1;
            while(i<n-1 && nums[i]==nums[i+1])
            {
                count++;
                i++;
            }
            map.put(nums[i],count);
            i++;
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue() - a.getValue());
        int res[]=new int[k];
        for(int i=0;i<k;i++)
        {
             res[i] = list.get(i).getKey();
        }
        return res;
    }
}