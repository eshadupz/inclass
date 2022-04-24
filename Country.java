package compareTo;

public class Country implements Measurable, Comparable<Country>
{
    private String countryName;
    private double squareArea;


    public Country(String name, double area)
    {
        countryName = name;
        squareArea = area;
    }

    public int compareTo(Object otherObject)
    {
        Country c = (Country) otherObject;
        return (int) (this.area - c.area);
    }

    public String getName()
    {
        return countryName;
    }

    public double getArea()
    {
        return squareArea;
    }

    public double getMeasurement()
    {
        return squareArea;
    }

    public boolean equals(Object other)
    {
        if (other instanceof Country)
        {
            Country country = (Country) other;
            return this.countryName.equals(country.countryName)
                    && this.squareArea == country.squareArea;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return "Country[name=" + countryName + " area=" + squareArea + "]";
    }
}
