public class MaximumSubarray {
    // -2 2 5 -11 6 caryysum -2, 2, 5, 5,6 maxsum -2,2,5,5,6 maxlada carryi karşılaşrırıp maxa yazıyoz  o elemana före daha mı büyük mesela -2+2=0 ve 0<5 olduğu için 5 yazdık ama
    // -11 yazmadık çünkü küçük ve 5 yazdık tekrarladk uymadığı için buna kadane alg denşr
     public int MaxSubArray(int [] nums){
         var carrSum=nums[0]; // ilk elemanı atadık
         var maxSum=nums[0];
         for(var i=1; i<nums.length; i++) {// ikinci el başlayarak bütün eleamları tarıcağız.
           //  curSum= Math.max(nums[i], nums[i] +currySum);//curysumı(zaten o ana gelen toplamı eklediğimde mi daha büyük eleman elde ediyorum yoksa o elemanı bu toplamdan daha mı büyük
             maxSum=Math.max(maxSum,carrSum);


         }
         return maxSum;
     }


}
