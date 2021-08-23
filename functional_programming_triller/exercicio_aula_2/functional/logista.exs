defmodule Logista do
  defstruct [
    nome: "",
    sobrenome: "",
    anoNascimento: 0,
    pais: ""
  ]

  def quantidade_vendida(produtos), do: produtos |> Enum.count
  def quantidade_clientes(clientes), do: clientes |> Enum.count
end
