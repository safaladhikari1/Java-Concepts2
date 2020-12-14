package examples;

public class TestOrderedBag
{
    public static void main(String[] args)
    {
        // create the bag and elements to insert
        OrderedBag<Integer> numbersBag = new OrderedBag<>(10);
        int[] elements = {10, 3, 9, 14, 21};

        // insert the elements into the bag
        for(int element: elements)
        {
            numbersBag.add(element);
        }

        // Print prior to sorting
        System.out.println(numbersBag.toString());
        System.out.println();

        System.out.println("Min element: " + numbersBag.findMinimum());

        // Sort and show our results
        // We will get null pointer exception because our numbersBag is size 10, and our elements array only have 5 elements
        numbersBag.sort();
        System.out.println(numbersBag.toString());
        System.out.println();
        System.out.println("Min element: " + numbersBag.findMinimum());

        /*

        // Car Class
        // We can only use comparable objects in our OrderedBag class
        // create the bag and elements to insert
        OrderedBag<Car> carsBag = new OrderedBag<>(10);
        Car[] cars = {new Car(), new Car(), new Car()};

        // insert the elements into the bag
        for(Car car: cars)
        {
            carsBag.add(car);
        }

        // Print prior to sorting
        System.out.println(carsBag.toString());
        System.out.println();

        // Sort and show our results
        // We will get null pointer exception because our numbersBag is size 10, and our elements array only have 5 elements
        carsBag.sort();
        System.out.println(carsBag.toString());

        */

    }
}
