import dimensao.bidimensional.TrianguloRetangulo;

public class Main {
    public static void main(String[] args) {
      TrianguloRetangulo tr1 = new TrianguloRetangulo();
        
// TODO 4: Apague as linhas de acesso direto aos atributos
// Sabemos que esse tipo de acesso é ruim pro projeto, porque
// ele permite que os atributos sejam alterados sem nenhum tipo de controle,
// o que pode gerar uns problemas nos dados depois, tipo valores errados sendo armazenados.

        // Atribuições diretas que foram removidas:
        // tr1.cateto1 = 6;
        // tr1.cateto2 = 5;
        // tr1.hipotenusa = 7;
        // tr1.alturaHipotenusa = 4.5;

        
// TODO 5: Atribua valor 14.5 para o atributo cateto1
tr1.setCateto1(14.5);

// TODO 6: Atribua valor 48.1 para o atributo cateto2
tr1.setCateto2(48.1);

// TODO 7: Atribua valor 51.2 para o atributo hipotenusa
tr1.setHipotenusa(51.2);

// TODO 8: Atribua valor 12.3 para o atributo alturaHipotenusa
tr1.setAlturaHipotenusa(12.3);

// TODO 10: Crie uma variável double de nome areaTr1
double areaTr1;

// TODO 11: Acesse o método calcArea() da classe TrianguloRetangulo através do objeto tr1 
// e armazene o valor de retorno do método na variável areaTr1
areaTr1 = tr1.calcularArea();

// TODO 12: Imprima o valor da área da seguinte forma: "Área do triângulo tr1: <VALOR>"
System.out.println("Área do triângulo tr1: " + areaTr1);

// TODO 13: Comente: por que está dando erro?
// Se der erro, pode ser que não tenha uma verificação pra garantir que os valores dos catetos e hipotenusa sejam certos, 
// tipo valores negativos ou nulos, o que poderia quebrar o cálculo da área.


// TODO 14: Comente: o que pode ser feito para resolver este erro?
// Pra resolver isso, dava pra adicionar validações no setter dos atributos,
// assim a gente garante que só valores válidos sejam passados, ou então colocar validação dentro do método calcArea().


// TODO 16: Crie uma variável double de nome perimetroTr1
double perimetroTr1;

// TODO 17: Acesse o método calcPerimetro() da classe TrianguloRetangulo através do objeto tr1 
// e armazene o valor de retorno do método na variável perimetroTr1
perimetroTr1 = tr1.calcularPerimetro();

// TODO 18: Imprima o valor do perímetro da seguinte forma: "Perímetro do triângulo tr1: <VALOR>"
System.out.println("Perímetro do triângulo tr1: " + perimetroTr1);

// TODO 19: Comente: por que está dando erro?
// O erro pode rolar porque o cálculo do perímetro depende de valores válidos pra hipotenusa e catetos.
// Se um desses valores estiver errado, tipo a hipotenusa ser menor que os catetos, o cálculo pode não funcionar.


// TODO 20: Comente: o que pode ser feito para resolver este erro?
// A melhor coisa seria adicionar uma checagem no método calcArea() e calcPerimetro() pra garantir que a hipotenusa
// seja maior que os catetos antes de fazer o cálculo, assim evita erro no cálculo.


// TODO 21: Crie um outro objeto através do construtor, passando um valor inválido
TrianguloRetangulo tr2 = new TrianguloRetangulo(-3, 4, 5); // cateto1 é inválido

// TODO 22: Através do objeto da tarefa anterior, chame os métodos calcArea() e calcPerimetro()
double areaTr2 = tr2.calcularArea();
double perimetroTr2 = tr2.calcularPerimetro();

// TODO 23: Imprima os valores dos cálculos
System.out.println("Área do triângulo tr2: " + areaTr2);
System.out.println("Perímetro do triângulo tr2: " + perimetroTr2);

// TODO 24: Comente: o que acontece? O que fazer para consertar este problema?
// Quando você passa um valor inválido, como -3 pro cateto1, o programa pode dar algum erro inesperado.
// A melhor solução seria lançar uma exceção ou fazer alguma verificação antes de criar o triângulo 
// pra garantir que os valores dos lados são sempre válidos, assim o cálculo funciona certo.
    }
}
