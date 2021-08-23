package poo;
public interface Vendedor {
  int quantidadeVendida();
  int quantidadeClientes();
  double totalVendas();
  void vender(Produto produto, Pessoa cliente);
}
