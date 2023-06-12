public class Solution2 {
    public int MaxArea(int [] height){
        var max= int.MinValue;
        for (var i=0; i<height.length; i++){
            for(var j= i+1; j< height.length; j++){
                var min= Math.min(height[i] , height[j]);
                max= Math.max(max , min *(j-i));

            }
        }
        return max;
    }

}
