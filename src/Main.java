import java.util.*;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);
    public static String answer1;
    public static String answer;
    public static String sentence;
    public static ArrayList<String> userInput = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.print("Enter your response here or Q to quit: ");
         answer = keyboard.nextLine();
        split();
        randomSentence();
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
                randomSentence();
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

        sentence = String.join(" ", userInput);
        //System.out.println("Why do you say that " + sentence);


    }

    public static void randomSentence(){
        Random rand = new Random();
        int rand_int1 = rand.nextInt(4);
        if(rand_int1 == 0 ){
            System.out.println("So, you are concerned that "+ sentence);
        }
        else if(rand_int1 == 1){
            System.out.println("You seem to think that " + sentence);
        }
        else if(rand_int1 == 2){
            System.out.println("Why do you say that " + sentence);
        }
        else if(rand_int1 == 3){
            System.out.println("You seem to think that " + sentence);
        }


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



