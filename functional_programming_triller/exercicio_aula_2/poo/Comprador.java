package poo;
public interface Comprador {
  int quantidadeComprada();
  void comprar(Produto produto);
  void produtosComprados();
  boolean podeComprar();
}
