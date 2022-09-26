import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        int numeroEntero = 0;
        int numeros = 10; //El valor de numeros puede ser modificado para tener diferentes resultados
        int[] numerosPrimos = calcularPrimo(numeros);
        int[] numerosFibonacci = calcularFibonacci(numeros);
        //Mostrar los numeros
        //Numeros primo
        System.out.println("Numeros primos");
        for (int i = 0; i < numeros; i++){
            //Para poder ver el tamaño, para no mostrar numeros de mas
            if (numerosPrimos[i] != 0){
                System.out.print(numerosPrimos[i]);
                //Agregar el espacio
                if (numerosPrimos[i+1] != 0){
                    System.out.print(", ");
                }
            }
        }
        System.out.println("");
        System.out.println("Sucesion de Fibonacci");
        //Fibonacci
        for (int i = 0; i < numeros; i++) {
            System.out.print(numerosFibonacci[i]);
            //Agregar el espacio
            if (numerosFibonacci[i + 1] != 0) {
                System.out.print(", ");
            }
        }
    }
    public static int[] calcularPrimo(int n){
        //Calcular variables
        int[] numerosPrimos = new int[100];
        int numerosAlmacenados = 0;
        boolean primo = true;
        //Calcular los numeros primos
        for (int i = 2; i <= n; i++){
            //Inicializar el comprobante de si es primo
            primo = true;
            //Hacer ahora si los calculos
            for (int x = 2; x < i; x++){
                //Si el numero dividido con el otro es entero, entonces no puede ser primo
                if (i%x == 0){
                    primo = false;
                    //Y se termina este proceso con Break
                    break;
                }
            }
            //Si el primo no fue declarado como false por las operaciones, entonces guardarlo en un arreglo
            if (primo == true){
                numerosPrimos[numerosAlmacenados] = i;
                numerosAlmacenados += 1;
            }
        }
        //Regresar el arreglo hecho
        return numerosPrimos;
    }
    public static int[] calcularFibonacci(int n){
        //Variables
        int[] numerosFibonacci = new int[100];
        //Hacer los calculos
        for (int i = 0; i < n; i++){
            //Si el arreglo no posee ningun numero
            if (i < 2){
                numerosFibonacci[i] = i;
            }else{
                //Sino, entonces sumar los ultimos 2 arreglos
                numerosFibonacci[i] = numerosFibonacci[i-1] + numerosFibonacci[i-2];
            }
        }
        //Regresar el valor
        return numerosFibonacci;
    }
}
