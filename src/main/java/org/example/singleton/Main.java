package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        Utils util = Utils.getInstance();
        System.out.println("Invoked from Util memory from Main " + util);
        System.out.println("Invoked from main: " + util.transform());

        Main main = new Main();
        main.invokeKiller();
    }

    void invokeKiller() {
        SingletonHelper singletonHelper = new SingletonHelper();
        singletonHelper.invokedFromHelper();
    }
}