package examples;

import java.util.Arrays;

// We are saying the generic Type T uses the interface
// We cannot implement the Interface on Generics, we can only extend the Interface

/*
    If we are dealing with Comparable:

    public class OrderedBag<T extends Comparable<T>>

    our constructor will be

    public OrderedBag(int size)
    {
        data = (T[]) new Comparable[size];
    }

    If we are dealing with Objects:

    public class OrderedBag<T>

    our constructor will be

    public OrderedBag(int size)
    {
        data = (T[]) new Object[size];
    }
 */

public class OrderedBag<T extends Comparable<T>>
{
    private T[] data;
    private int nextOpenIndex;

    public OrderedBag(int size)
    {
        // Because of Type erasure type, it is not easy to create an array of Type generic type.
        //data = new T[];

        data = (T[]) new Comparable[size];
    }

    public boolean add(T element)
    {
        if(nextOpenIndex == data.length)
        {
            return false; // no space left in the Ordered Bag
        }

        data[nextOpenIndex] = element;
        nextOpenIndex++;

        return true;
    }

    public void sort()
    {
        Arrays.sort(data, 0, nextOpenIndex);
    }

    public T findMinimum()
    {
        if(nextOpenIndex == 0)
        {
            return null; // the bag is empty
        }

        T min = data[0];

        for(int i=1; i< data.length; i++)
        {
            if(data[i] != null && data[i].compareTo(min) < 0)
            {
                min = data[i];
            }
        }

        return min;
    }

    public String toString()
    {
        return "Ordered bag: " + Arrays.toString(data);
    }
}
