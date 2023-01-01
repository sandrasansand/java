package com.arquitecturajava.dominio;

public class Documento implements Versionable<Documento>  {
	
	private String titulo;
	private int version;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Documento(String titulo, int version) {
		super();
		this.titulo = titulo;
		this.version = version;
	}
	
//	//bioperator ya que recibe 2 parametros de mismo tipo
//	// devuelve un parametro de ese tipo
//	@Override
//	public static Documento esMayor(Documento actual, Documento siguiente) {
//		
//		
//		//darme cuenta que este metodo es muy muy generico
//		
//	
//	}

}
