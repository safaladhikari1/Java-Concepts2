package comparing_objects;

public class ColoredPencil implements Comparable<ColoredPencil>
{
    private String color;
    private int pointSize;
    private double price;

    public ColoredPencil(String color, int pointSize, double price)
    {
        this.color = color;
        this.pointSize = pointSize;
        this.price = price;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getPointSize()
    {
        return pointSize;
    }

    public void setPointSize(int pointSize)
    {
        this.pointSize = pointSize;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "ColoredPencil{" +
                "color='" + color + '\'' +
                ", pointSize=" + pointSize +
                ", price=" + price +
                '}';
    }

    // one method that is part of Comparable interface
    @Override
    public int compareTo(ColoredPencil other)
    {
        // first try to compare pencils based on point size
        if(this.pointSize < other.pointSize)
        {
            return -1;
        }
        else if(this.pointSize > other.pointSize)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }



}










