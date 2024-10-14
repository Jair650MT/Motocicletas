package com.uisrael.motocicletas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.motocicletas.model.Motocicleta;
import com.uisrael.motocicletas.repository.IMotocicletaRepository;
import com.uisrael.motocicletas.services.impl.IMotocicletaServices;

@Service
@Component
public class MotocicletaServicesImpl implements IMotocicletaServices{
	@Autowired
	private IMotocicletaRepository repositorioMotos;
	@Override
	public void insertMoto(Motocicleta nuevaMoto) {
		// TODO Auto-generated method stub
		repositorioMotos.save(nuevaMoto);
	}

	@Override
	public List<Motocicleta> listaMoto() {
		// TODO Auto-generated method stub
		return repositorioMotos.findAll();
	}

	@Override
	public void borrarMoto(Integer id) {
		// TODO Auto-generated method stub
		repositorioMotos.deleteById(id);
	}

	@Override
	public Optional<Motocicleta> editarMoto(Integer id) {
		// TODO Auto-generated method stub
		return repositorioMotos.findById(id);
	}

}
