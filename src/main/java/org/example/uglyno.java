package org.example;

public class uglyno {
    // asal 8= 2*2*2 sayının asal çar bakmak sadece 23 5 olması
    public boolean isUgly(int num ){
        for (int i=2; i<6&&num>0; i++){
            while (num%i==0)     // sayının 2 ye kalnı 0sa tamsa
                num/=i;// bölene kadar gitsin sayı bölünebilceği kadar gitcke


        }
             if(num==1)
                 return true;
             return false;

    }
}
