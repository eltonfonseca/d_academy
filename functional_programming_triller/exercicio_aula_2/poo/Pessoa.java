package poo;
import java.time.LocalDate;

public abstract class Pessoa {
  protected String nome;
  protected String sobrenome;
  protected int anoNascimento;
  protected String pais;

  public void nomeCompleto() {
    System.out.println(nome + " " + sobrenome);
  }

  public void idade() {
    System.out.println(nome + " tem " + calculaIdade() + " anos");
  }

  public void nacionalidade() {
    switch(pais) {
      case "Brasil":
        System.out.println("Brasileiro");
        break;
      case "Alemanha":
        System.out.println("Alemão");
        break;
      default:
        System.out.println("Nacionalidade desconhecida");
    }
  }

  private int calculaIdade() {
    LocalDate dataAtual = LocalDate.now();
    int anoAtual = dataAtual.getYear();

    return anoAtual - anoNascimento;
  }
}