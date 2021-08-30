defmodule ReduceExemple do
  def sum_all(numbers) do
    Enum.reduce(numbers, fn number, acc -> number + acc end)
  end
end

IO.inspect ReduceExemple.sum_all([2, 4, 6, 8, 10])
