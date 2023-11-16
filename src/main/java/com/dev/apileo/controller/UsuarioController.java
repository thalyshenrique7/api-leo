package com.dev.apileo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dev.apileo.model.Usuario;
import com.dev.apileo.service.UsuarioServiceImpl;

@RestController
@RequestMapping(value = "/api/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioController {

	@Autowired
	private UsuarioServiceImpl usuarioService;

	@GetMapping(value = "{id}")
	public ResponseEntity<Usuario> getUsuario(@PathVariable(value = "id") Long id) {

		return ResponseEntity.status(HttpStatus.OK).body(this.usuarioService.getUsuario(id));
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void salvar(@RequestBody Usuario usuario) {

		this.usuarioService.salvar(usuario);
	}

	@DeleteMapping(value = "{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void excluir(@PathVariable(value = "id") Long id) {

		this.usuarioService.excluir(id);
	}

	@PutMapping(value = "{id}")
	@ResponseStatus(HttpStatus.OK)
	public void atualizar(@PathVariable(value = "id") Long id, @RequestBody Usuario novoUsuario) {
		
		this.usuarioService.atualizar(id, novoUsuario);
	}
}
