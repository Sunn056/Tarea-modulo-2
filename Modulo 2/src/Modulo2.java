public class Modulo2 {
    public static void main(String[] args) {
        Recursos recursos = new Recursos();

        System.out.println(recursos.mensajePOO());
        System.out.println(recursos.verificarEdad());

        int resultadoMultiplicacion = recursos.multiplicar(7, 5);
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);

        recursos.imprimirLista(10);
    }
}

class Recursos {
    
    // Primer método: Retorna un mensaje de POO
    public String mensajePOO() {
        return "Programación Orientada a Objetos";
    }

    // Segundo método: Verificar si un estudiante es mayor de edad
    public String verificarEdad() {
        int edad = 21;
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer método: Multiplicar dos enteros
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    // Cuarto método: Imprimir una lista de números del 1 al X
    public void imprimirLista(int x) {
        System.out.println("La lista de números es:");
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }
}
