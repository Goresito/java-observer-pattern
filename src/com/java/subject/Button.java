package com.java.subject;
import com.java.observadores.Gif;
import com.java.observadores.Image;
import com.java.observadores.Text;

public class Button extends Subject{
	
	public void click() {
		notificar();
	}

}
