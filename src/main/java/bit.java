public class bit {
    public int HammingWeight(int n ){
        var oneCount=0;
        while(n >0){
            var lastBit=n&1;
            oneCount+= (int)lastBit;
            n= n>>1;
        }
        return oneCount;
    }
}
