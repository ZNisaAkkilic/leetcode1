package org.example;

public class kaydırma {
    public void rotate(int [] nums, int k){
        k=k%nums.length; // diyelim 11 eleman var 10a göre mod olsak dah hızlı olur
        for(int i=0; i<k; i++){
            int tmp=nums[nums.length-1]; // geçiçi elemanın içnde saklama
            for(int j=nums.length-1; j>0; j--){ // 12345 5 uzunluğu 5-1=4indeksi
 nums[j]=nums[j-1];//kaydırms işlemi


            }
            nums[0]=tmp;

        }
    }
}
