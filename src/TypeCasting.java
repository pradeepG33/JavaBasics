import java.util.Scanner;
public class TypeCasting {
            public static void main(String[] args) {

                //String to Integer Conversion:
         /* String s ="123";
          int a = Integer.parseInt(s);*/

                //Integer to String Conversion:
                int q = 234;
                String k = String.valueOf(q);
                String e ="qwert" + k;
                System.out.println(k);
                System.out.println(e);

                //Character to Integer Conversion
       /* char c = 'A';
        int i = c;
        System.out.println(i);
        //(or)
        char a = '5';
        int num = Integer.parseInt(String.valueOf(a)); // Converts '5' to 5
        System.out.println(num);
        //(or)
        char a = '5';
        int num = Character.getNumericValue(a); // Converts '5' to 5
        System.out.println(num);*/

                //Handling Large Numbers with Casting:
         /*  double d = 347689020987654321.78;
           int i = (int)d;
           System.out.println(i); output:  2147483647*/

                //Float and Double Conversion
       /* float f = 5.6f;
        double d = 5.6;
        if(f==d){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");  //output: Not Equal
        }*/

                // Casting from Higher to Lower Precision:

        /*double d = 7.8;
        byte b = (byte)d;
        System.out.println(b);*/

                //Conversion Between Integer Types:

        /*int a = -140;
        byte b = (byte)a;
        System.out.println(b);*/

                //Type Casting with Arithmetic Operations:

        /*int a =-1;
        int b = 6;
        float c = 8.9f;
        double d = a+b+c;
        System.out.println(d);*/

                //Handling Overflow with Casting:
       /* int w = 2147483647;
        int i = w+1;
        System.out.println(i);
        short s = (short)i;
        System.out.println(s);*/

                //Working with Binary and Hexadecimal Values:
/*
        // Assign binary and hexadecimal values to int variables
        int binaryValue = 0b101010; // Binary representation: 0b prefix
        int hexValue = 0x1F4;       // Hexadecimal representation: 0x prefix

        // Convert the integer values to String in different formats
        String binaryString = Integer.toBinaryString(binaryValue); // Convert to binary string
        String hexString = Integer.toHexString(hexValue);          // Convert to hexadecimal string
        String decimalString = Integer.toString(binaryValue);      // Convert to decimal string

        // Print the results in all formats
        System.out.println("Binary Value: " + binaryValue);
        System.out.println("Binary Format: " + binaryString);
        System.out.println("Decimal Format: " + decimalString);
        System.out.println("Hexadecimal Format: " + Integer.toHexString(binaryValue));

        System.out.println("\nHexadecimal Value: " + hexValue);
        System.out.println("Hexadecimal Format: " + hexString);
        System.out.println("Decimal Format: " + Integer.toString(hexValue));
        System.out.println("Binary Format: " + Integer.toBinaryString(hexValue)); */



















            }
        }
