// com/wyett/util/FourTuple.java

package com.wyett.util;
public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C>{
    public final D forth;
    public FourTuple(A a, B b, C c, D d){
        super(a, b, c);
        forth = d;
    }
    public String toString(){
        return "(" + first +", "+ second +", "+ third +", " + forth +")";
    }
}