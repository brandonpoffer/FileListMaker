import java.util.Scanner;

public class SafeInput {

    Scanner pipe = new Scanner(System.in);

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" +prompt + ": ");
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt) {
        int returnInt = 0;
        do {

            System.out.println(prompt + ": ");
            returnInt = pipe.nextInt();

        }while(returnInt < 0);

        return returnInt;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double returnDouble = 0.0;
        do {

            System.out.println(prompt + ": ");
            returnDouble = pipe.nextDouble();

        }while(returnDouble < 0);

        return returnDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int userInput = 0;
        System.out.println(prompt + ": ");
        System.out.println("[" + low + "]" + "-" + "[" + high + "]");
        System.out.print("Enter a number between the range: ");
        userInput = pipe.nextInt();
        System.out.println(userInput);
        return userInput;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double userInput = 0.0;
        System.out.println(prompt + ": ");
        System.out.println("[" + low + "]" + "-" + "[" + high + "]");
        System.out.print("Enter a number between the range: ");
        userInput = pipe.nextDouble();
        System.out.println(userInput);
        return userInput;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean done = false;
        boolean done2 = true;
        String input;
        do {
            System.out.print(prompt + ": ");
            input = pipe.nextLine();
            if(input.equalsIgnoreCase("Y")) {
                done = true;
                done2 = true;
            }
            else if(input.equalsIgnoreCase("N")) {
                done = true;
                done2 = false;
            }
            else {
                System.out.println("Please enter a valid input");
                done = false;
            }

        }while(!done);

        System.out.println(done2);
        return done2;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regExPattern) {
        String response = "";
        boolean gotAVal = false;

        do {
            System.out.println("\n" + prompt + ": ");
            response = pipe.nextLine();
            if(response.matches(regExPattern)) {
                gotAVal = true;
            }
            else {
                System.out.println("\n" + response + " must match the pattern " + regExPattern);
            }

        }while(!gotAVal);

        return response;
    }

    public static void prettyHeader(String msg) {
        System.out.println("*************************************");
        System.out.println("***            " + msg + "        ***");
        System.out.println("*************************************");
    }




}
