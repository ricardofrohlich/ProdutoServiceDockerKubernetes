package inf.frohlich.produtoservicedocker.repositoy;

import inf.frohlich.produtoservicedocker.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
