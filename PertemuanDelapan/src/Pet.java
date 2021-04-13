package OOP2ndSemester.PertemuanDelapan.src;

public class Pet
{
    String name;
    double weight;
    double height;
    
    void walk(String place)
    {
        System.out.println(name + " is walking to the " + place);
    }

    void eat(double food)
    {
        weight += food;   
    }

    void height()
    {
        System.out.println(name + " height is about " + height + "cm");
    }
}