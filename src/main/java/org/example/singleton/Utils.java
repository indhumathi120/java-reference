package org.example.singleton;

public class Utils {

    private Utils() {}

    private static Utils instance;

    public static Utils getInstance() {
        if (instance == null) {
            instance = new Utils();
        }
        return instance;
    }

    String transform() {
        // assume there is some logic to perform NewTransform
        return "NewTransform";
    }
}
