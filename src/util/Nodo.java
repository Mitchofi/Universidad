package util;

import java.io.Serializable;

public class Nodo<T> implements Serializable {

    private T dato;
    private Nodo<T> nodoSig;

    public Nodo(T dato) {
        this.dato = dato;
        this.nodoSig = null;
    }

    public T getDato() {
        return dato;
    }

    public Nodo<T> getNodoSig() {
        return nodoSig;
    }

    public void setNodoSig(Nodo<T> nodoSig) {
        this.nodoSig = nodoSig;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
}
