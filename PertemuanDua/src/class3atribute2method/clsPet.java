package SemesterDua.PertemuanDua.src.class3atribute2method;

public class clsPet
{
    String name;
    String food;
    String place;
    double weight;
    double height;

    public void petBMI()
    {
        double BMI = weight * 100 / ((height / 10) * (height / 10));
        System.out.printf("%s BMI is: %.1f", name, BMI);
        System.out.println();
    }

    public void eat()
    {
        System.out.println(name + " eat the " + food + ".");
    }

    public void walk()
    {
        System.out.println(name + " is walking to the " + place + ".");
    }
}
