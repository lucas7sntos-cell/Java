package Projetos.AreaFigurasGeometricas;

public class Quadrado extends FiguraGeometrica {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

}
