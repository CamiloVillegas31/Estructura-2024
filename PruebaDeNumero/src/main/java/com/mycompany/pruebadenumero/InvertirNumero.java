package com.mycompany.pruebadenumero;

public class InvertirNumero {

    //Atributos
    private int numeroInvertido;

    //Contructor
    public InvertirNumero(int numero) {
        this.numeroInvertido = invertir(numero);
    }

    //Metodo Get
    public int getNumeroInvertido() {
        return numeroInvertido;
    }

    private int invertir(int n) {
        int invertido = 0;
        while (n != 0) {
            invertido = invertido * 10 + (n % 10);
            n /= 10;
        }
        return invertido;
    }

}
