package edu.greenriver.it.notebooks;

public class Notebook
{
    private String title;
    private String content;
    private String author;

    public Notebook(String title, String content, String author)
    {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override // override method is double checking we are overriding method of Object class
    public boolean equals(Object other)
    {
        // initial checks
        if(other == null) // if this passes, we know we have a not null object
        {
            return false;
        }
        // if this passes, we know the "object" is not equal to "this", it is not the same object we are dealing with, we called the equals on.
        else if(this == other) // here we are comparing the memory addresses between this and other.
        {
            return true; // optimization, so we don't have to do the checks below
        }
        // if this passes, we know we have a Notebook object.
        //else if(!(other instanceof Notebook))
        else if(!(this.getClass().equals(other.getClass()))) // this means it's a Notebook object not a Diary object (child)
        {
            return false;
        }
        else
        {
            // convert other to a Notebook variable and
            // compare objects by their fields.
            Notebook otherNotebook = (Notebook)other; //we are casting other as Notebook object, we know for sure
                                    // that it is Notebook object, we have already made sure on above else if statement.
            // determine what is means for notebook objects to be equal

            return this.title == otherNotebook.title;
                    //&& this.content == otherNotebook.content &&
                    //this.author == otherNotebook.author;

            // With above, now we can have two objects with different memory addresses
            // but exact same title, content, author can be made equal.

        }
    }

    public String getTitle()
    {
        return title;
    }

    public String getContent()
    {
        return content;
    }

    public String getAuthor()
    {
        return author;
    }

    @Override
    public String toString()
    {
        return "Notebook{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}














