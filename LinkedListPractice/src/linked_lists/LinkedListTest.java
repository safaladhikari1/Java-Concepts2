package linked_lists;

public class LinkedListTest
{
    public static void main(String[] args)
    {
        LinkedList myList = new LinkedList();

        System.out.println("size(): " + myList.size());
        // add a few elements
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");

        System.out.println(myList);

        System.out.println("size(): " + myList.size());

        System.out.println(myList.isEmpty());

        myList.add("e");
        myList.add("f");

        System.out.println(myList);

        // test remove()
        System.out.println("remove(a): " + myList.remove("a"));
        myList.remove("a"); // remove head

        System.out.println(myList);

        System.out.println("remove(d): " + myList.remove("d"));
        myList.remove("d"); // middle

        System.out.println(myList);
        System.out.println("remove(g): " + myList.remove("g"));
        myList.remove("g"); // end

        System.out.println(myList);

        myList.clear();

        // misuse the linked list by traversing the nodes too often

        System.out.println("Work begins");
        for(int i=1; i <= 1000000; i++)
        {
            //myList.add("a"); // It will stay here for a long time.
            myList.addWithTail("a");
        }
        System.out.println("Work ends");

        // It will stay here for a long time.
    }
}














