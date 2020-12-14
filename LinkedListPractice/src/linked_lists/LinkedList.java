package linked_lists;

public class LinkedList
{
    // store only (directly) a single node in our list
    private Node head;
    private int size; // number of elements stored in the linked list

    private Node tail;

    public LinkedList()
    {

    }

    public void addWithTail(Object newElement)
    {
        // is my list empty?
        if(head == null)
        {
            // assign (point to) a new node object
            head = new Node(newElement, null);
            tail = head;
        }
        else
        {
            // create a new node and insert into the list
            Node newNode = new Node(newElement, null);
            tail.next = newNode;

            // reassign tail
            tail = tail.next; // If you get confused, look into the picture on OneNote on LinkedList for this code.
        }
    }

    public void add(Object newElement)
    {
        // is my list empty
        if(head == null)
        {
            // assign (point to) a new node object
            head = new Node(newElement, null);
        }
        else
        {
            // don't want to reassign my head pointer
            // (if you do, you may lose elements in your list)
            Node current = head;

            // continue looping until I find a node with a null next pointer
            while(current.next != null)
            {
                // move my current variable to the next node
                current = current.next;
            }

            // add a new node at the end of the list
            current.next = new Node(newElement, null);
        }

        size++;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void clear()
    {
        // remove all elements in the linked list
        head = null;
        size = 0;
    }

    public boolean remove(Object newElement)
    {
        // returns true if the element was found and removed

        // what if the list is empty
        if(head == null)
        {
            return false; // not found!
        }
        else if(head.data.equals(newElement))
        {
            // the head is a special case because we can't lose our head pointer
            head = head.next;
            size--;
            return true;
        }
        else
        {
            // we need to search for the node before the deleted node
            Node current = head;

            /*
                continue until:
                case a: we reach the node before the one we are trying to remove
                case b: we reach the end of our list
             */

            // current.next is not equal to null, so we can move the current
            // and if the current.next.data is not equal to the newElement we are tying tor remove
            while(current.next != null && !current.next.data.equals(newElement))
            {
                // move to the next node
                current = current.next;
            }

            // did we not find our element?
            if(current.next == null)
            {
                return false; // not found
            }
            else
            {
                // remove the element
                current.next = current.next.next;
                size--;
                return true;
            }
        }
    }

    public Object get(int index)
    {
        // return the element at the given index
        int count = 0;
        Node current = head;

        // loop .. and count ..

        return null;
    }

    public String toString()
    {
        // print out the entire list
        String result = "";

        // show the list: A --> B --> C --> D --> null
        Node current = head;

        while(current != null)
        {
            // then we have a node and we should print it
            result += current.data + " --> ";

            // move to the next node
            current = current.next;
        }

        result += "null";

        return result;
    }


    private static class Node
    {
        private Object data;
        private Node next; // reference to another node object

        public Node(Object data, Node next)
        {
            this.data = data;
            this.next = next;
        }

        public String toString()
        {
            String nextElement = "null";
            if(next != null)
            {
                nextElement = next.data.toString();
            }

            return data + " --> " + nextElement;
        }
    }
}




















