package poo;
public abstract class Produto {
  protected String titulo;
  protected double preco;
  protected String codBarra;
  protected Cliente comprador;
  protected Logista vendedor;

  public abstract double calculaImposto();
  public abstract void informacoes();

  public void comprador() {
    this.comprador.nomeCompleto();
  }

  public void vendedor() {
    this.vendedor.nomeCompleto();
  }
}
