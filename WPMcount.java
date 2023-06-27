import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMcount {


    //Words selected that people normally struggle spelling correctly
    static String[] words = {"calendar", "liaison", "accommodate", "definitely", "consensus", "conscience",
            "acknowledge", "address", "separate", "acceptable", "strength", "tendency", "believe",
            "peace", "friend", "moon", "smoke", "sniper", "chef", "sword"};

    public static void main(String[] args) throws InterruptedException {
        System.out.println("1...2...3");
        TimeUnit.SECONDS.sleep(1);
        // quick countdown
        System.out.println("Go!");
        TimeUnit.SECONDS.sleep(1);

        Random select = new Random(); // selecting random order of words in our list
        for (int i = 0; i < 19; i++) {
            System.out.print(words[select.nextInt(19)] + " ");
        }
        System.out.println();

        double start = LocalTime.now().toNanoOfDay(); //starting time of counter
        Scanner scan = new Scanner(System.in);
        String typing; // user input
        typing = scan.nextLine();

        double end = LocalTime.now().toNanoOfDay(); // time recorded after user hits ENTER
        double elapsedTime = (end - start); // the difference between the start and end in order to determine the words per second
        double seconds = elapsedTime/1000000000.0; // converting from nano to seconds (10^-9)

        // words per min formula = (nr characters/ 5)/1 minute
        int typingSpeed = (int) ((((double) typing.length()/5)/seconds*60)); // 60 secs per min
        System.out.println("Your words per minute is:" + typingSpeed +"!"); // result


    }
        }



