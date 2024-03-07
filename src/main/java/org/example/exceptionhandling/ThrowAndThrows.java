package org.example.exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThrowAndThrows {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=8,j,k;
        try{
            j = Integer.parseInt(br.readLine());
            k=i+j;
            if(k<10) {
                throw new ArithmeticException();
            }
            System.out.println(k);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic exception");
        }
    }
}
