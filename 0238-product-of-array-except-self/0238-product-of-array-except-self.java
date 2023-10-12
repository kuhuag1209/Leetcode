class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
       int[] productfromstart = new int[n] ;
       int[] productfromend = new int[n];
       int[] result  =  new int[n];
       productfromstart[0] = nums[0];
       for(int i = 1 ; i < n ; i ++){
            productfromstart[i] =   productfromstart[i-1] * nums[i] ;
       }
       productfromend[n-1] = nums[n-1];
       for( int i = n-2 ; i >  0 ; i--){
            productfromend[i] =  productfromend[i+1] * nums[i];
       }

       result[0] = productfromend[1];
       result[n-1] = productfromstart[n-2]; 
        for( int  i =1 ; i <n-1 ; i++){
            result[i] = productfromstart[i-1] * productfromend[i+1];
        } 
        return result;
    }
}