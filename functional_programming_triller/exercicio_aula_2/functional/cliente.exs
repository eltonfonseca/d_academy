defmodule Cliente do
  @limit_serasa 800

  defstruct [
    nome: "",
    sobrenome: "",
    pais: "",
    ano_nascimento: 0,
    score_serasa: 0
  ]

  def quantidade_comprada(produtos) do
    Enum.count(produtos)
  end

  def comprar(%Cliente{} = cliente, produtos_comprados, produto) do
    if pode_comprar? do
      produtos_comprados ++ produto
    else
      IO.puts("Esse cliente possui score baixo no serasa")
    end
  end

  def produtos_comprados(%Suplemento{} = suplemento) do
    IO.puts("Nome: ", suplemento.titulo)
    IO.puts("Preço: ", (suplemento.preco + Suplemento.calcula_imposto(suplemento.preco)))
  end

  def produtos_comprados(produtos) when is_list(produtos) do
    [_ | produtos_restantes] = produtos
    produtos_comprados(produtos_restantes)
  end

  defp pode_comprar?(cliente) do
    if cliente.score_serasa < @limit_serasa do
      true
    else
      false
  end
end
