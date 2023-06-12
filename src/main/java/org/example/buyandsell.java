package org.example;

public class buyandsell {
    // 7,1,5,3,6,4 output
    // 5 çünkü 2.gün alıp 4.gün sattığım kar 5 öncealımsonrasatiş
    // 7654321 0 çünkü kar yok
    public int MaxProfit(int [] prices){
        var min= int.MaxValue; // int değeerim maxvalue düşükk olursa o andaki minim deği ona atama yapcam
                        var max =0;// 0 atama yaptım
        for(var i=0; i<prices.length; i++){
            if(prices[i]< min) // o andaki değerindne düşülk mü
            {
                min = prices[i];
            }
            else{
                max=Math.max(max, prices[i]-min);
                // max değ 2 tane değerle karşılaştıryorm 1 tanesi o ana kadar tutuuuğum deper yani max değişkenim diğeriminimi dğeri çıkarttığım dğeer bunalrından hangisi daha büyükse onu atama
            }
        }
        return max;
    }
}
