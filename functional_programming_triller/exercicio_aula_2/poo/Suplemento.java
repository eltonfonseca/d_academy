package poo;
public class Suplemento extends Produto {
  private String tipo;
  private int peso;
  private String marca;
  private boolean preTreino;

  public Suplemento(String titulo, String codBarra, double preco, String marca, int peso, boolean preTreino) {
    this.titulo = titulo;
    this.codBarra = codBarra;
    this.preco = preco;
    this.marca = marca;
    this.peso = peso;
    this.preTreino = preTreino;

    descontoWhey();
  }

  @Override
  public double calculaImposto() {
    return this.preco * 0.35;
  }

  @Override
  public void informacoes() {
    System.out.println("Descrição do Produto");
    System.out.println("Nome: " + this.titulo);
    System.out.println("Código de Barra: " + this.codBarra);
    System.out.println("Preço: " + this.preco);
    System.out.println("Tributos: " + calculaImposto());
    System.out.println("Pré-treino?: " + (this.preTreino ? "Sim" : "Não"));
    System.out.println("Marca: " + this.marca);
    System.out.println("Peso: " + this.peso);
    System.out.println("Tipo: " + this.tipo);
  }

  private void descontoWhey() {
    if(this.preco > 0.0 && this.tipo == "Whey") {
      this.preco = this.preco - (this.preco * 0.10);
    }
  }
}