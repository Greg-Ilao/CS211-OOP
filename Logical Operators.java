public class AndExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("You may enter.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
