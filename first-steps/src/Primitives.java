import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
//        int myValue = 10000;
//
//        int myMinIntValue = Integer.MIN_VALUE;
//        int myMaxIntValue = Integer.MAX_VALUE;
//        System.out.println("Integer Minimum Value = " + myMinIntValue + " \nInteger Maximum Value = " + myMaxIntValue);
//        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
//        System.out.println("Busted MIN value = " + (myMinIntValue - 1));



//        byte myMinByteValue = Byte.MIN_VALUE;
//        byte myMaxByteValue = Byte.MAX_VALUE;
//        System.out.println("Byte Minimum Value = " + myMinByteValue + " \nByte Maximum Value = " + myMaxByteValue);
//
//        short myMinShortValue = Short.MIN_VALUE;
//        short myMaxShortValue = Short.MAX_VALUE;
//        System.out.println("Short Minimum Value = " + myMinShortValue + " \nShort Maximum Value = " + myMaxShortValue);
//
//        long myMinLongValue = Long.MIN_VALUE;
//        long myMaxLongValue = Long.MAX_VALUE;
//        System.out.println("Long Minimum Value = " + myMinLongValue + " \nLong Maximum Value = " + myMaxLongValue);
//
//        long longNumber = 100L;



//        //Primitive Types Challenge
//        byte byteValue = 44;
//        short shortValue = 333;
//        int intValue = 5555;
//
//        long total = 50000L + 10L * (byteValue + shortValue + intValue);
//        System.out.println("Total = " + total);



        //Float And Double
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value = " + myMinFloatValue);
        System.out.println("Float Maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum value = " + myMinDoubleValue);
        System.out.println("Double Maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //Challenge
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of pounds: ");
        double numberOfPounds = scanner.nextDouble();
        double valueInKilograms = numberOfPounds * 0.45359237;
        System.out.println("Value in kilograms = " + valueInKilograms);

    }
}
