package mundopc;

import mx.com.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("USB C", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Gamer", 18);
        Teclado tecladoGamer = new Teclado("USB C", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        orden1.agregarComputador(computadoraHP);
        orden1.agregarComputador(computadoraGamer);

        orden1.mostrarOrden();

        orden2.agregarComputador(computadoraGamer);
        orden2.agregarComputador(  computadoraHP);

        orden2.mostrarOrden();

    }
}
