package examples;

public class ObjectStorage
{
    // field
    private Object data;

    // constructor
    public ObjectStorage(Object data)
    {
        this.data = data;
    }

    // methods
    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }
}
