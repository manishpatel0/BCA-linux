import Java.applet.Applet;
import Java.awt.Graphics;
public class HelloWorldApplet extends Applet
{
public void paint(Graphics g)
{
g.drawString("Hello world!", 50, 25);
}
}