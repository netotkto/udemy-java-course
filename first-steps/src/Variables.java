public class Variables {
    public static void main(String[] args) {
        int notMyFirstNumber = 5;
        System.out.println(notMyFirstNumber);

        int secondNumber = 12;
        int thirdNumber = 6;
        int myTotal = notMyFirstNumber + secondNumber + thirdNumber;
        System.out.println(myTotal);

        int myLast = 1000 - myTotal;
        System.out.println(myLast);
    }
}
