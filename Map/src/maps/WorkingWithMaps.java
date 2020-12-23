package maps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WorkingWithMaps
{
    public static void main(String[] args)
    {
        //basics();

        example();


    }

    public static void basics()
    {
        // built for speed - based on a hash table
        HashMap<String, Double> stockValues = new HashMap<>();

        // built for ordering elements - based on a binary search tree
        TreeMap<String, Character> middleInitials = new TreeMap<>();

        // program against an interface for flexibility
        Map<String, Integer> ageTable = new TreeMap<>(); // Do you care about order?
        //Map<String, Integer> ageTable = new HashMap<>(); // Do you care about speed?

        // the add operation is called put()
        ageTable.put("Elliot", 21);
        ageTable.put("Juan", 42);
        ageTable.put("Gina", 17);
        ageTable.put("Maria", 66);
        ageTable.put("Ramona", 21);

        // above we have keys unique, values may not be unique
        // iterate over the elements in the table

        // iterate over the keys (use a for-each loop because we don't have index-based access)

        // keySet() will return the set objects of the keys contained in the ageTable map
        // set is a group of elements with no duplicates

        // there is no concept of index in HashTable or Binary Search Tree data structure, so we have to use for each loop
        // to iterate over the elements
        for(String name : ageTable.keySet())
        {
            System.out.println("Key: " + name); // prints out keys in random order, if used HashMap
            // prints out keys in sorted order, if used TreeMap
        }

        System.out.println();

        // iterate over the values

        // values() will return a collection view of the values (ints) contained in the ageTable Map
        // collection allows duplicates
        for(int age : ageTable.values())
        {
            System.out.println("Value: " + age);
        }

        System.out.println();

        // iterate over the pairs

        // Approach 1:

        // Map.Entry<Key, Value> is a map entry, in key-value pair.
        // This will place two associated "key value pairs" in the map under one object called an Entry.
        // entrySet() returns a set view of the mappings "Map.Entry<Key, Value>" contained in this map.

        for(Map.Entry<String, Integer> pair : ageTable.entrySet())
        {
            System.out.println(pair.getKey() + " ----> " + pair.getValue());
        }

        // Approach 2:

        System.out.println();
        // get() method will give us the associated value of that key.
        // this is lookup mechanism
        for(String name : ageTable.keySet())
        {
            System.out.println(name + " --> " + ageTable.get(name));
        }

        System.out.println();

        // primary mechanism of the table is looking up values with keys
        System.out.println("Elliot is " + ageTable.get("Elliot") + " years old!");
        System.out.println("Gina is " + ageTable.get("Gina") + " years old!");
        System.out.println("Barry is " + ageTable.get("Barry") + " years old!"); // not in the Map, returns null

        System.out.println();
        // contains() methods
        System.out.println("Barry? " + ageTable.containsKey("Barry"));
        System.out.println("Elliot? " + ageTable.containsKey("Elliot"));
        System.out.println();

        System.out.println("Is anyone 21 years old? " + ageTable.containsValue(21));
        System.out.println("Is anyone 12 years old? " + ageTable.containsValue(12));
        System.out.println();

        // remove() method
        System.out.println("remove(Elliot) " + ageTable.remove("Elliot")); // returns the value associated with the key and removes the key
        System.out.println("Elliot? " + ageTable.containsKey("Elliot"));
    }

    private static void example()
    {
        // problem - count the frequency of words in a file
        Map<String, Integer> frequencies = new TreeMap<>();

        // We are assuming that all words in war_and_peace.txt are separated by spaces.

        try(Scanner reader = new Scanner(new FileInputStream("war_and_peace.txt")))
        {
            while (reader.hasNextLine())
            {
                // get the words on the line
                String line = reader.nextLine();
                String[] words = line.split(" "); // assuming that words are surrounded by a space

                // put each word into the map
                for(int i=0; i < words.length; i++)
                {
                    // make sure the word is already in the map if not present
                    String word = words[i];
                    if(!frequencies.containsKey(word))
                    {
                        frequencies.put(word, 0);
                    }

                    // if it gets here, the word was already in the map and we skipped the above if statement

                    // increment the frequency of the word
                    frequencies.put(word, frequencies.get(word) + 1);
                }
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Error reading from file - " + ex.getMessage());
        }

        // print the frequencies
        for(String word : frequencies.keySet())
        {
            // this will print out the word and frequency pairs
            System.out.println(word + ": " + frequencies.get(word));
        }

        System.out.println();

        System.out.println("How often does 'would' show up in 'war and peace'? " + frequencies.get("would"));
        System.out.println("How many words did we find in 'war and peace'? " + frequencies.size());
    }
}















