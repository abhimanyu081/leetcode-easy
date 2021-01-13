class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        
        int n = nums.length;
        
        int[] prefixSum = new int[n];
        
        int preSum=0;
        for(int i=0;i<n;i++){
            preSum=preSum+nums[i];
            prefixSum[i]=preSum;
        }
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int currSum=0;
                if(i==0){
                    currSum=prefixSum[j];
                }else{
                    
                    currSum=prefixSum[j]-prefixSum[i-1];
                    
                }
                
                if(currSum==k){
                    count++;
                }
                
                
            }
        }
       
        return count;
    }
}
