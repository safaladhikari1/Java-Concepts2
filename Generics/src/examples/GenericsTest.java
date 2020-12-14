package examples;

public class GenericsTest
{
    public static void main(String[] args)
    {
        IntegerStorage number = new IntegerStorage(100);

        // retrieve or assign my number
        System.out.println("value : " + number.getData());
        number.setData(200);
        System.out.println("value : " + number.getData());

        StringStorage string = new StringStorage("hello world");
        System.out.println("value: " + string.getData());

        // ObjectStorage can store any type of object.
        ObjectStorage object1 = new ObjectStorage("hello");
        System.out.println(object1.getData().toString());

        ObjectStorage object2 = new ObjectStorage(new DigitalCar());
        System.out.println(object2.getData().toString());

        // Object storage can store any type of primitive

        /*
            Primitives mapped to wrapper classes

            byte - Byte, short - Short, int - Integer, long - Long
            float - Float, double - Double
            boolean - Boolean
            char - Character
         */

        // hide my primitive in a wrapper class
        //Integer myNumber = new Integer(100);
        //ObjectStorage object3 = new ObjectStorage(myNumber);

        // Java is automatically doing
        //ObjectStorage object3 = new ObjectStorage(new Integer(100));

        // auto-boxing and unboxing happening here...
        ObjectStorage object3 = new ObjectStorage(100);
        System.out.println(object3.getData().toString());

        // object3.getData(), we are only getting the object data, i.e. only able to use methods from Object class

        //System.out.println(object1.getData().toUpperCase()); is not available
        // even if we have string object inside object1.

        // cast your value back to your original type
        // this was how the code was written on earlier version of Java.
        String retrievedString = (String)object1.getData();
        System.out.println(retrievedString.toUpperCase());

        /*
            Type Erasure: Does not produce multiple classes, but instead produce a single class
                          with the generic type removed.

                          Any restrictions on the generic type become restrictions on the fields
                          in the class that use the generic type.
         */

        // Use Generics to store and retrieve objects
        DataStorage<String> stringValue = new DataStorage<String>("hi");

        // If we are storing Primitives in our object we need to use wrapper class
        DataStorage<Integer> intValue = new DataStorage<Integer>(100);

        DataStorage<Boolean> booleanValue = new DataStorage<Boolean>(true);
        DataStorage<DigitalCar> carValue = new DataStorage<DigitalCar>(new DigitalCar());

        // We can retrieve our values using their original types
        System.out.println(stringValue.getData().toUpperCase());
        System.out.println(booleanValue.getData());

        // Generic Types

        // store the result of division and remainder
        int number1 = 9;
        int number2 = 7;

        // store the result of division and remainder
        Pair<Integer, Integer> results = new Pair<Integer, Integer>(number1 / number2, number1 % number2);

        System.out.println("Quotient: " + results.getFirst());
        System.out.println("Remainder: " + results.getSecond());

        Pair<String, Boolean> namesToSkyDiving = new Pair<String, Boolean>("josh", false);




    }
}
