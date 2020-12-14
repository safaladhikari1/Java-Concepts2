package examples;

import java.util.ArrayList;

public class Utilities
{
    public static void main(String[] args)
    {
        Pair<Integer, Integer> results = divideRational(14, 4);
        System.out.println("Quotient: " + results.getFirst() +
                            ", Remainder: " + results.getSecond());

        ArrayList<Pair<String, Integer>> counts = wordCounts("He is not wise to me who is wise in words" +
                "only but he who is wise in deeds.");

        for(Pair<String, Integer> count : counts)
        {
            System.out.println(count.getFirst() + ": " + count.getSecond());
        }
    }

    // wanted to divide 14 / 4, return the remainder (2) of the division
    // and the quotient (3)
    public static Pair<Integer, Integer> divideRational(int numerator, int denominator)
    {
        // calculate our results
        int quotient = numerator / denominator;
        int remainder = numerator % denominator;

        // prepare a Pair object and return it

        //Pair<Integer, Integer> result = new Pair<>(quotient, remainder);
        //return result;
        return new Pair<>(quotient, remainder);
    }

    // given a sentence, return the words of the sentence and the frequency of each word
    public static ArrayList<Pair<String, Integer>> wordCounts(String sentence)
    {
        String[] words = sentence.split(" ");

        ArrayList<Pair<String, Integer>> counts = new ArrayList<>();

        // for each word
        for(String word: words)
        {
            // see if the word already exists in our counts list
            boolean found = false;
            for(Pair<String, Integer> count : counts)
            {
                if(count.getFirst().equals(word))
                {
                    found = true;
                    count.setSecond(count.getSecond() + 1);
                    break;
                }
            }

            // if there isn't a pair found for this word
            if(!found)
            {
                counts.add(new Pair<String, Integer>(word, 1));
            }
        }

        return counts;
    }
}















