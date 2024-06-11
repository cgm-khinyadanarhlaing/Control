import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String result = checkMachine("Bicycle");
        System.out.println(result);

        System.out.println("Hello From Git");

        // variable Naming
    }

    // Check Machine Or Not

  public static String checkMachine(String a) {
        // check Bicycle or Not
        if (a.equals("Bicycle")) {
            return "It is Bicycle";
        }
        if (a.equals("Car")) {
            return "It is Car";
        }
        return "Not Machine";
    }
}