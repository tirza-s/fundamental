package exception;

import java.util.Scanner;

public class LiquorStore {
    public static void main(String[] args) throws UnderAgeException {
        try {
            buyWine();
        } catch (UnderAgeException e) {
            System.out.println(e.toString());
        }
    }

    public static void buyWine() throws UnderAgeException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ToscaCan liquor store");
        System.out.println("Are you over 21 yo ? y/n ? ");

        String response = scanner.next();

        if(response.equalsIgnoreCase("n")){
            throw new UnderAgeException();
        }
        System.out.println("Great, what can we get from you ?");
    }


}
