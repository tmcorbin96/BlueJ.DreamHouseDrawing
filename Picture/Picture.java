
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square window2;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Rectangles door;
    private Triangles tree1;
    private Triangles tree2;
    private Triangles tree3;
    private Triangles tree4;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(300);
        wall.moveHorizontal(50);
        wall.changeSize(200);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(200);
        window.moveVertical(380);
        window.changeSize(25);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("black");
        window2.moveHorizontal(90);
        window2.moveVertical(380);
        window2.changeSize(25);
        window2.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(70, 300);
        roof.moveHorizontal(160);
        roof.moveVertical(270);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(300);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        moon = new Circle();
        moon.changeColor("yellow");
        moon.moveHorizontal(200);
        moon.moveVertical(-10);
        moon.changeSize(250);
        moon.makeVisible();
        
        door = new Rectangles();
        door.changeColor("black");
        door.changeLength(20);
        door.changeWidth(60);
        door.moveHorizontal(140);
        door.moveVertical(440);
        door.makeVisible();
        
        tree1 = new Triangles();
        tree1.changeSize(600, 200);
        tree1.moveHorizontal(350);
        tree1.moveVertical(400);
        tree1.makeVisible();
        tree1.changeColor("Dark Green");

        
        tree2 = new Triangles();
        tree2.changeSize(600, 200);
        tree2.moveHorizontal(430);
        tree2.moveVertical(400);
        tree2.makeVisible();
        tree2.changeColor("Dark Green");
        
        tree3 = new Triangles();
        tree3.changeSize(600, 200);
        tree3.moveHorizontal(500);
        tree3.moveVertical(400);
        tree3.makeVisible();
        tree3.changeColor("Dark Green");

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
