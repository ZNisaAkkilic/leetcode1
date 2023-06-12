package org.example;

public class palindromeno {
    public  boolean  IsPalindrome(int x){
        if(x==0)
            return true;
        if(x<0 || x%10==0)
            return false;

        var reverse =0;
        while(x > reverse){
            var lastDigit=x %10;
            x /=10;
            reverse=reverse*10 +lastDigit;

        }
       if(x== reverse || x== reverse/10)
       {
           return true;
       }
       else {
           return false;

       }

    }


}
