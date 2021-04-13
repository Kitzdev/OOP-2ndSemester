package OOP2ndSemester.PertemuanDelapan.src;

public class Cat extends Pet
{
    String furColor;

    @Override
    void walk(String place)
    {
        System.out.println(name + " is walk by it's four feet to the " + place);
    }

    @Override
    void eat(double food)
    {
       super.weight += food;
       
       System.out.println("Now " + name + " weight is " + weight + "kg");
    }
    
}
