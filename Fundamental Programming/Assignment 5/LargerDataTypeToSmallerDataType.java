package Assignment5;

import java.util.Scanner;

public class LargerDataTypeToSmallerDataType {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Converting long data type into byte (Large data type into small data type)");
        System.out.println("Enter the number in long : ");
        long longNum = scanner.nextLong();

        byte intoByte = (byte)longNum;


        System.out.println("Byte no : " + intoByte);
    }
}
