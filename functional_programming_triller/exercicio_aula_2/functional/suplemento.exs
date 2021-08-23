defmodule Suplemento do
  defstruct [
    titulo: "",
    preco: 0.0,
    cod_barra: ""
    cliente: %Cliente{},
    logista: %Logista{}
  ]

  def calcula_imposto(preco), do: preco * 0.35
end
