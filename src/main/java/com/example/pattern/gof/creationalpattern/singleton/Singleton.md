🧠 O que o código faz?
A classe Singleton é uma implementação do padrão Singleton, que garante que apenas uma instância dessa classe seja criada durante a execução da aplicação.

🔒 Por que synchronized?
Sem o synchronized, duas threads poderiam executar getInstance() ao mesmo tempo, ambas verificarem que instance == null, e ambas criarem uma nova instância — quebrando o Singleton.

if (instance == null) {
    instance = new Singleton();
}

Esse trecho não é atômico. Ele envolve:
- Verificar se instance == null
- Criar uma nova instância
- Atribuir à variável instance

Em um ambiente com múltiplas threads, essas etapas podem ser intercaladas, levando à criação de múltiplas instâncias.

✅ Com o synchronized:

public static synchronized Singleton getInstance()

- Garante que apenas uma thread por vez possa acessar esse método.
- Impede condições de corrida (race conditions) na criação da instância.

🧪 Alternativas mais eficientes (Double-Checked Locking)

---

Com SingletonHolder:

✅ Simples e thread-safe
✅ Essa versão é lazy (inicializa sob demanda), segura e sem synchronized

---

No Spring:

✅ SingletonService está anotado com @Service, o Spring Boot gerencia essa classe como um bean singleton automaticamente. Isso significa que você não deve chamar new SingletonService(), e sim deixar o Spring fazer a injeção por você.