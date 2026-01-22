package br.com.vinicius.cadastro_usuario.infrastructure.repository;

import br.com.vinicius.cadastro_usuario.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import jdk.jfr.TransitionFrom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
