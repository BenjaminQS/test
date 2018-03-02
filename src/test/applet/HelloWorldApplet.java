package test.applet;

import java.applet.*;
import java.awt.*;

public class HelloWorldApplet extends Applet {

	public void paint(Graphics g){
		g.drawString("hello world", 25, 50);
	}
}
