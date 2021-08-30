defmodule FilterExemple do
  def only_odd(numbers) do
    Enum.filter(numbers, fn number -> rem(number, 2) == 1 end)
  end
end

IO.inspect FilterExemple.only_odd([2, 4, 8, 15, 22, 41])
