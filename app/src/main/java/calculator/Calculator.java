package calculator;

public class Calculator {
    
    // TODO: 28/03/2024 metodo sumar
    public int sumar(int a, int b) {
        return a + b;
    }

    // TODO: 28/03/2024 metodo restar
    public int restar(int a, int b) {
        return a - b;
    }

    // TODO: 28/03/2024 metodo multiplicar
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // TODO: 28/03/2024 metodo dividir
    // TODO: 28/03/2024 [BUG] division por cero
    public float dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (float) a / b;
    }
}
