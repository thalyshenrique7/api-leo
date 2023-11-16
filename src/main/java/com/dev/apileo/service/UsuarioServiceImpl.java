package com.dev.apileo.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.apileo.model.Usuario;
import com.dev.apileo.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario getUsuario(Long id) {

		Usuario usuario = null;

		if (id != null) {

			try {

				usuario = this.usuarioRepository.findById(id).orElse(null);

			} catch (Exception e) {
				throw new RuntimeException("Usuário não foi encontrado no sistema.", e);
			}
		}

		return usuario;
	}

	@Override
	public void salvar(Usuario usuario) {

		usuario.setDataCriacao(Calendar.getInstance());

		this.usuarioRepository.save(usuario);
	}

	@Override
	public void excluir(Long id) {

		Usuario usuario;

		if (id != null) {

			try {

				usuario = this.usuarioRepository.findById(id).orElse(null);

				this.usuarioRepository.delete(usuario);

			} catch (Exception e) {
				throw new RuntimeException("Usuário não foi encontrado no sistema.", e);
			}
		}
	}

	@Override
	public void atualizar(Long id, Usuario novoUsuario) {

		if (id != null) {
			
			Usuario usuario = this.usuarioRepository.findById(id).orElse(null);

			usuario.setNome(novoUsuario.getNome());
			usuario.setCpf(novoUsuario.getCpf());
			usuario.setRg(novoUsuario.getRg());

			try {

				this.usuarioRepository.save(usuario);
			} catch (Exception e) {
				throw new RuntimeException("Ocorreu um erro ao tentar atualizar os dados do usuario.", e);
			}
		}
	}

}
