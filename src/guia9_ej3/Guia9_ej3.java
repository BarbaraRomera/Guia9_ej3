
package guia9_ej3;

import guia9_ej3.Service.ArreglosService;


public class Guia9_ej3 {

    public static void main(String[] args) {
        int[]arregloA =new int[50];
        double[]arregloB =new double[20];
        ArreglosService serv=new ArreglosService();
        serv.inicializarA(arregloA);
        serv.mostrarA(arregloA);
        serv.ordenarA(arregloA);
        serv.inicializarB(arregloA, arregloB);
       
    }

    
}
