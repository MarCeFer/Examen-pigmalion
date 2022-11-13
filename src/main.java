//Puede un numero X formarse usando la suma
// de dos elementos de un array?
//ej 1 nums= [1,4,3,9], requiredSum= 8  - False
//ej 1 nums= [1,2,4,4], requiredSum= 8  - True

public class main {
    public static void main(String[] args) {
        //False
        int requiredSum = 8;
        int nums1[] =  {1,4,9,3};
        int nums2[] = {1,2,4,4};

        //prueba False
        //System.out.println(verificarNumero(requiredSum,nums1));
        //prueba True
        //System.out.println(verificarNumero(requiredSum,nums2));

    }

   public static boolean verificarNumero(int num, int[] lista) {
        boolean verificado = false;

        int contador = 0 ;
        int contadorInterno = 0;

        // verifica que no se salga de la lista y no encontre num verificar
        while (contador < lista.length && !verificado){
            //set segundo contador
            contadorInterno = contador+1;
        //Itero array
            while (contadorInterno < lista.length && !verificado){
                //verifico si se cumple la condicion
                if(lista[contador] + lista[contadorInterno] == num){
                    //si se cumple, true
                    verificado = true;
                }
                contadorInterno++;
            }
            contador++;
        }
        return verificado;
    }
}
