package com.java.observadores;

import com.java.subject.Subject;

public class Gif extends Observer{
	
	public Gif(Subject sb) {
		super(sb);
	}
	
	public Gif() {
		
	}
	
	public void mostrarGif() {
		System.out.println("Mostrar Gif");
	}

	@Override
	public void update() {
		mostrarGif();
	}
	
}
