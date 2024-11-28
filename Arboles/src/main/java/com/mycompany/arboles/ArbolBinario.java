package com.mycompany.arboles;

public class ArbolBinario {

    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Método recursivo para insertar un nodo
    Nodo insertar(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }
        
        
        if (valor < nodo.valor) {
            nodo.izquierda = insertar(nodo.izquierda, valor); // Inserta en el subárbol izquierdo
        } else if (valor > nodo.valor) {
            nodo.derecha = insertar(nodo.derecha, valor); // Inserta en el subárbol derecho
        }
        return nodo; // Retorna el nodo actualizado
    }
    
    // Método público para insertar un valor en el árbol
    void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }
}
