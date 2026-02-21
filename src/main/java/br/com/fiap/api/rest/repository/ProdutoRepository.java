package br.com.fiap.api.rest.repository;

import br.com.fiap.api.rest.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
}
