## 2 Questão
Descreva em no máximo 200 palavras o que é um automóvel e o que ele faz. Liste os
substantivos e verbos separadamente. Cada substantivo corresponde a um objeto que precisará
ser construído para implementar um sistema, nesse caso, um carro. Selecione 5 dos objetos que
você listou e, para cada um, liste vários atributos e comportamentos. Descreva brevemente como
esses objetos interagem entre si e com outros objetos na sua descrição. Estes passos que você
seguiu são típicos do projeto orientado a objetos (1,0 ponto).

---
### Descrição
Um automóvel é um veículo terrestre utilizado para transporte de pessoas e cargas. Ele se locomove por meio de um motor que converte energia (geralmente proveniente de combustíveis como gasolina, etanol ou eletricidade) em movimento. Os automóveis podem ter duas ou mais rodas e são compostos por diversos sistemas e componentes essenciais ao seu funcionamento. Entre eles, estão o volante, utilizado para dirigir; o painel de instrumentos, que exibe informações como velocidade, nível de combustível e alertas do sistema; os freios, que permitem desacelerar ou parar o veículo; a bateria, responsável por fornecer energia elétrica ao sistema; e o conjunto de luzes, que servem para iluminação e sinalização. Um automóvel também conta com câmbio, suspensão, rodas e carroceria. 

### Substantivos

- Motor
- Painel
- Freio
- Bateria
- Luzes
- Câmbio
- Suspensão
- Carroceria

### Verbos 

- Abastecer
- Informar
- Iluminar
- Indicar
- Frear
- Parar
- Acelerar
- Ligar
- Desligar

### Atributos e Compotamentos

**1. Motor**

**Atributos**: tipo, potência, consumo, temperatura

**Comportamentos**: ligar(), desligar(), acelerar(), aquecer()

**2. Painel**

**Atributos**: velocidade, nívelCombustível, alertas

**Comportamentos**: exibirInformacoes(), atualizarLeituras()

**3. Freio**

**Atributos**: tipo, estado, forçaAplicada

**Comportamentos**: acionar(), liberar(), verificarEstado()

**4. Luzes**

**Atributos**: intensidade, tipo (farol, seta, freio), estado (ligado/desligado)

**Comportamentos**: ligar(), desligar(), piscar()

**5. Bateria**

**Atributos**: carga, voltagem, tipo

**Comportamentos**: fornecerEnergia(), recarregar(), verificarNivel()

### Interações 

**Bateria → Motor**

Fornece energia para o motor ligar.

**Motor → Painel**

Envia dados de funcionamento (velocidade, temperatura, combustível).

**Motor → Rodas**

Gira as rodas para movimentar o carro.

**Freio → Rodas**

Reduz ou para o movimento das rodas.

**Freio → Luzes**

Ativa luzes de freio ao ser pressionado.
