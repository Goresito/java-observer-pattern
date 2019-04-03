package com.java.subject;

import java.util.*;
import com.java.observadores.Observer;

public abstract class Subject {
	
	List<Observer> listaObservadores = new ArrayList<Observer>();
	
	public void attach(Observer o) {
		listaObservadores.add(o);
	}
	
	public void detach(Observer o) {
		listaObservadores.remove(o);
	}
	
	public void notificar() {
		for (Observer o : listaObservadores) {
			o.update();
		}
	}

}
