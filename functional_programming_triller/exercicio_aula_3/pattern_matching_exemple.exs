defmodule PatternMatchingExemple do
  def pair?(number) when rem(number, 2) == 0, do: true
  def pair?(number) when is_number(number), do: false
  def pair?(_number), do: "is not a number!"
end

IO.inspect PatternMatchingExemple.pair?(2)
IO.inspect PatternMatchingExemple.pair?(3)
IO.inspect PatternMatchingExemple.pair?("qualquer numero")
