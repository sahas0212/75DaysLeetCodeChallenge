class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
             while (count < nums[i]) {
                list.add(count);
                count++;
            }
            if(nums[i]==count)
            {
                count++;
                
            }
         
        }
         while (count <= nums.length) {
                list.add(count);
                count++;
            }
        return list;
    }
}