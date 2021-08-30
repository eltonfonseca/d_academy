defmodule MapExemple do
  def pow_list(list, number) do
    Enum.map(list, &(&1 * number))
  end
end

IO.inspect MapExemple.pow_list([5, 8, 6, 7], 3)
