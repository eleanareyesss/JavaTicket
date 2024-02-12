
package java_ticket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Date;

public class SistemaEventos {
    private List<Evento> eventosCreados;

    // Constructor y otros métodos para tu sistema...

    // Método para obtener eventos realizados
    public List<Evento> obtenerEventosRealizados() {
        List<Evento> eventosRealizados = new ArrayList<>();
        
        // Obtener la fecha actual
        Date fechaActual = new Date();

        for (Evento evento : eventosCreados) {
            // Comparar la fecha del evento con la fecha actual
            if (evento.getFechaEvento().before(fechaActual)) {
                eventosRealizados.add(evento);
            }
        }

        return eventosRealizados;
    }

    // Método para listar eventos realizados y mostrar estadísticas
    public void listarEventosRealizados() {
        List<Evento> eventosRealizados = obtenerEventosRealizados();

        // Ordenar eventos por fecha de forma descendente (más reciente al más viejo)
        Collections.sort(eventosRealizados, Comparator.comparing(Evento::getFechaEvento).reversed());

        // Variables para estadísticas
        int deportivos = 0;
        int religiosos = 0;
        int musicales = 0;
        double montoTotalDeportivos = 0;
        double montoTotalReligiosos = 0;
        double montoTotalMusicales = 0;

        // Formateador de fecha
        SimpleDateFormat formatoFecha = new SimpleDateFormat("MMM d, y");

        // Mostrar información de eventos realizados
        System.out.println("CODIGO\tTIPO\tTITULO\tFECHA\t\t\tMONTO");
        System.out.println("-----------------------------------------------");

        for (Evento evento : eventosRealizados) {
            System.out.printf("%d\t%s\t%s\t%s\t%.2f\n",
                    evento.getCodigo(),
                    evento.getTipoEvento(),
                    evento.getTituloEvento(),
                    formatoFecha.format(evento.getFechaEvento()),
                    evento.getMontoRenta());

            // Actualizar estadísticas
            switch (evento.getTipoEvento()) {
                case DEPORTIVO:
                    deportivos++;
                    montoTotalDeportivos += evento.getMontoRenta();
                    break;
                case RELIGIOSO:
                    religiosos++;
                    montoTotalReligiosos += evento.getMontoRenta();
                    break;
                case MUSICAL:
                    musicales++;
                    montoTotalMusicales += evento.getMontoRenta();
                    break;
            }
        }

        // Mostrar detalle estadístico
        System.out.println("\nDetalle Estadístico:");
        System.out.printf("Deportivos: %d eventos, Monto Total: %.2f\n", deportivos, montoTotalDeportivos);
        System.out.printf("Religiosos: %d eventos, Monto Total: %.2f\n", religiosos, montoTotalReligiosos);
        System.out.printf("Musicales: %d eventos, Monto Total: %.2f\n", musicales, montoTotalMusicales);
    }
}

