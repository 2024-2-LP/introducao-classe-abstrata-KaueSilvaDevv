package school.sptech;

public class Quadrado extends Figura {

    private Double lado;

    @Override
    public Double calcularArea() {
        return lado * lado;
    }

    public Quadrado() {

    }

    public Quadrado(String cor, Integer espessura, Double lado) {
        super(cor, espessura);
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "lado=" + lado +
                '}';
    }
}
