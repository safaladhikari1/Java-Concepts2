package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WorkingWithSets
{
    public static void main(String[] args)
    {
        // basics();
        example();
    }

    private static void basics()
    {
        // built for speed - uses a hash table internally
        HashSet<String> words = new HashSet<>();

        // built for ordering elements - uses a binary search tree internally
        TreeSet<Integer> numbers = new TreeSet<>();

        // both set classes use the Set<T> interface
        // this means that HashSet Class implements Set interface
        // we can assign either HashSet or TreeSet, both uses Set interface

        Set<String> names = new TreeSet<>();
        //Set<String> names = new HashSet<>();

        // add()
        String[] elements = {"Terry", "Cho", "Alice", "Terrence", "Tyler", "Isabella", "Isabella"};

        for(int i=0; i < elements.length; i++)
        {
            names.add(elements[i]);
        }

        // Classes that implements Set, do not have indices
        // They don't maintain the position of elements as numerical values

        // iterate over the elements in the set
        for(int i=0; i < elements.length; i++)
        {
            //System.out.println(names.get[i]); this does not exist
        }

        // we will need to use the enhanced for-loop

        // name is just a variable that we use to place the elements from names Set into name variable, so we can print it out.
        for(String name : names)
        {
            System.out.println(name);
        }

        // other methods - contains(), remove()

        System.out.println(names.contains("Isabella"));
        names.remove("Isabella");
        System.out.println(names.contains("Isabella"));

        System.out.println();

        // names.clear(); removes all of the elements from the Set.

        // set methods - UNION (join together all elements in two sets)
        Set<String> otherNames = new TreeSet<>();
        otherNames.add("Billie");
        otherNames.add("Valeria");

        // UNION is addAll() in Java
        names.addAll(otherNames); // the names Set will contain the result of the union. otherNames Set will remain unchanged.

        System.out.println();
        // verify the names Set.
        for(String name : names)
        {
            System.out.println(name);
        }

        System.out.println();
        for(String name : otherNames)
        {
            System.out.println(name);
        }

        // set methods - INTERSECTION (remove all elements that are not shared in two sets)
        otherNames = new TreeSet<>(); // making a new TreeSet for otherNames
        otherNames.add("William");
        otherNames.add("Terrence");
        otherNames.add("Cho");

        // INTERSECTION is retainAll() in Java
        names.retainAll(otherNames); // the names set will contain the result of the intersection

        System.out.println();
        for(String name : names)
        {
            System.out.println(name);
        }

        // set methods - DIFFERENCE (remove all elements in a set from another set)
        // Take a Set that exists, Look to another Set, Whatever elements are shared between you two, remove it just from your Set

        // DIFFERENCE is removeAll() in Java
        otherNames.removeAll(names); // the otherNames set will contain the result of the difference

        System.out.println();
        for(String name : otherNames)
        {
            System.out.println(name);
        }

        // We also have SUBSETS, which is containsAll() in Java
        // Returns true if this set contains all of the elements of the another Set.

        System.out.println(otherNames.containsAll(names)); // returns false
    }

    private static void example()
    {
        char[] letters = {'a', 's', 'b', 's', 'z', 'w', 'b', 'a', 'b'};

        // with a group of elements, is there a duplicate?
        Set<Character> letterSet = new HashSet<>();

        for(int i=0; i<letters.length; i++)
        {
            letterSet.add(letters[i]);
        }

        System.out.println("Duplicates? " + (letters.length != letterSet.size()));

        // how many duplicates?
        System.out.println("Number of duplicates? " + (letters.length - letterSet.size()));

        // what are the duplicates?
        // Set is not a best data structure to discover duplicates,
        // we may have to sort the elements first using TreeSet and then compare elements from both data structure side by side.

    }
}














