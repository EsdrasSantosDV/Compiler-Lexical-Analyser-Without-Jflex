package lexico.com.esdras.org.example;

public class Valor {
    private int valorInteiro;
    private double valorDecimal;
    private String valorIdentificador;

    public Valor(int valorInteiro) {
        this.valorInteiro = valorInteiro;
    }

    public Valor(double valorDecimal) {
        this.valorDecimal = valorDecimal;
    }

    public Valor(String valorIdentificador) {
        this.valorIdentificador = valorIdentificador;
    }

    @Override
    public String toString() {
        return "Valor{" +
                "valorInteiro=" + valorInteiro +
                ", valorDecimal=" + valorDecimal +
                ", valorIdentificador='" + valorIdentificador + '\'' +
                '}';
    }
}
