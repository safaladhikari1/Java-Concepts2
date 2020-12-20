package edu.greenriver.it.notebooks;

public class TestNotebook
{
    public static void main(String[] args)
    {
        /**
         * To be equals(), we must have a equivalence relation:
         *
         * reflexive: a.equals(a) should be true always
         * symmetric: a.equqls(b) == true --> b.equals(a) == true
         * transitive: a.equals(b) == true and b.equals(c) == true --> a.equals(c) == true
         *
         */

         Notebook notesForIt333 = new Notebook("Notes 333", "Big-oh, something something...", "Bob Smith");
         Notebook notesForIt219 = new Notebook("Notes 328", "Welcome to Java development", "Bob Smith");
         Notebook moreNotes = new Notebook("Notes 333", "We're talking about trees today...", "Bob Smith");
         Notebook evenMoreNotes = new Notebook("Notes 333", "No more big-oh, please...", "Bob Smith");
         Diary diarySpring2016 = new Diary("Notes 333", "Heaps are a tree based structure...", "Bob Smith", "Homework due tomorrow");

         //System.out.println(notesForIt333.equals(notesForIt333)); // returns true
         //System.out.println(notesForIt219.equals(notesForIt219));

         System.out.println(notesForIt333.equals(diarySpring2016)); // should return false
         System.out.println(diarySpring2016.equals(notesForIt333)); // should return false

        // all three returns true
        System.out.println(notesForIt333.equals(moreNotes)); // a == b?
        System.out.println(moreNotes.equals(evenMoreNotes)); // b == c?
        System.out.println(notesForIt333.equals(evenMoreNotes)); // a == c?

    }
}


















