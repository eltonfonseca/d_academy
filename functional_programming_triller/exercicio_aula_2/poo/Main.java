package poo;
public class Main {
  public static void main(String[] args) {
    Cliente alan = new Cliente("Alan", "Turing", "Alemão", 1965, 998);
    Cliente julio = new Cliente("Julio", "Cesar", "Brasileiro", 1998, 400);
    Logista alessandro = new Logista("Alessandro", "da Silva", "Brasileiro", 1990);

    Suplemento whey = new Suplemento("Whey Body Nutry", "555888877", 135.54, "Body Nutri", 900, true);
    Suplemento creatine = new Suplemento("Creatine Body Nutry", "22222222", 37.90, "Body Nutri", 120, true);

    alan.comprar(whey);
    julio.comprar(creatine);

    alessandro.vender(whey, alan);

    System.out.println("O Cliente " + alan.nome + " comprou " + alan.quantidadeComprada() + " produtos");
    System.out.println("O Cliente " + alan.nome + " comprou os seguintes produtos:");
    alan.produtosComprados();

    System.out.println("O Logista " + alessandro.nome + " vendeu " + alessandro.quantidadeVendida() + " produtos");
    System.out.println("O Logista " + alessandro.nome + " tem " + alessandro.quantidadeClientes() + " clientes");
    System.out.println("O Logista " + alessandro.nome + " faturou " + alessandro.totalVendas() + " reais");
  }
}
