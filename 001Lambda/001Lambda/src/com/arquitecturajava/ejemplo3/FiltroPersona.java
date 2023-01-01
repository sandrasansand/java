package com.arquitecturajava.ejemplo3;

import com.arquitecturajava.dominio.Persona;

public interface FiltroPersona {

	public boolean test(Persona persona);
	
	//pues nos añade una clausula or sobre el filtro que tengamos activo 
	default public FiltroPersona  or (FiltroPersona filtro) {
		
		return (Persona p)->{ return test(p) || filtro.test(p);};
	}
	
	
	
}
