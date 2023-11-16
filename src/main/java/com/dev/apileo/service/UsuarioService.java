package com.dev.apileo.service;

import com.dev.apileo.model.Usuario;

public interface UsuarioService {

	public Usuario getUsuario(Long id);

	public void salvar(Usuario usuario);

	public void excluir(Long id);
	
	public void atualizar(Long id, Usuario novoUsuario);
}
