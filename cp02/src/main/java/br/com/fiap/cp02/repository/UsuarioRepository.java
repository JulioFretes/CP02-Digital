package br.com.fiap.cp02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.cp02.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}