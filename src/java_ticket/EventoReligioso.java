
package java_ticket;

import java.util.Calendar;
import java.util.Date;

public class EventoReligioso extends Evento
{
//la cantidad maxima es de 30 mil
//se cobran 2000 lps fijos por desgaste de la grama
private double seguro;
private int cantidadGente;
private int cantidadGenteConvertida;

/*la cantidad de personas convertidas esa noche*/

    public EventoReligioso(int cantidadGente, int cantidadGenteConvertidas, int codigo, String tituloEvento, String descripcion, Date fechaEvento, int montoRenta) {
        super(codigo, tituloEvento, TipoEvento.RELIGIOSO ,descripcion, fechaEvento, montoRenta);
        this.seguro = 2000;
        this.cantidadGente = cantidadGente;
        this.cantidadGenteConvertida = cantidadGenteConvertidas;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public int getCantidadGente() {
        return cantidadGente;
    }

    public void setCantidadGente(int cantidadGente) {
        this.cantidadGente = cantidadGente;
    }

    public int getCantidadGenteConvertidas() {
        return cantidadGenteConvertida;
    }

    public void setCantidadGenteConvertidas(int cantidadGenteConvertidas) {
        this.cantidadGenteConvertida = cantidadGenteConvertidas;
    }
    
    public void cancelarEvento() {
        eventoCancelado = true;
        multaEvento = 0;
    }

    @Override
    public String toString() {
        return " Evento Religioso "+" seguro "+seguro
                +" Cantidad de Gente "+cantidadGente
                +" Gente Convertida "+cantidadGenteConvertida
                +super.toString(); 
    }
    
}
