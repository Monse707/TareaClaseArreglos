public class Arreglo {

    private final int tamanio;
    private int[] elementos;

    private String estado = "";

    public Arreglo(int tamanio){
        this.tamanio = tamanio;
        this.elementos = new int[tamanio];
    }
    int getLongitud(){
        return tamanio;
    }
    void setElemento(int indice,int valor){
        this.elementos[indice] = valor;
    }
    int getElemento( int indice){
        return elementos[indice];
    }
    void limpiar( int valor ){
        for( int i=0; i<tamanio;i++)
            this.elementos[i] = valor;
    }
    public String toString(){
        for( int i=0; i<tamanio;i++)
            estado =  estado +  String.format("%d",elementos[i]) + " ";
        return  estado;
    }
}
