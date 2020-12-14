class Solution {
    public int[] productExceptSelf(int[] nums) {
      //initialise

      int []left=new int[nums.length];
      int product=1;
      for(int i=0;i<nums.length;i++){
        left[i]=product;
        product=product*nums[i];
      }
      product= 1;
      for(int i=nums.length-1;i>=0;i--){
        left[i]=left[i]*product;
        product=nums[i]*product;
      }
      return left;                 
                         
   }
}
