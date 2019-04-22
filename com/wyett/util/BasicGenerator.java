// com/wyett/util/BasicGenerator.java

package com.wyett.util;

public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;
    public BasicGenerator(Class<T> type){ this.type = type; }
    public T next() {
        try{
            return type.newInstance();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}

//适用的类包含两个特征
//必须声明为public
//必须具有默认的构造器(无参构造器)

