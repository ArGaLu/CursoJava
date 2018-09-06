package guia7recursividad;

public class Ejercicio2 {

    public static void main(String[] args) {
        int a=6;
        System.out.println(fibo(a));
    }
    public static int fibo(int com){
        if (com<=2){
            return 1;
    }
        else{
            return fibo(com-1)+fibo(com-2);
        }
    }
}

