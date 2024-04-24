package org.sree.java.features;

import org.sree.java.features.records.Person;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println("Hello world!");
        System.out.println("Pattern Matching Switch");
        System.out.println(getDayOfWeek(2));

        Person person = new Person("Sreekanth Gaddoju", 33);
        System.out.println(person.name()); // Accessor method generated for 'name'
        System.out.println(person.age());  // Accessor method generated for 'age'
        System.out.println(person);        // toString method generated
        System.out.println("Text Blocks");
        System.out.println(HTML_CONTENT);

        System.out.println("Stream API Improvements");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> filteredNumbers = numbers.stream()
                .takeWhile(n -> n < 5)
                .collect(Collectors.toList());
        System.out.println("filteredNumbers using takeWhile : " + filteredNumbers);

        System.out.println("Secure Random Generators");
        SecureRandom secureRandom = SecureRandom.getInstanceStrong();
        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);
        System.out.println("Random Bytes: " + Arrays.toString(randomBytes));

        System.out.println("Enhancements to the String Class with stripIndent()");
        String multilineString = """
            This is a
            multiline
            string
            As a
            Java 17 application
            I am reading
            this multiline string.
            """;

        System.out.println("Original:");
        System.out.println(multilineString);

        String stripped = multilineString.stripIndent();
        System.out.println("\nAfter stripIndent():");
        System.out.println(stripped);
    }

    public static final String HTML_CONTENT = """
    <html>
        <body>
            <p>Hello, Java 17! How are you today!</p>
        </body>
    </html>
    """;

    public static String getDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        return dayOfWeek;
    }

}