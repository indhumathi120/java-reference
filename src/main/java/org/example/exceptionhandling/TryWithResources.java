package org.example.exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Try with resources -intro in 1.7
public class TryWithResources {
    public static void main(String[] args) throws Exception{

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = "";
            str = br.readLine();
        }
    }
}

// we can create obj inside try , whereas we don't need catch or finally block
// we creatig try block with resource, after done with try block resource(br) got deallocated
   // even we get error , try works to all resources once done

// use it for Sockets , Files,Database also

