package Clases;

public class AB {
    private NodoAB raiz;

    public NodoAB getRaiz() {
        return raiz;
    }

    public void setRaid(NodoAB raiz) {
        this.raiz = raiz;
    }

    public AB(NodoAB raiz) {
        this.raiz = raiz;
    }

    public int cantNodos() {
        return cantNodosRec(this.raiz);
    }

    private int cantNodosRec(NodoAB nodo) {
        if (nodo == null) {
            return 0;
        } else {
            return 1 + cantNodosRec(nodo.getIzq()) + cantNodosRec(nodo.getDer());
        }
    }

    public int cantHojas() {
        return cantHojasRec(this.raiz);
    }

    private int cantHojasRec(NodoAB nodo) {
        if (nodo == null) {
            return 0;
        } else if (nodo.getIzq() == null && nodo.getDer() == null) {
            return 1;
        } else {
            return cantHojasRec(nodo.getIzq()) + cantHojasRec(nodo.getDer());
        }
    }

    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(NodoAB nodo) {
        if (nodo == null) {
            return -1;
        } else {
            int alturaIzquierda = alturaRec(nodo.getIzq());
            int alturaDerecha = alturaRec(nodo.getDer());
            return Math.max(alturaIzquierda, alturaDerecha) + 1;
        }
    }

    public boolean todosPares() {
        return todosParesRec(raiz);
    }

    private boolean todosParesRec(NodoAB nodo) {
        if (nodo == null) {
            return true;
        }
        if (nodo.getDato() % 2 != 0) {
            return false;
        }
        return todosParesRec(nodo.getIzq()) && todosParesRec(nodo.getDer());
    }
    public boolean iguales(AB a) {
        return igualesRec(raiz, a.getRaiz());
    }

    private boolean igualesRec(NodoAB nodo1, NodoAB nodo2) {
        if (nodo1 == null && nodo2 == null) {
            return true;
        }
        if (nodo1 == null || nodo2 == null) {
            return false;
        }
        return (nodo1.getDato() == nodo2.getDato()) &&
                igualesRec(nodo1.getIzq(), nodo2.getIzq()) &&
                igualesRec(nodo1.getDer(), nodo2.getDer());
    }
    public boolean equilibrado() {
        return equilibradoRec(raiz) != -1;
    }

    private int equilibradoRec(NodoAB nodo) {
        if (nodo == null) {
            return 0;
        }

        int alturaIzquierda = equilibradoRec(nodo.getIzq());
        int alturaDerecha = equilibradoRec(nodo.getDer());

        if (alturaIzquierda == -1 || alturaDerecha == -1 || Math.abs(alturaIzquierda - alturaDerecha) > 1) {
            return -1;
        }

        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }



}
