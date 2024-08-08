package br.com.guimatec.cliente.repository;

import br.com.guimatec.cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}
