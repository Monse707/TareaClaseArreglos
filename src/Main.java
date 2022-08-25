public class Main {
    public static void main (String [ ] args) {
        Arreglo arreglo = new Arreglo(10);
        System.out.println("Cree un Arreglo");
        arreglo.limpiar(2);
        System.out.println("Pongo todos los valores a 2");
        System.out.println("Muestra el valor 7:");
        System.out.println(arreglo.getElemento(7));
        System.out.println("El tamanio de mi arreglo es:");
        System.out.println(arreglo.getLongitud());
        arreglo.setElemento(6,4);
        System.out.println("Cambie el valor 6 a 4");
        System.out.println("El estado actual del arreglo es:");
        System.out.println(arreglo.toString());




    }
}
