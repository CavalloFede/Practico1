import Clases.AB;
import Clases.NodoAB;


public class Main {
    public static void main(String[] args) {

        NodoAB nodo3 = new NodoAB(3);
        NodoAB nodo27 = new NodoAB(27);
        NodoAB nodo40 = new NodoAB(40);
        NodoAB nodo5 = new NodoAB(5);

        nodo3.setIzq(nodo27);
        nodo3.setDer(nodo40);
        nodo40.setIzq(nodo5);

        AB arbolB = new AB(nodo3);

        NodoAB otroNodo5 = new NodoAB(5);
        NodoAB otroNodo27 = new NodoAB(27);
        NodoAB otroNodo40 = new NodoAB(40,otroNodo5,null);
        NodoAB otroNodo3= new NodoAB(3,otroNodo27,otroNodo40);

        AB otroArbolB = new AB(otroNodo3);

        NodoAB parNodo2= new NodoAB(2);
        NodoAB parNodo4= new NodoAB(4);
        NodoAB parNodo6= new NodoAB(6);
        NodoAB parNodo8= new NodoAB(8);
        NodoAB parNodo10= new NodoAB(10);

        parNodo2.setDer(parNodo4);
        parNodo2.setIzq(parNodo6);
        parNodo4.setDer(parNodo8);
        parNodo4.setIzq(parNodo10);

        AB arbolParAB =new AB(parNodo2);

        System.out.println("La cantidad de nodos es: " + otroArbolB.cantNodos());
        System.out.println("La cantidad de hojas es: " + otroArbolB.cantHojas());
        System.out.println("Son todos pares en otroArbolB? : " + otroArbolB.todosPares());
        System.out.println("son iguales arbolB y otroArbolB?: " + otroArbolB.iguales(arbolB));
        System.out.println("Son todos pares en arbolParAB? : " + arbolParAB.todosPares());
        System.out.println("Es arbolParAB equilibrado?: " + arbolParAB.equilibrado());

    }
}