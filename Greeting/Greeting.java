import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String potentialFriendName = getPotentialFriendName();
        greetNewFriend(potentialFriendName);
    }

    private static void greetNewFriend(String potentialFriendName) {
        System.out.println("Здравствуйте, " + potentialFriendName + "! Очень рад знокоству!");
    }

    private static String getPotentialFriendName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как Вас зовут?");
        return scanner.nextLine();
    }

}
