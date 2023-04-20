package Animal;

public class Meo implements DongVat {
    public void Run()
    {
        System.out.println("Meo chay nhay linh hoat");
    }
    public void Eat()
    {
        System.out.println("Meo an ca");
    }
    public static void main(String[] args) {
        DongVat dv = new Meo();
        dv.Run();
        dv.Eat();
    }
}
