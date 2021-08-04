package com.mario.jimenezec.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mario.jimenezec.model.Categoria;



public interface IntCategoriasService {
	
	public List<Categoria> obtenerTodas();
	public void guardar(Categoria categoria);
	public void eliminar(Integer idCategoria);
	public Categoria buscarPorId(Integer idCategoria);
	
	public Page<Categoria> buscarTodas(Pageable page);
		
	
	
	
}
