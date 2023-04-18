package Interface;
public class Honda implements Bike {
    public void Run()
    {
        System.out.println("Xe honda 4");
    }
    public static void main(String[] args) {
        Bike bk = new Honda();
        bk.Run();
    }
}
