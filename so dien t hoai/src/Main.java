public class Main {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        System.out.println(phoneNumber.validate("(84)-(0978489648)"));
        System.out.println(phoneNumber.validate("(a8)-(22222222)"));
    }
}
