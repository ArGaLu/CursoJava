package guia7recursividad;

public class Ejercicio3 {
    public static void main(String[] args) {
        int nro = 876;
        int nInv = 0;
        int residuo = 0;
        while (nro > 0) {
            residuo = nro % 10;
            nInv = nInv * 10 + residuo;
            nro = (int) (nro / 10);
        }
        System.out.println(nInv);
        System.out.println(invert(nro));
    }
    
    public static int invert(int numero) {
       
    }

}
