public class GeometriaTest {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5.0); 
        FiguraGeometrica quadrado = new Quadrado(4.0); 

        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());

        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do Quadrado: " + quadrado.calcularPerimetro());
    }
}
