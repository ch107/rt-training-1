package org.rothurtech;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


//    // static inner class
//    private Singleton() {}
//
//    private static class Holder {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//
//    public static Singleton getInstance() {
//        return Holder.INSTANCE;
//    }

}
