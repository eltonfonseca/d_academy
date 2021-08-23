package poo;
import java.util.ArrayList;

public class Logista extends Pessoa implements Vendedor {
  private ArrayList<Produto> produtosVendidos;
  private ArrayList<Pessoa> clientes;

  public Logista(String nome, String sobrenome, String pais, int anoNascimento) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.pais = pais;
    this.anoNascimento = anoNascimento;

    this.produtosVendidos = new ArrayList<>();
    this.clientes = new ArrayList<>();
  }

  @Override
  public int quantidadeVendida() {
    return produtosVendidos.size();
  }

  @Override
  public int quantidadeClientes() {
    return clientes.size();
  }

  @Override
  public double totalVendas() {
    double total = 0.0;

    for(Produto produto : produtosVendidos) {
      total += produto.preco + produto.calculaImposto();
    }

    return total;
  }

  @Override
  public void vender(Produto produto, Pessoa cliente) {
    this.produtosVendidos.add(produto);
    this.clientes.add(cliente);
  }

}
