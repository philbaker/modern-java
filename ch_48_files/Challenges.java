import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.List;

public class Challenges {
    void challengeOne() {
        Path path = Path.of("hello.txt");
        String text = "hello, world";

        try {
            Files.writeString(path, text);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    void challengeTwo() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number");
            String text = scan.nextLine();
            Path path = Path.of("numbers.txt");
            scan.close();

            Files.writeString(path, text);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    void challengeThree() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter numbers");
            String text = scan.nextLine();
            String updatedText = text.replaceAll(" ", "\n");
            Path path = Path.of("numbers2.txt");
            scan.close();

            Files.writeString(path, updatedText);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    void challengeFour() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter numbers (type 'biggest' to see the largest number so far):");
            StringBuilder updatedText = new StringBuilder();
            int biggest = Integer.MIN_VALUE;

            while (scan.hasNextLine()) {
                String text = scan.nextLine().trim();

                if (text.equalsIgnoreCase("biggest")) {
                    if (biggest == Integer.MIN_VALUE) {
                        System.out.println("No numbers entered yet.");
                    } else {
                        System.out.println("The biggest number so far is: " + biggest);
                    }
                } else {
                    try {
                        int number = Integer.parseInt(text);
                        if (number > biggest) {
                            biggest = number;
                        }
                        updatedText.append(number).append("\n");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number or 'biggest' to see the largest number.");
                    }
                }
            }

            Path path = Path.of("numbers3.txt");
            Files.writeString(path, updatedText.toString());
            scan.close();

        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    void challengeFive() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter numbers (type 'biggest' to see the largest number so far):");
            StringBuilder updatedText = new StringBuilder();
            int biggest = Integer.MIN_VALUE;

            while (scan.hasNextLine()) {
                String text = scan.nextLine().trim();

                // Ignore empty lines
                if (text.isEmpty()) {
                    System.out.println("Please enter a valid number or 'biggest'.");
                    continue;
                }

                // Check for the "biggest" command
                if (text.equalsIgnoreCase("biggest")) {
                    if (biggest == Integer.MIN_VALUE) {
                        System.out.println("No numbers entered yet.");
                    } else {
                        System.out.println("The biggest number so far is: " + biggest);
                    }
                } else {
                    // Try to parse the number
                    try {
                        int number = Integer.parseInt(text);
                        if (number > biggest) {
                            biggest = number;  // Update the biggest number
                        }
                        updatedText.append(number).append("\n");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number or 'biggest' to see the largest number.");
                    }
                }
            }

            // Increment the filename to "numbers4.txt"
            Path path = Path.of("numbers4.txt");
            Files.writeString(path, updatedText.toString());
            scan.close();

        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    void main() {
        challengeFour();
        challengeFive();
    }
}


class ChallengeSix {
    record Person(String name, int age) {}

    void main() throws IOException {
        var people = new Person[] {
            new Person("Steve Smith", 15),
            new Person("Stan Smith", 42),
            new Person("Rodger", 1601)
        };

        var path = Path.of("people.txt");

        ChallengeSix main = new ChallengeSix();
        main.save(path, people);

        people = main.load(path);

        System.out.println(people[0]);
        System.out.println(people[1]);
        System.out.println(people[2]);
    }

    // Save the Person array to the file
    void save(Path path, Person[] people) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (Person person : people) {
            sb.append(person.name()).append(",").append(person.age()).append("\n");
        }

        Files.writeString(path, sb.toString());
    }

    // Load the Person array from the file
    Person[] load(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path);
        Person[] people = new Person[lines.size()];

        for (int i = 0; i < lines.size(); i++) {
            String[] parts = lines.get(i).split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            people[i] = new Person(name, age);
        }

        return people;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        ChallengeSix challenge = new ChallengeSix();

        Path path = Path.of("people.txt");

        // Create an array of people to save
        ChallengeSix.Person[] people = {
            new ChallengeSix.Person("Steve Smith", 15),
            new ChallengeSix.Person("Stan Smith", 42),
            new ChallengeSix.Person("Rodger", 1601)
        };

        // Save the people to the file
        challenge.save(path, people);

        // Load the people back from the file
        ChallengeSix.Person[] loadedPeople = challenge.load(path);

        // Output the loaded people
        System.out.println("Loaded People:");
        for (ChallengeSix.Person person : loadedPeople) {
            System.out.println(person);
        }
    }
}
