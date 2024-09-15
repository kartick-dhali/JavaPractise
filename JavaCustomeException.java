package BtechSem5java;

//make a custome exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class JavaCustomeException {

    public static void main(String[] args) {
        int age = 20;
        try {
            if (age < 18) {
                throw new InvalidAgeException("Your are not eligible for voting....");
            } else {
                System.out.println("You are eligible for voting...");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
