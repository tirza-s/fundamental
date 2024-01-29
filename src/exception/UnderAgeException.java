package exception;

public class UnderAgeException extends Exception {

    @Override
    public String toString() {
        return "UnderAgeException{Must be at least 21 years old to buy alcohol in Europe}";
    }
}
