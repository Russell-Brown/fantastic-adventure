/*
Name: Russell Brown
Purpose:
Date: 10/30/26
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Person Maxwell = new Person("Maxwell", 167, 98.4); //test

        //PersonSetOrdered sortedSet = new PersonSetOrdered(); REPLACE W TREE

        //Tries to find hr.txt, then tries to create the output files for both sets.
        try
        {
            File file = new File("hr.txt");
            Scanner fileReader = new Scanner(file);
            fileReader.nextLine(); //skips header IMPORTANT
            try
            {
                FileWriter orderedSetWriter = new FileWriter("hr_ordered_set_output.txt");

                //Scans each line, pulls name, height, weight and creates a new person object w/ them
                //then prints that person.toString(), and adds that person to an ArrayList<Person>
                //After finished scanning, calls the ArrayList<Person>.toString() and writes that to output.txt
                while(fileReader.hasNext())
                {
                    String name = fileReader.next();
                    double height = fileReader.nextDouble();
                    double weight = fileReader.nextDouble();
                    Person inputPersonSort = new Person(name, height, weight);
                    sortedSet.personAdd(inputPersonSort);
                }
                System.out.println(); //these two blank prints are for readability.
                System.out.print(sortedSet);
                System.out.println(); // " "
                System.out.println("\nCreating Output Files..."); // \n for spacing
                orderedSetWriter.write(sortedSet.toString());
                orderedSetWriter.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
                System.out.println(e);
                System.exit(1);
            }
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
