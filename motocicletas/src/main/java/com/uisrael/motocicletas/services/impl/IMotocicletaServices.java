package com.uisrael.motocicletas.services.impl;

import java.util.List;
import java.util.Optional;

import com.uisrael.motocicletas.model.Motocicleta;

public interface IMotocicletaServices {
	
	public void insertMoto(Motocicleta nuevaMoto);
	public List<Motocicleta>listaMoto();
	public void borrarMoto(Integer id);
	public Optional<Motocicleta>editarMoto(Integer id);
	
}
