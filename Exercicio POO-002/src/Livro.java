class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String t, String a) {
        titulo = t;
        autor = a;
        disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println(titulo + " emprestado com sucesso!");
        } else {
            System.out.println(titulo + " já está emprestado.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println(titulo + " devolvido com sucesso!");
    }
}

class Biblioteca {
    private Livro[] livros;
    private int contador;

    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        contador = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (contador < livros.length) {
            livros[contador] = livro;
            contador++;
            System.out.println(livro.getTitulo() + " adicionado à biblioteca.");
        } else {
            System.out.println("Não há espaço para mais livros.");
        }
    }

    public void emprestarLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equals(titulo)) {
                livros[i].emprestar();
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equals(titulo)) {
                livros[i].devolver();
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void mostrarLivros() {
        System.out.println("Livros na biblioteca:");
        for (int i = 0; i < contador; i++) {
            String status = livros[i].isDisponivel() ? "Disponível" : "Emprestado";
            System.out.println(livros[i].getTitulo() + " - " + status);
        }
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca(5);

        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro l2 = new Livro("Harry Potter", "J.K. Rowling");
        Livro l3 = new Livro("1984", "George Orwell");

        bib.adicionarLivro(l1);
        bib.adicionarLivro(l2);
        bib.adicionarLivro(l3);

        bib.mostrarLivros();

        bib.emprestarLivro("Harry Potter");
        bib.mostrarLivros();

        bib.devolverLivro("Harry Potter");
        bib.mostrarLivros();
    }
}
