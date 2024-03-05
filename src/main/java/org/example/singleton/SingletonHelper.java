package org.example.singleton;

public class SingletonHelper {
     void invokedFromHelper() {
         Utils utils = Utils.getInstance();
         System.out.println("Invoked from Util memory from SingletonHelper " + utils);
        System.out.println("Invoked from Helper: " + utils.transform());
    }
}
