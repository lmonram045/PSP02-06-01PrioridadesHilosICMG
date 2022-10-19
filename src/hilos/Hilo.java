package hilos;

public class Hilo extends Thread {
    /** Constructor por defecto */
    public Hilo() {
        // Hereda la prioridad del hilo padre
    }

    /** Constructor personalizado */
    public Hilo(int prioridad) {
        // establece la prioridad
        this.setPriority(prioridad);
    }

    /** Ejecuta una tarea pesada */
    @Override
    public void run() {
        String strCadena = "";

        // agrega 30000 caracteres a una cadena vacia
        for (int i = 0; i < 20000; ++i) {
            // imiprime el valor en la salida
            strCadena += "A";
            this.yield(); //yield sugiere al planificador Java que puede seleccionar otro hilo
        }
        System.out.println("Hilo de prioridad " + this.getPriority() + " termina ahora");
    }
}
