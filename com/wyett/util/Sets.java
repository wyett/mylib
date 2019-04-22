//: com/wyett/util/Sets.java
package com.wyett.util;
import java.util.*;

public class Sets {
    //并集
    public static <T> Set<T> union(Set<T> a, Set<T> b){
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }
    //交集
    public static <T>
    Set<T> intersection(Set<T> a, Set<T> b){
        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }
    //从superset中移除subset的元素
    public static <T> Set<T>
    difference(Set<T> superset, Set<T> subset){
        Set<T> result = new HashSet<T>(superset);
        result.removeAll(subset);
        return result;
    }
    //从并集中移除交集
    public static <T> Set<T> complement(Set<T> a, Set<T> b){
        return difference(union(a, b), intersection(a, b));
    }
}

