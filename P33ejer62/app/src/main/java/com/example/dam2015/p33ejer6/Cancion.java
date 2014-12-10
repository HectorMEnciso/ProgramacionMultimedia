package com.example.dam2015.p33ejer6;

public class Cancion {
   // private int id;
	private String titulo;
	private String autor;
	private String duracion;
	
	public Cancion(String titulo,String autor, String duracion){
		//this.id=id;
        this.titulo=titulo;
		this.autor=autor;
		this.duracion=duracion;
	}

    //public int getIdentificador(){
       // return id;
  //  }

	public String getTitulo(){
		return titulo;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public String getDuracion(){
		return duracion;
	}
}
