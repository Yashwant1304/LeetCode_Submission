class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        int zeroCount=0;
        int product = 1;
        for(int i = 0; i < nums.length; i++){
              if(nums[i]==0){
                zeroCount++;
              }

               product = product * nums[i];

             if(zeroCount ==2){
                break;
             }
        }

      if(zeroCount==2 ){
        for(int i =  0 ; i<nums.length;i++){
            result[i]=0;
        }
        return result;
      }

      if(zeroCount==1){
         int zeroPosition =0;
         int nonZeroProduct= 1;
        
        for(int i=0 ; i < nums.length;i++){
           if(nums[i]!=0){
            result[i]=0;
            nonZeroProduct= nonZeroProduct * nums[i];
           }else{
               zeroPosition= i;
           }
        }

        result[zeroPosition]=nonZeroProduct;

        return result;
      }


      for(int i =0 ; i <nums.length; i++){
        result[i]= product/nums[i];
      }
     return result;
       
    }
}  
