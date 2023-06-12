package org.example;

import java.util.HashSet;

public class aynıelemanvarmı {
    // 1,2,1 true 1234 false
    public boolean ContainsDuplicate(int [] nums){
        var set= new HashSet<int >();
        foreach(var  i in nums )
        {
            if(set.contains(i))
            {
                return true;
            }
               else {
                   set.add(i);
            }


        }
        return false;

    }
}
