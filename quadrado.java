public class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}
