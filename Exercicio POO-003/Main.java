import dimensao.bidimensional.TrianguloRetangulo;

public class Main {
    public static void main(String[] args) {
        
        // TODO 12: Criação de um objeto da classe TrianguloRetangulo
        TrianguloRetangulo triangulo = new TrianguloRetangulo(3, 4, 5);

        // TODO 13: Comentário sobre o erro na criação do objeto
        // O erro ocorre ao tentar criar o objeto acima, pois a classe TrianguloRetangulo não é pública
        // e não foi importada de forma correta. Como o modificador da classe estava como 'default', outras classes fora do pacote
        // 'dimensao.bidimensional' não conseguem acessar diretamente essa classe

        // TODO 14: O que pode ser feito para resolver o erro?
        // Para resolver esse erro, a classe TrianguloRetangulo deve ser declarada como 'public'
        // e também deve ser importada corretamente. O fato é que o modificador 'public' permite que ela seja acessada de fora do pacote.
        
        // TODO 15: Alteração já feita
        // Assim alteramos modificador da classe TrianguloRetangulo para 'public' na classe TrianguloRetangulo.

        // TODO 16: Comentário explicando se o erro continuar
        // Se o erro continuar, provavelmente a classe ainda não foi importada da forma corretamente no arquivo onde o objeto
        // está sendo criado. Nós devemos garantir que o import da classe TrianguloRetangulo esteja presente e certo:]

        // TODO 17: Adicionando a importação da classe TrianguloRetangulo
        // Se a classe Main estiver em um pacote diferente de 'dimensao.bidimensional', a importação precisa ser feita
        // da seguinte forma no código:
        // import dimensao.bidimensional.TrianguloRetangulo;

        
        // Exibindo as informações iniciais do triângulo
        System.out.println("Informações iniciais do triângulo:");
        System.out.println(triangulo);
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Área: " + triangulo.calcularArea());
        
        // TODO 18: Atribuindo valores diretamente aos atributos
        triangulo.cateto1 = 6;
        triangulo.cateto2 = 8;
        triangulo.hipotenusa = 10;

        // TODO 19: Comentário sobre se é possível realizar esta atribuição
        // Sim, é possível atribuir valores diretamente aos atributos, porque eles têm modificadores de acesso padrão, ou seja, não são privados.
        // Porém, é uma prática comum e mais segura
        // utilizar os métodos getters e setters para manipulação de atributos.

        // TODO 20: O que pode ser feito para resolver este erro?
        // Para tornar o codigo mais seguro e logico para esse tipo de situação, deveriamos usar o metodo de encapsulamento com getters e setters nos atributos e na classe:
        // Exemplo: 
        // triangulo.setCateto1(6);
        // triangulo.setCateto2(8);
        // triangulo.setHipotenusa(10);
        
        // E exibimos as informações após modificar os valores
        System.out.println("\nApós modificarmos os catetos e a hipotenusa:");
        System.out.println(triangulo);
        System.out.println("Novo Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Nova Área: " + triangulo.calcularArea());
    }
}
