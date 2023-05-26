
package guia9_ej3.Service;

import java.util.Arrays;

public class ArreglosService {
    
    public int[] inicializarA(int[] arregloA){
    
        for (int i = 0; i < 50; i++) {
            int num;
            num=(int) Math.round(Math.random()*10);
            Arrays.fill(arregloA, i, i+1, num);
        }
        return arregloA;
    } 

    public void mostrarA(int[] arregloA){
    
        System.out.println("arreglo A");
        System.out.println(Arrays.toString(arregloA));
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
    public void ordenarA(int[] arregloA){
    
        int[]ordenado=new int[50];
        for (int i = 0; i < 50; i++) {
            Arrays.fill(ordenado, i,i+1,arregloA[i]);
        } 
        Arrays.sort(ordenado);
        System.out.println("el arreglo A ordenado queda: ");
        System.out.println(Arrays.toString(ordenado));
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
    public void inicializarB(int[]arregloA,double[] arregloB){
    
        for (int i = 0; i < 10; i++) {
            Arrays.fill(arregloB, i,i+1,arregloA[i]);
        }
        double num=0.5;
        for (int i = 10; i < 20; i++) {
            Arrays.fill(arregloB, i,i+1,num);
        }
        System.out.println("arreglo B");
        System.out.println(Arrays.toString(arregloB));
    
    }
    
    
}
