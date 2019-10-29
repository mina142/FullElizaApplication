import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);
    public static String answer1;
    public static String answer;
    public static ArrayList<String> userInput = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.print("Enter your response here or Q to quit: ");
         answer = keyboard.nextLine();
        split();
        while (!answer.equalsIgnoreCase("q")) {
            userInput.clear();
            System.out.print("Enter your response here or Q to quit: ");
            answer = keyboard.nextLine();

            if (answer.equalsIgnoreCase("q")) {

                System.out.print("goodbye");
                System.exit(0);

            } else {
                //System.out.println(answer);
                split();
            }
        }
    }

    public static void split() {
        for (String word : answer.split(" ")) {
            userInput.add(word);

        }

        Collections.replaceAll(userInput, "me", "you");
        Collections.replaceAll(userInput, "i", "you");
        Collections.replaceAll(userInput, "my", "your");
        Collections.replaceAll(userInput, "am", "are");

        String sentence = String.join(" ", userInput);
        System.out.println(sentence);

    }


    /*    //another way to replace the words
        ListIterator<String> iterator = userInput.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equalsIgnoreCase("me")) {
                //Replace element
                iterator.set("you");
            } else if (next.equalsIgnoreCase("i")) {
                iterator.set("you");
            } else if (next.equalsIgnoreCase("my")) {
                iterator.set("your");
            }
            if (next.equalsIgnoreCase("am")) {
                iterator.set("are");
            }
        }System.out.println(userInput);*/
    }



