package guia7recursividad;
public class Ejercicio1 {
    public static void main(String[] args) {
        long factor=1;
        System.out.println(factoreando(factor));
    }
    public static long factoreando (long factorial){
        if(factorial==0){
            return 1;
        }
        else{
            return factorial*factoreando(factorial-1);
        }
        }
}
