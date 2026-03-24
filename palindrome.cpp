// palindrome number
class Solution {
public:
    bool isPalindrome(int x)
     {
        long rev=0;
        long dept=x;
        while(x>0){
            int ld=x%10;
            x=x/10;
            rev=rev*10+ld;
        
        }
        if(dept==rev){
            return true;
        }else{
            return false;
        }
    }
};
