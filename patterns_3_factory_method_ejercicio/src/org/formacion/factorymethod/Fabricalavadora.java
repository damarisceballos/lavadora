package org.formacion.factorymethod;

public class Fabricalavadora {
	public Lavadora crearlavadora(String L) {
	if (L == "superior")	{
		return new LavadoraCargaSuperior();
		}
	else if (L == "frontal")	{
		return new LavadoraCargaFrontal();
	}
	else { return null; 
	}

}
}