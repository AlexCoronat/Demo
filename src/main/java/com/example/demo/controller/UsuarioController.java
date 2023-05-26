package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UsuarioDao;
import com.example.demo.model.Usuario;

@RestController
public class UsuarioController {

	@Autowired // Instancía la variable automaticamnente
	private UsuarioDao usuarioDao;
	
	@RequestMapping(value="usuario/{id}")
	public Usuario getUser(@PathVariable int id) {
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Alejandro");
		usuario.setApellido("Corona");
		usuario.setEmail("aacoroona@gmail.com");
		usuario.setTelefono("4776609990");
		usuario.setPassword("NttData06*");
		return usuario;
	}
	@RequestMapping(value="nuevoUsuario")
	public Usuario create() {
		Usuario usuario = new Usuario();
		usuario.setNombre("Alejandro");
		usuario.setApellido("Corona");
		usuario.setEmail("aacoroona@gmail.com");
		usuario.setTelefono("4776609990");
		return usuario;
	}
	@RequestMapping(value="buscarUsuario")
	public List<Usuario> read() {
		return usuarioDao.getUsuarios();
	}
	@RequestMapping(value="actualizarUsuario")
	public Usuario update() {
		Usuario usuario = new Usuario();
		usuario.setNombre("Alejandro");
		usuario.setApellido("Corona");
		usuario.setEmail("aacoroona@gmail.com");
		usuario.setTelefono("4776609990");
		return usuario;
	}
	@RequestMapping(value="eliminarUsuario")
	public Usuario delete() {
		Usuario usuario = new Usuario();
		usuario.setNombre("Alejandro");
		usuario.setApellido("Corona");
		usuario.setEmail("aacoroona@gmail.com");
		usuario.setTelefono("4776609990");
		return usuario;
	}
}
