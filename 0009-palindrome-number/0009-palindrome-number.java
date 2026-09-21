class Solution {
    public boolean isPalindrome(int x){ 
      int rev = 0;
      int dup = x; 
      while(x >  0){
        int digits = x%10;
        rev = rev * 10 + digits;
        x = x/10;
      }
      return dup == rev;
    }
}