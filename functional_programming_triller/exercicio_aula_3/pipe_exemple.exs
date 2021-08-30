defmodule PipeExemple do
  def execute(numbers) do
    numbers
    |> multiply(2)
    |> reverse
    |> sum_all
  end

  defp sum_all(numbers) do
    numbers
    |> Enum.reduce(fn number, acc -> number + acc end)
  end

  defp multiply(numbers, factor) do
    numbers
    |> Enum.map(&(&1 * factor))
  end

  defp reverse(numbers) do
    numbers
    |> Enum.reverse()
  end
end

[2, 8, 7, 56]
|> PipeExemple.execute
|> IO.inspect(label: "Resultado")
