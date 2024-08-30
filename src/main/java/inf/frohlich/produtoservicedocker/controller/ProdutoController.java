package inf.frohlich.produtoservicedocker.controller;

import inf.frohlich.produtoservicedocker.model.Produto;
import inf.frohlich.produtoservicedocker.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listar() {
        return produtoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getProdutoId(@PathVariable Long id) {
        Optional<Produto> produto = produtoService.findById(id);
        return produto.isPresent() ? ResponseEntity.ok(produto.get()) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Produto salvarProduto(@RequestBody Produto produto){
        return produtoService.save(produto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluirProduto(@PathVariable Long id) {
        produtoService.delete(id);
        return ResponseEntity.ok().build();
    }

}



