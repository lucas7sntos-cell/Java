package Projetos.AreaFigurasGeometricas;

public class Main {
    public static void main(String[] args) throws Exception {
        FiguraGeometrica quadrado = new Quadrado(5);
        FiguraGeometrica retangulo = new Retangulo(4, 6);
        FiguraGeometrica circulo = new Circulo(3);

        System.out.println("Área do Quadrado: " + quadrado.getArea());
        System.out.println("Área do Retângulo: " + retangulo.getArea());
        System.out.println("Área do Círculo: " + circulo.getArea());
    }
}
