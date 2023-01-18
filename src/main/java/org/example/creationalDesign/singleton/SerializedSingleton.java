package org.example.creationalDesign.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    /**
     * 所以它破坏了单例模式，为了克服这种情况，我们需要做的就是提供 readResolve() 方法的实现。
     * 在此之后你会注意到两个实例的 hashCode 在测试程序中是相同的
     */
//    protected Object readResolve() {
//        return getInstance();
//    }

}