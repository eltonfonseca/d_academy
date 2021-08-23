package poo;
import java.util.ArrayList;

public class Cliente extends Pessoa implements Comprador {
  private final int LIMITE_SERASA = 800;
  private int scoreSerasa;
  private ArrayList<Produto> produtos;

  public Cliente(String nome, String sobrenome, String pais, int anoNascimento, int score) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.anoNascimento = anoNascimento;
    this.pais = pais;
    this.scoreSerasa = score;
    this.produtos = new ArrayList<>();
  }

  @Override
  public int quantidadeComprada() {
    return this.produtos.size();
  }

  @Override
  public void comprar(Produto produto) {
    if(podeComprar()) {
      this.produtos.add(produto);
    } else {
      System.out.println("Esse cliente está com serasa zuado!");
    }
  }

  @Override
  public void produtosComprados() {
    for(Produto produto : produtos) {
      System.out.println("Nome: " + produto.titulo);
      System.out.println("Preço Pago: " + (produto.preco + produto.calculaImposto()));
    }
  }

  @Override
  public boolean podeComprar() {
    if(this.scoreSerasa < LIMITE_SERASA) {
      return false;
    }

    return true;
  }
}
