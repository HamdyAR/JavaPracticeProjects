public class App {
    public static void main(String[] args) throws Exception {
        String name = "Hamdy";
        int x = 5, y = 7, z = 8;
        int a, b, c;
        a = b = c = 20;
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int(Narrow typecasting)

        // int myInt = 9;
        // double myDouble = myInt; // Automatic casting: int to double
        // double -> float -> long -> int -> char -> short -> byte
        // String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // System.out.println("The length of the txt string is: " + txt.length());
        // If you add a number and a string, the result will be a string concatenation:


        System.out.println("Hello, World!");
        System.out.println(name);
        System.out.println(z);
        System.out.println(c);
        System.out.println(myInt);
    }
}
