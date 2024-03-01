
### classes no java
- o que são classes? quando usamos uma classe queremos representar algo através do código
- seria simplesmente um conjunto de funções e variáveis, que fazem parte de um mesmo contexto
- no Java todas as funções e variáveis devem pertencer a alguma classe
> exemplo: classe carro  
> atributos (variáveis): cor, modelo, ano de fabricação;  
> funções (metódos): ligar, buzinar, acelerar, freiar;

### public/private class
- usando public ou private estamos definindo o escopo da sua classe, ou seja: onde ela é visível.
- public class: sua classe pode ser acessada fora do arquivo em que ela foi declarada
- private class: acessível somente no arquivo de origem

```java
public class MinhaClasse {
  // variaveis
  // metódos
}
```

### função main
- a função main é sempre onde o programa começa a ser executado
- podemos criar uma função dentro da classe que será a nossa função main
- quando uma função pertence a uma classe podemos chamá-la de um método dessa classe

### public/private static
- public: significa que esse método pode ser acessado fora da classe
- private: esse metódo só pode ser acessado de dentro da própria classe por outros métodos

### static
- static: signica que esse método pertence a classe em si e não a uma instância
- o que são instâncias? é quando criamos uma "cópia" da classe a partir da classe base
- é mais comum o termo `objeto` para se referir a instância de alguma classe
- metodos estáticos não são herdados em instâncias/objetos da classe
- e porque criar cópias da classe? ao instanciar podemos criar classes com atributos únicos
> exemplo: classe carro  
> atributos (variáveis): cor = vermelho, modelo = "mustang shelby gt500", ano de fabricação = 1967;  
> funções (metódos): ligar, buzinar, acelerar, freiar;

```java
public class MinhaClasse {
	public static void main() {
		// aqui cpf é uma instância da classe String que é padrão no java:
		String cpf = "123456789";
	}
}
```

### validando um cpf

- inicialmente vamos verificar se o cpf tem 9 digitos
- caso não: exibimos uma mensagem de erro e encerramos o programa com um return;
- caso ok: prosseguimos com o programa;

```java
public class Main {
  public static void main() {
    String cpf = "123456789";
    
    if (cpf.length() != 9) {
	// length() é um metódo da classe String,
	// logo podemos usar para verificar a quantidade de digitos do cpf
	System.out.println("cpf inválido, deve conter 9 caracteres");
	return;
    }
    // prosseguindo
  }
}
```

- agora adicionamos uma verificação se todos os caracteres são realmente dígitos
- usamos o método .matches() que funciona com strings
- usamos `"\\d+"` que é um código regex que verifica se há apenas digitos 

```java
  // . . .
  
  if (cpf.matches("\\d+") == false) {
    System.out.println("cpf inválido, deve conter apenas dígitos");
    return;
  }
``` 
