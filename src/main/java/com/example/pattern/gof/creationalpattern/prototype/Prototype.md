🧠 O que o código faz?
Cria novos objetos clonando uma instância existente.

📌 Quando se usa clone() (Prototype Pattern)
Você pode usar clone() nos seguintes contextos:
✅ 1. Evitar reconstrução cara
Imagine um sistema CAD (desenho assistido por computador) que cria formas geométricas complexas. Em vez de criar cada forma do zero toda vez, você pode ter uma forma "modelo" e apenas clonar.
Circle prototype = new Circle(10, 10, "red", 5);

// Criar uma cópia
Circle clone = (Circle) prototype.clone();


✅ 2. Editores gráficos ou jogos
Você pode ter um conjunto de protótipos (formas, inimigos, objetos de cena) e clonar rapidamente para inserir novos elementos no mundo:
List<Shape> shapes = new ArrayList<>();
shapes.add(new Circle(0, 0, "blue", 10));

Shape copiedShape = shapes.get(0).clone();


✅ 3. Objetos com muitas configurações
Imagine uma configuração pré-definida (como um relatório, um gráfico, um componente de UI) que você quer duplicar com pequenas alterações:
Shape defaultConfig = new Circle(100, 100, "gray", 30);
Shape userConfig = defaultConfig.clone();
userConfig.color = "black";


⚠️ Cuidados com clone() em Java
O método clone() da classe Object faz uma cópia superficial (shallow copy).


Para cópias profundas (deep copy), você precisa sobrescrever manualmente e clonar os objetos internos.


A interface Cloneable não define nenhum método, é só um marcador. Mas se você não implementar ela, o super.clone() lança exceção.