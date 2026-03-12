class Solution {
    public int[] twoSum(int[] nums, int target) {
                int n=nums.length;
        HashMap<Integer,Integer> res= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int sub=target-nums[i];
            if(res.containsKey(sub))
            {
                int n1=res.get(sub);
                return new int[] {n1,i};
            }
            else
            res.put(nums[i],i);
        }
         return new int[] {};
    }
}