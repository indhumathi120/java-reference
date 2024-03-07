package org.example.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i=5,j=8,k=0,p;
        int[] a = new int[4];
        try {
            p=Integer.parseInt(br.readLine());
            k=i/j;
            System.out.println(p);
          for(int c=0;c<4;c++){
              a[c]=c+1;
          }
          for(int c=0;c<4;c++){
              System.out.println(a[c]);
          }
        }
        catch (IOException e){
            System.out.println("Some IO error");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by ZERO " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Only it accepts 4");
        }
        catch (Exception e){
            System.out.println("Unknown Exception");
        }
        finally {
            System.out.println("Finally See You");
        }
        System.out.println(k);

    }
}
