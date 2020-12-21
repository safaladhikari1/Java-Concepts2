package edu.greenriver.it.hashing;

public class HashingPractice
{
    public static void main(String[] args)
    {
        MyHashTable<String> wordsSet = new MyHashTable<String>();

        // add a few elements
        wordsSet.add("red");
        wordsSet.add("black");
        wordsSet.add("blue");
        wordsSet.add("green");
        wordsSet.add("white");
        wordsSet.add("pink");

        System.out.println("Before rehash(): " + wordsSet.toString());
        wordsSet.add("purple");

        // view the contents of the internal array
        System.out.println("After rehash(): " + wordsSet.toString());

        // practice with remove() and contains()

        System.out.println("remove(red): " + wordsSet.remove("red"));
        System.out.println("remove(brown): " + wordsSet.remove("brown"));
        System.out.println("contains(white): " + wordsSet.contains("white"));
        System.out.println("contains(cyan): " + wordsSet.contains("cyan"));

        System.out.println("size(): " + wordsSet.size());
        System.out.println("isEmpty(): " + wordsSet.isEmpty());

        // use our iterator here...
        for(String word : wordsSet)
        {
            System.out.println(word);
            //wordsSet.add("yellow"); throws Concurrent Modification Exception

            //wordsSet.remove("yellow"); unless the change is made, it's not going to throw an error
            // there is no yellow

            //wordsSet.remove("green"); this will throw error

            // In general, don't make any changes inside for each loop.
        }
    }
}














