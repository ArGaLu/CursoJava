public class Ejercicio4 {

    public static void main(String[] args) {
        int[] vector = {1,2,3,4,5,6,7,8,9};
        System.out.println(sumar(vector, 0));
    }

    public static int sumar(int v[], int posicion){
        if(posicion==v.length-1){
            return v[posicion];
        }
        else{
            return v[posicion]+sumar(v, posicion+1);
        }
    }

}