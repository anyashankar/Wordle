import java.util.*;
//this class is used to represent the word people are trying to solve.
public class wordleObject {
    private String[] letters;  //size 5
    private ArrayList<String> alphabet;  //everytime a user guesses a letter, take out a letter

    public wordleObject(String[] letters) {
        this.letters = letters;
        alphabet = new ArrayList<String>();
        String[] x = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w"
                , "x", "y", "z",};
        for (String temp : x)
            alphabet.add(temp);
    }

    public String[] board(String[] inp) {
        String[] letters = new String[5];
        for (int i = 0; i < 5; i++) {
            letters[i] = this.letters[i];
        }
        String[] output = new String[5];
        for (int i = 0; i < 5; i++) {
            int aInd = -1;
            for (int j = 0; j < alphabet.size(); j++) {
                if (inp[i].equals(alphabet.get(j))) aInd = j;
            }
            if (aInd != -1) alphabet.remove(aInd);
            if (inp[i].equals(letters[i])) {
                output[i] = "w";
                letters[i] = "!";
            } else if (inp[i].equals(letters[0]) || inp[i].equals(letters[1]) ||
                    inp[i].equals(letters[2]) || inp[i].equals(letters[3])
                    || inp[i].equals(letters[4])) {
                output[i] = "c";
                if (inp[i].equals(letters[0])) letters[0] = "!";
                else if (inp[i].equals(letters[1])) letters[1] = "!";
                else if (inp[i].equals(letters[2])) letters[2] = "!";
                else if (inp[i].equals(letters[3])) letters[3] = "!";
                else if (inp[i].equals(letters[4])) letters[4] = "!";
            } else {
                output[i] = "n";
            }
        }
        return output;
    }

    public ArrayList<String> getAlpha() {
        return alphabet;
    }
}