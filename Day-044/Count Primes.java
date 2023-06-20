// Link to problem: https://leetcode.com/problems/count-primes/description/
class Solution {
    public int countPrimes(int n) {
      boolean[] arr = new boolean[n+1];
      for(int i = 2 ; i<n ; i++){
          arr[i] = true;
      }
      for(int i = 2; i*i<= n ; i++){
          if(arr[i]){
              for(int j = i*i ; j<=n ; j=j+i){
                  arr[j] = false;
              }
          }
      }
      int c = 0;
      for(int i = 0 ; i<= n ; i++){
          if(arr[i]) c++;
      }
      return c;
    }
}
