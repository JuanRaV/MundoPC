
package mx.com.mundopc;


public class Orden {
    private final int  idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS=10;
    private int contadorComputadoras;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this. computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    public void agregarComputador(Computadora computadora){
        if(this.contadorComputadoras<MAX_COMPUTADORAS)
            this.computadoras[this.contadorComputadoras++] = computadora;      
       else
            System.out.println("Limite de computadoras alncanzazdo" + Orden.MAX_COMPUTADORAS);
    }
    
    public void mostrarOrden(){
        System.out.println("Orden #:" + this.idOrden);
        System.out.println("Computadoras de la orden #"+this.idOrden);
        for (int i = 0; i <this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i].toString());
        }
    }
}
