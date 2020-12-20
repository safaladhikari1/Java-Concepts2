package edu.greenriver.it.notebooks;

// child class of Notebook
public class Diary extends Notebook
{
    private String secrets;

    public Diary(String title, String content, String author, String secrets)
    {
        super(title, content, author);
        this.secrets = secrets;
    }

    public String getSecrets()
    {
        return secrets;
    }

    @Override
    public boolean equals(Object other)
    {
        // initial checks
        if(other == null)
        {
            return false;
        }
        else if(this == other)
        {
            return true;
        }
        else if(!(other instanceof Diary))
        {
            return false;
        }
        else
        {
            Diary otherNotebooks = (Diary)other;

            return this.getTitle() == otherNotebooks.getTitle();
        }
    }

    @Override
    public String toString()
    {
        return "Diary{" +
                "secrets='" + secrets + '\'' +
                '}';
    }
}



















