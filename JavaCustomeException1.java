package BtechSem5java;

//thow vs throws
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class JavaCustomeException1 {
    public static void AgeValidation(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Your are not eligible for voting...");
        else
            System.out.println("You are eligible for voting");
    }

    public static void main(String[] args) {
        try {
            AgeValidation(17);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
