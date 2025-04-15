class Solution {
    public boolean isPalindrome(int x) {
        // int temp = x;
        int res = x;
        int sum = 0;
        while(x >0){
            int temp = x % 10;
            x = x/10 ;
            sum = sum * 10 + temp;
        }
        return sum == res ? true : false;
    
    }
}