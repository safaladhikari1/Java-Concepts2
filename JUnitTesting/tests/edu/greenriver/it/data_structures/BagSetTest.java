package edu.greenriver.it.data_structures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BagSetTest
{
    private BagSet<Integer> set;

    @Before
    public void setup()
    {
        // @Before will call setup(), before calling the rest of the methods
        set = new BagSet<>(5);
    }

    @Test
    public void testBagSet()
    {
        // test that an IllegalArgumentException is thrown when a non-positive capacity is given
        try
        {
            set = new BagSet<>(0); // bad capacity

            // we should not able to reach this line..
            // get pass the above line, without throwing exception
            Assert.fail("An illegalArgumentException was not thrown when entering a non-positive capacity");
        }
        catch(IllegalArgumentException e)
        {
            // the goal is to reach this catch block, everything is fine!
        }
    }

    @Test
    public void testAdd()
    {

        // make sure that we can add a few items to the BagSet
        set.add(10);
        set.add(20);
        set.add(30);

        Assert.assertEquals("the size() of the BagSet should be 3 after adding 3 elements",
                            3, set.size());

        // verify that we cannot add duplicates

        set.add(10); // this should not be inserted into the BagSet

        Assert.assertEquals("the size() of the BagSet should not have increased" +
                " after adding a duplicate element", 3, set.size());

        // verify that you cannot add more elements than the capacity
        set.add(40);
        set.add(50);
        set.add(60); // this should not be added to the BagSet

        Assert.assertEquals("size() has increased beyond the capacity of the BagSet", 5, set.size());

    }

    @Test
    public void testContains()
    {
        // verify that we can find an element that is inside the BagSet
        // verifying if the test is true.
        set.add(10);
        Assert.assertTrue("contains() should return true if the element is found in the BagSet", set.contains(10));

        // verify that we cannot find an element that is not inside BagSet
        // verifying if the test if false.
        Assert.assertFalse("contains() should return false if the element is not found in the BagSet", set.contains(28));
    }

    @Test
    public void testRemove()
    {
        set.add(10);
        set.add(20);
        set.add(30);

        set.remove(10);
        Assert.assertEquals("size() should be 2 after removing an element", 2, set.size());

        // existing element
        boolean result = set.remove(20);
        Assert.assertTrue("removing an element that exists in the bag should return true", result);

        // non existing element
        result = set.remove(-10);
        Assert.assertFalse("removing an element that does not exist in the bag should return false", result);

        // can we repeatedly remove the same element
        result = set.remove(20);
        Assert.assertFalse("removing a previously removed element should return false", result);

        // We have not tested contains inside remove?
    }

    @Test
    public void testSize()
    {
        // verify size() is zero for an empty BagSet
        Assert.assertEquals("size() should be zero for an empty BagSet", 0, set.size());

        // verify that size() increases as we add elements
        set.add(10);
        Assert.assertEquals("size() should increase after calling add()", 1, set.size());

        set.add(20);
        Assert.assertEquals("size() should increase after calling add()", 2, set.size());

        // verify that size() decreases as we remove elements
        set.remove(10);
        Assert.assertEquals("size() should decrease after calling remove()", 1, set.size());

        set.remove(20);
        Assert.assertEquals("size() should decrease after calling remove()", 0, set.size());
    }
}