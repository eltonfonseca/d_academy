FROM bitwalker/alpine-elixir-phoenix:1.9.2

ENV DEBIAN_FRONTEND=noninteractive
ENV MIX_ENV dev

RUN mkdir -p /umbrella
COPY . /umbrella
WORKDIR /umbrella

# RUN mix deps.get
# RUN mix deps.compile
# RUN mix phx.digest

EXPOSE 4000
EXPOSE 4001

# CMD mix do phx.server
