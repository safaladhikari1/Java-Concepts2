package examples;

// T is a placeholder for the types we will store in our class

// T can be any valid identifier

// public class DataStorage<T extends DigitalCar>
// declare tha type T uses an interface or has a parent class
// we are restricting the type to be a DigitalCar class.
// any method we defined in DigitalCar, we can have here in this class with Type T.

// We always extend a class or extend an interface in TypeT classes, not implement interface
// public class DataStorage<T extends Comparable>

// Interface uses generics too
// Comparable interface does use Generics

/*
    // Digital car can  be compared against another digital car
    public class DigitalCar implements Comparable<DigitalCar>
    {
        @Override
        public int compareTo(DigitalCar o)
        {
            return 0;
        }
    }

    OR

    // DataStorage is going to store a TypeT, which can be compared against other types of, same TypeT.
    // So T can be compared against T.
    public class DataStorage<T extends Comparable<T>>

 */

public class DataStorage<T>
{
    // field
    private T data;

    // constructor
    public DataStorage(T data)
    {
        this.data = data;
    }

    // methods
    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
