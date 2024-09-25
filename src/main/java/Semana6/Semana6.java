/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Semana6;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author RedStar
 */
public class Semana6 {

    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<>();
        lista=generarLista(10);
        System.out.println("Lista");
        mostrarElementos(lista);
        System.out.println("Lista de pares");
        mostrarElementos(filtrarPares(lista));
        System.out.println("Lista al cuadrado");
        mostrarElementos(getListaCuadrados(lista));
        System.out.println("Lista sumada");
        System.out.println(sumaLista(lista));
    }
    
    public static ArrayList<Integer> generarLista(int tamano){
        ArrayList<Integer> lista = new ArrayList();
        for (int i = 0; i < tamano; i++) {
            int numero=ThreadLocalRandom.current().nextInt(1000);
            lista.add(numero);
        }
        return lista;
    }
     
    public static ArrayList<Integer> filtrarPares(ArrayList<Integer> lista) {
        ArrayList<Integer> listaPares = new ArrayList<>();
        for (int numero : lista) {
            if (numero % 2 == 0) {
                listaPares.add(numero);
            }
        }
        return listaPares;
    }
    
    public static ArrayList<Integer>getListaCuadrados(ArrayList<Integer> listRandom){
        ArrayList<Integer> listaCuadrados= new ArrayList<>();
        for(int i=0; i<listRandom.size(); i++){
            listaCuadrados.add((int) Math.pow(listRandom.get(i),2));
        }
        return listaCuadrados;
    }
    
    public static void mostrarElementos(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
       
    public static int sumaLista(ArrayList<Integer> lista) {
        int suma = 0;
        for (int numero : lista) {
            suma += numero;
            }
        return suma;
    }

}
