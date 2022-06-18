package FIFO;

import java.io.Serializable;

import util.Nodo;

public class Cola<T> implements Serializable {
    // offer = añadir
    // peek = devuelve el primer valor del dato
    // poll = devuelve y borra el primer valor de entrada
    // FIFO = fila de x cosa

    //FIFO
    // First int first out
    // el primero que entra el primero que sale
    private Nodo<T> cabeza;
    private int size;

    public Cola() {
        this.cabeza = null;
        this.size = 0;
    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public int getSize() {
        return size;
    }

    public void offer(T personaEspera) {
        Nodo<T> nuevo = new Nodo<T>(personaEspera);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo<T> aux = cabeza;
            while (aux.getNodoSig() != null) {
                aux = aux.getNodoSig();
            }
            aux.setNodoSig(nuevo);
        }
        size++;
    }

    public T peek() {
        T dato = null;
        if (cabeza.getDato() != null) {
            dato = cabeza.getDato();
        }
        return dato;
    }

    public T poll() {
        Nodo<T> dato;
        if (cabeza.getDato() != null) {
            if (cabeza.getNodoSig() == null) {
                T auxPrimero = cabeza.getDato();
                cabeza = null;
                this.size = 0;
                return auxPrimero;
            } else {
                dato = cabeza.getNodoSig();
                T auxPrimero = cabeza.getDato();
                cabeza = dato;
                this.size--;
                return auxPrimero;
            }
        } else {
            return null;
        }
    }

    public void removeAll() {
        cabeza = null;
        this.size = 0;
    }

    public T obtenerDatoIndice(int i) {
        Nodo<T> aux = cabeza;
        if (i >= size || i < 0) {
            throw new ArrayIndexOutOfBoundsException(i);
        } else {
            if (i == 0) {
                return cabeza.getDato();
            } else {
                int contador = 0;
                while (contador < i) {
                    aux = aux.getNodoSig();
                    contador++;
                }
            }
        }
        return aux.getDato();
    }
}
