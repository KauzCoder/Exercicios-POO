package dimensao.bidimensional;

public class TrianguloRetangulo {
    public double cateto1;
    public double cateto2;
    public double hipotenusa;
    public double alturaHipotenusa;

public TrianguloRetangulo() {
        this.cateto1 = 0;
        this.cateto2 = 0;
        this.hipotenusa = 0;
    }

public TrianguloRetangulo(double cateto1, double cateto2, double hipotenusa) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipotenusa = hipotenusa;
    }

public double calcularPerimetro() {
        return cateto1 + cateto2 + hipotenusa;
    }

public double calcularArea() {
        double semiPerimetro = calcularPerimetro() / 2;
        return (cateto1 * cateto2) / 2;
    }

    @Override
public String toString() {
        return "Triângulo: [Cateto 1: " + cateto1 + ", Cateto 2: " + cateto2 + ", Hipotenusa: " + hipotenusa + "]";
    }
}