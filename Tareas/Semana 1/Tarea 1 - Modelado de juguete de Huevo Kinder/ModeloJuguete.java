//package Semana1.Tareas.Tarea1;

public class ModeloJuguete {
    public static void main(String[] args) {
        // Creando un objeto de tipo Tiburon martillo
        TiburonMartillo tiburon = new TiburonMartillo(271.125,22.1452,9.1212,1200,
                134,"Diggles","Gris",9);

        tiburon.observar();
        tiburon.camuflaje();
        tiburon.cazar();
        tiburon.comer();
        tiburon.datos();
    }
}
