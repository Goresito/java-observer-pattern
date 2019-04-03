package com.java.observadores;

import com.java.subject.Subject;

public class Scrollbar extends Observer{
	
	public Scrollbar(Subject sb) {
		super(sb);
	}
	
	public Scrollbar() {
		
	}
	
	public void mostrarScrollbar() {
		System.out.println("Mostrar Scrollbar");
	}
	
	@Override
	public void update() {
		mostrarScrollbar();
	}

}
