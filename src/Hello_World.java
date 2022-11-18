import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Hello_World {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        input.close();
        System.out.println("Hello, World.");
        System.out.println(inputString);   /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
