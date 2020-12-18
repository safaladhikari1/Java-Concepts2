package edu.greenriver.it.trees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

// We are saying Type T can be compared against Type T
// In other words, we can only use comparable objects in our BinarySearchTree class
// comparable objects means class that is taking the place of Type T
// needs to implement Comparable interface and have compareTo() method implemented

// Since T is generics, we cannot implement Comparable interface, that's why we are extending Comparable interface

public class BinarySearchTree<T extends Comparable<T>> implements Iterable<T>
{
    // fields
    private Node root;
    private int size;

    public BinarySearchTree()
    {
        // do nothing
    }

    // basic methods
    public void add(T element)
    {
        // empty tree?
        if(root == null)
        {
            root = new Node(element);
            size++; // don't forget this part
        }
        else
        {
            // we need to recursively find the position of our new element
            // assigning the root, to the result of the add method.
            root = add(element, root);
        }
    }

    private Node add(T element, Node current)
    {
        // if we have a null current node, then we found an open spot
        if(current == null)
        {
            size++;
            return new Node(element);
        }

        // are we looking to the left and right
        int compare = current.data.compareTo(element);

        if(compare < 0) // this means if current is smaller, and element's data is bigger
        {
            current.right = add(element, current.right); // We will place element to the right of current, because element is bigger.
            // similar to: https://github.com/safaladhikari1/Java-Concepts/blob/master/BinaryTree/IntSearchTree.java

            // We are reassigning the current.right pointer to whatever happens on the right, which is eventually it hits the base case and returns new node.
        }

        else if(compare > 0) // this means if current is larger, and element's data is smaller. So we will take element to the left
        {
            current.left = add(element, current.left);
        }

        // if current's data is equal to element's data
        return current;
    }

    public boolean contains(T element)
    {
        return contains(element, root); // we start the search from the root.
    }

    private boolean contains(T element, Node current)
    {
        // base case?
        if(current == null)
        {
            return false;
        }

        int compare = current.data.compareTo(element);

        if(compare < 0) // this means if current is smaller, and element's data is bigger
        {
            return contains(element, current.right); // we go to the right, and continually check if
                                    // we hit the base case, current == null or current's data == element's data
        }
        else if(compare > 0) // this means if current is larger, and element's data is smaller.
        {
            return contains(element, current.left); // we go to the left, and continually check if
            // we hit the base case, current == null or current's data == element's data
        }
        else // if current's data is equal to element's data
        {
            return true;
        }
    }

    // returns true if the element is found and removed, otherwise returns false
    // before the return type was boolean
    public void remove(T element)
    {
        root = remove(element, root);
    }

    private Node remove(T element, Node current)
    {
        // base case?
        if(current == null)
        {
            return null; // not found!
        }

        int compare = current.data.compareTo(element);

        if(compare < 0) // this means if current is smaller, and element's data is bigger
        {
            current.right = remove(element, current.right); // we will traverse to the right
        }
        else if(compare > 0) // this means if current is larger, and element's data is smaller.
        {
            current.left = remove(element,current.left); // we will traverse to the left
        }
        else // if current's data is equal to element's data
        {
            // two children
            if(current.left != null && current.right != null)
            {
                // replace the data at our current node
                Node maxLeft = findMax(current.left);
                current.data = maxLeft.data;

                // recursively remove the largest element in the left subtree
                current.left = remove(maxLeft.data, current.left);

                // not necessary
                // size--;
            }
            else if(current.left != null) // one child
            {
                current = current.left;
                size--;
            }
            else if(current.right != null) // one child
            {
                current = current.right;
                size--;
            }
            else // no children
            {
                current = null;
                size--;
            }
        }

        return current; // we are always returning node at the end, just like add()
    }

    private Node findMax(Node current)
    {
        if(current.right != null)
        {
            return findMax(current.right);
        }

        return current;
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
        root = null; // we point the root to null, and our garbage collector will clean up
                    // all the nodes, and their data, because they are not being referenced
                    // by any variable anymore.
        size = 0;
    }

    public void preOrder()
    {
        preOrder(root);
    }

    public void preOrder(Node current)
    {
        if(current != null)
        {
            System.out.println(current.data); // node
            preOrder(current.left); // left
            preOrder(current.right); // right
        }
    }

    public void inOrder()
    {
        inOrder(root);
    }

    private void inOrder(Node current)
    {
        if(current != null)
        {
            inOrder(current.left); // left
            System.out.println(current.data); // node
            inOrder(current.right); // right
        }
    }

    public void postOrder()
    {
        postOrder(root);
    }

    private void postOrder(Node current)
    {
        if(current != null)
        {
            postOrder(current.left); // left
            postOrder(current.right); // right
            System.out.println(current.data); // node
        }
    }

    public List<T> toList()
    {
        List<T> results = new ArrayList<>();
        toList(root, results);

        return results;
    }

    private void toList(Node current, List<T> results)
    {
        if(current != null)
        {
            inOrder(current.left); // left
            results.add(current.data); // node
            inOrder(current.right); // right
        }
    }

    @Override
    public Iterator<T> iterator()
    {
        return new BSTIterator(root);
    }

    @SuppressWarnings("unchecked")
    private class NaiveIterator implements Iterator<T>
    {
        private Object[] data;
        private int position;

        public NaiveIterator(BinarySearchTree<T> owner)
        {
            data = owner.toList().toArray();
        }

        @Override
        public boolean hasNext()
        {
            return position < data.length;
        }

        @Override
        public T next()
        {
            return (T)data[position++];
        }
    }

    // Smarter BinarySearchIterator that doesn't store the data twice
    private class BSTIterator implements Iterator<T>
    {
        private Stack<Node> nodeStack = new Stack<>();

        public BSTIterator(Node current)
        {
            // move to the first node
            while(current != null)
            {
                nodeStack.push(current);
                current = current.left;
            }
        }

        @Override
        public boolean hasNext()
        {
            return !nodeStack.isEmpty();
        }

        @Override
        public T next()
        {
            // step #1: retrieve the next element to report
            Node next = nodeStack.pop();

            // step #2: if there is a right sub-tree, find the smallest element
            // adding nodes to the stack as we go

            // huge hint on how to traverse a tree without recursion

            if(next.right != null)
            {
                // add the right child
                nodeStack.push(next.right);

                // and dive to the left of our right child
                Node current = next.right;

                while(current.left != null)
                {
                    nodeStack.push(current.left);
                    current = current.left;
                }
            }

            return next.data;
        }
    }

    // binary tree node
    private class Node
    {
        private T data;
        private Node left;
        private Node right;

        public Node(T data)
        {
            this.data = data;
        }

        public String toString()
        {
            // using the ternary operator
            // in other words, using if statement in one line.
            String dataString = (data == null) ? "null" : data.toString();
            String leftChild = (left == null) ? "null" : left.data.toString();
            String rightChild = (right == null) ? "null" : right.data.toString();

            return leftChild + " <-- " + dataString + " --> " + rightChild;

            /*
                String dataString;

                if(data == null)
                {
                    dataString = "null";
                }
                else
                {
                    dataString = data.toString();
                }

            */

        }


    }
}



















