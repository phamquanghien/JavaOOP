package MotoBike;

public class XeGa extends XeMay {
    void Run()
    {
        System.out.println("Do xang, no may, ve ga va di");
    }
    void Demo()
    {
        System.out.println("Dung nguyen lieu xang");
    }
    public static void main(String[] args) {
        XeMay xm = new XeGa();
        xm.Run();
    }
}
