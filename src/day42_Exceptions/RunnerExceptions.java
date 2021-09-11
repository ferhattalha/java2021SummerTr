package day42_Exceptions;

import java.util.Scanner;

public class RunnerExceptions {
    public static void main(String[] args) throws EyyJavaBuHatayiOgrenException {
      
    	Scanner scan = new Scanner(System.in);
        System.out.print("email giriniz : ");
        String email = scan.nextLine();
        if (email.contains("@gmail.com") || email.contains("@ebikgabik.com")) {
            System.out.println("basarili");
        } else {
            throw new EyyJavaBuHatayiOgrenException("neyin kafasi bu . ne icitiysen bana da ...");
        }
    }
}
