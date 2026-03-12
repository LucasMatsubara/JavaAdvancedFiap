package br.com.fiap.api.rest.mapper;

import br.com.fiap.api.rest.dto.ProdutoResponse;
import br.com.fiap.api.rest.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {
    public ProdutoResponse produtoToResponse(Produto produto) {
        return new ProdutoResponse(produto.getId(), produto.getNome(), produto.getPreco());
    }
}
