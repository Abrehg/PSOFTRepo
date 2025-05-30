import java.util.Random;
import java.util.UUID;

public class RandomStuffPrinter {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Hello! Here's some random stuff for you:");
        System.out.println("---------------------------------------");

        // 1. A random integer
        int randomNumber = random.nextInt(1000); // Random int between 0 (inclusive) and 1000 (exclusive)
        System.out.println("A random integer: " + randomNumber);

        // 2. A random double
        double randomDouble = random.nextDouble() * 100; // Random double between 0.0 (inclusive) and 100.0 (exclusive)
        System.out.println("A random double: " + String.format("%.2f", randomDouble));

        // 3. A random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("A random boolean: " + randomBoolean);

        // 3. A random boolean
        boolean randomNewBoolean = random.nextBoolean();
        System.out.println("An added random boolean: " + randomNewBoolean);

        // 4. A random character (from A-Z)
        char randomChar = (char) (random.nextInt(26) + 'A');
        System.out.println("A random uppercase letter: " + randomChar);

        // 5. A random string (UUID)
        String randomUUID = UUID.randomUUID().toString();
        System.out.println("A random UUID: " + randomUUID);

        // 6. A random selection from a predefined list
        String[] randomWords = {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape"};
        String randomWord = randomWords[random.nextInt(randomWords.length)];
        System.out.println("A random word from a list: " + randomWord);

        // 7. A longer random string
        int length = 10 + random.nextInt(11); // Random length between 10 and 20
        StringBuilder randomString = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < length; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }
        System.out.println("A random alphanumeric string: " + randomString.toString());

        System.out.println("---------------------------------------");
        System.out.println("That's all the random stuff for now. Bye!");

<<<<<<< HEAD
	System.out.println("I love kuzmin !! boeing 747 max");
=======
        System.out.println("i <3 kuzmin");
>>>>>>> ecf897f743de82054d42728cfe0e4dd6d1378230
    }
}
