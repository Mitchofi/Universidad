package util;

import java.io.Serializable;

public class LSE<T> implements Serializable {

    private Nodo<T> cabeza;
    private int size;

    public LSE() {
        this.cabeza = null;
        this.size = 0;
    }

    public void agregarNodo(T dato) {
        Nodo<T> nuevo = new Nodo<T>(dato);
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

    public void agregarDatoIndice(T dato, int i) {
        Nodo<T> nuevo = new Nodo<T>(dato);
        if (i >= size || i < 0) {
            throw new ArrayIndexOutOfBoundsException(i);
        } else {
            if (i == 0) {
                nuevo.setNodoSig(cabeza);
                cabeza = nuevo;
            } else {
                int contador = 1;
                Nodo<T> aux = cabeza;
                while (contador < i) {
                    aux = aux.getNodoSig();
                    contador++;
                }
                nuevo.setNodoSig(aux.getNodoSig());
                aux.setNodoSig(nuevo);
            }
        }
        size++;
    }

    public boolean eliminar(int i) {
        Nodo<T> aux = cabeza;
        if (i >= size && i < 0) {
            throw new ArrayIndexOutOfBoundsException(i);
        } else {
            if (i == 0 && aux.getNodoSig() == null) {
                cabeza = null;
                size--;
            } else if (i == 0) {
                cabeza = aux.getNodoSig();
                size--;
                return true;
            } else {
                int contador = 0;
                Nodo<T> temp = aux.getNodoSig();
                while (contador < i - 1) {
                    aux = aux.getNodoSig();
                    temp = temp.getNodoSig();
                    contador++;
                }
                aux.setNodoSig(temp.getNodoSig());
                size--;
            }
            return true;
        }
    }

    public String mostrar() {
        Nodo<T> aux = cabeza;
        String msj = "";
        while (aux != null) {
            msj = aux.getDato().toString();
            aux = aux.getNodoSig();
        }
        return msj;
    }

    public int getSize() {
        return size;
    }

    public void removeAll() {
        cabeza = null;
        this.size = 0;
    }
}
