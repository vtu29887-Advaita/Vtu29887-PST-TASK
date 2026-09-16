interface Drawable
{
    void draw()
}
class Rectangle implements Drawable
{
    public void draw()
    {
        System.out.println("Drawing a rectangle");
    }
}
class Circle implements Drawable
{
    public void draw()
    {
        System.out.println("Drawing a circle");
    }
}
public class testInterface
{
    public static void main(String[] args)
    {
        Drawable irclec = new Circle();
        circle.draw();
    }
}