import java.util.ArrayList;

public class PersonSet implements PersonList
{

    protected ArrayList<Person> people = new ArrayList<Person>();
    int duplicateCount = 0;
    protected String heightUnit = "cm";
    protected String weightUnit = "kg";

    //Takes a person as input and returns void
    public void personAdd(Person person)
    {
        if (!(people.contains(person)))
        {
            people.add(person);
        }
        else {
            duplicateCount++;
        }
    }//personAdd()

    //takes an int as input and returns a person at the corresponding index of the input int;
    public Person personGet(int index)
    {
        return people.get(index);
    }//personGet()

    //Loops through the arraylist, appends a string w/ p.toString() for each Person,
    // then returns the result string.
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        result.append(getHeader());
        for (Person p : people)
        {
            result.append(p);
        }
        return result.toString();
    }//toString()

    public String getHeader()
    {
        return String.format("%-8s%-16s%-8s\n", "Name:", "Height(" + heightUnit + "):", "Weight(" + weightUnit + "):");
    }

    //Returns the duplicate count at any point.
    public int duplicateGet()
    {
        return duplicateCount;
    }//duplicateGet()
}