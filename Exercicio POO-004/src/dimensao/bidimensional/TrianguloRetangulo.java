package dimensao.bidimensional;

public class TrianguloRetangulo {
    private double cateto1;
    private double cateto2;
    private double hipotenusa;
    private double alturaHipotenusa;

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

public void setCateto1(double cateto1) {
        if (cateto1 <= 0) {
            throw new IllegalArgumentException("O cateto 1 deve ser maior que zero.");
        }
        this.cateto1 = cateto1;
    }

public void setCateto2(double cateto2) {
        if (cateto2 <= 0) {
            throw new IllegalArgumentException("O cateto 2 deve ser maior que zero.");
        }
        this.cateto2 = cateto2;
    }

public void setHipotenusa(double hipotenusa) {
        if (hipotenusa <= 0) {
            throw new IllegalArgumentException("A hipotenusa deve ser maior que zero.");
        }
        if (hipotenusa <= Math.max(this.cateto1, this.cateto2)) {
            throw new IllegalArgumentException("A hipotenusa deve ser maior que os catetos.");
        }
        this.hipotenusa = hipotenusa;
    }

public void setAlturaHipotenusa(double alturaHipotenusa) {
        if (alturaHipotenusa <= 0) {
            throw new IllegalArgumentException("A altura da hipotenusa deve ser maior que zero.");
        }
        this.alturaHipotenusa = alturaHipotenusa;
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