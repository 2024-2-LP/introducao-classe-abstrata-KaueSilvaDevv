package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras;

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double somaGeral = 0.0;

        for (Figura figura : figuras) {
            somaGeral += figura.calcularArea();
        }

        return somaGeral;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> figurasMaior20 = new ArrayList<>();

        for (Figura figura : figuras) {
            Double areaFiguraAtual = figura.calcularArea();
            if (areaFiguraAtual > 20) {
                figurasMaior20.add(figura);
            }
        }

        return figurasMaior20;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> figurasQuadrados = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                figurasQuadrados.add(figura);
            }
        }

        return figurasQuadrados;
    }

    public Imagem() {

    }

    public Imagem(List<Figura> figuras) {
        this.figuras = figuras;
    }
}
