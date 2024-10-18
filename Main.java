import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        //this part of code will take all the words from the list and store it all in allWords
        ArrayList<String> allWords = new ArrayList<String>();
        try {
            File myObj = new File("/Users/anyashankar/Desktop/IntelliJCE/wordle/src/wordle.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                allWords.add(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        String[] word = new String[5];
        int wordIndex = (int) (allWords.size() * Math.random());
        for (int i = 0; i < 5; i++) {
            word[i] = allWords.get(wordIndex).substring(i, i+1);
        }
        wordleObject wordle = new wordleObject(word);

        System.out.println("key:");
        System.out.println("w = right letter in right place");
        System.out.println("c = right letter wrong place");
        System.out.println("n = wrong letter");

        Scanner scan = new Scanner(System.in);
        boolean right = false;
        while (!right) {
            System.out.println("remaining letters:");
            for (int i = 0; i < wordle.getAlpha().size(); i++) {
                System.out.print(wordle.getAlpha().get(i) + " ");
            }
            System.out.println();
            System.out.println("enter guess:");
            String guess = scan.nextLine();
            String[] input = new String[5];
            for (int i = 0; i < 5; i++) {
                input[i] = guess.substring(i, i+1);
            }
            String[] output = wordle.board(input);
            for (int i = 0; i < 5; i++) {
                System.out.print(output[i]);
            }
            System.out.println();

            if (output[0].equals("w") && output[1].equals("w") &&
                    output[2].equals("w") && output[3].equals("w")
                    && output[4].equals("w"))
                right = true;
        }
        System.out.println("you win");
    }
}