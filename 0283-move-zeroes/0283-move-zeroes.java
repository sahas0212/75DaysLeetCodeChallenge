class Solution {
    public void moveZeroes(int[] nums) {
        // Arrays.sort(nums);
        int n=nums.length,count=0,index=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                count++;
            }
            else{
                arr[index]=nums[i];
                index++;
            }
        }
        for(int i=index+1;i<n;i++)
        {
            arr[i]=0;
        }
        
        for(int i=0;i<n;i++)
        {
            nums[i]=arr[i];
        }
    }
}