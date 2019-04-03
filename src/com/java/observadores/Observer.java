package com.java.observadores;

import com.java.subject.*;

public abstract class Observer {
	
	Subject sb;
	
	public Observer() {
		
	}
	
	public Observer(Subject sb) {
		this.sb = sb;
		this.sb.attach(this);
	}



	abstract public void update();

}
