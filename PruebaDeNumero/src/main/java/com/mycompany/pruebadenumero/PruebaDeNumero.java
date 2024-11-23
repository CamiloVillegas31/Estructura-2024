package com.mycompany.pruebadenumero;

public class PruebaDeNumero {

    public static void main(String[] args) {

        int n = 1234;
        
        InvertirNumero invertirNumero = new InvertirNumero(n); //Creas un objeto
        System.out.println("Número original: " + n);
        System.out.println("Número invertido: " + invertirNumero.getNumeroInvertido());
    }
}
