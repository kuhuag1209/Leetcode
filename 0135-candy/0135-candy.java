class Solution {
    public int candy(int[] ratings) {
         int n = ratings.length;
          int[] candies = new int[n];
          Arrays.fill(candies , 1 );

          for(int i = 1 ; i< ratings.length ; i++){
              if( ratings[i] > ratings[i-1]){
                  candies[i] = candies[i-1] + 1 ; 
              } 
          }

         for( int i = n-2 ; i >= 0 ; i--){
             if(ratings[i] > ratings[i+1]){
                   candies[i] = Math.max(candies[i] , candies[i+1] +1 );
             }
         }

         int totalCandy = 0 ;
          for( int i =0 ; i < candies.length ; i++){
               totalCandy += candies[i];
          } 

          return totalCandy;
    }
}