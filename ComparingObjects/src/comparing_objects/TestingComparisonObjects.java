package comparing_objects;

import java.util.Arrays;
import java.util.Scanner;

public class TestingComparisonObjects
{
    public static void main(String[] args)
    {
        ColoredPencil[] pencils = {
                new ColoredPencil("red", 10, .99),
                new ColoredPencil("blue", 8, .90),
                new ColoredPencil("yellow", 8, .99),
                new ColoredPencil("green", 9, .90),
                new ColoredPencil("beige", 10, .99),
                new ColoredPencil("red", 9, .85),
                new ColoredPencil("pink", 8, 1.09),
                new ColoredPencil("red", 8, .80),
        };

        ColoredPencil pencil1 = pencils[3];
        ColoredPencil pencil2 = pencils[5];

        // With the following checks, if we can tell what element is smaller
        // and what element is bigger, we can place those elements in order.

        // which pencil has the greater point size?
//        if(pencil1.compareTo(pencil2) < 0)
//        {
//            System.out.println("Pencil2 has the greater point size");
//        }
//        else if(pencil1.compareTo(pencil2) > 0)
//        {
//            System.out.println("Pencil1 has the greater point size");
//        }
//        else // (pencil1.compareTo(pencil2) == 0)
//        {
//            System.out.println("Both pencils have the same point size.");
//        }

        // sort our input array
        /*
        Arrays.sort(pencils);

        for(int i=0; i < pencils.length; i++)
        {
            System.out.println(pencils[i]);
        }
         */

        Scanner console = new Scanner(System.in);

        System.out.println("1. Sort by point size\n2. Sort by price");

        int menuChoice = console.nextInt();

        if(menuChoice == 1)
        {
            Arrays.sort(pencils, new PointSizeComparator());
        }
        else if(menuChoice == 2)
        {
            Arrays.sort(pencils, new PriceComparator());
        }

        for(int i=0; i < pencils.length; i++)
        {
            System.out.println(pencils[i]);
        }
    }
}





















