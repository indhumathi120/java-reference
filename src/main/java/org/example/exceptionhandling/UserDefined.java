package org.example.exceptionhandling;
import java.util.*;
public class UserDefined {
    public static void main(String[] args) {
    int i=10;
    ArrayList<String> list = new ArrayList<>();
    list.contains("a");
    List<String> linkedList = new LinkedList<>();
    linkedList.contains("s");
    List<String> vector= new Vector<>();

    try {
        if (i < 15) {
            throw new MyException("Errorr");
        }
    }
    catch (MyException e){
        System.out.println(e.getMessage());
    }
    }
}

class MyException extends RuntimeException{
  public MyException (String msg){
      super(msg);
  }

}
