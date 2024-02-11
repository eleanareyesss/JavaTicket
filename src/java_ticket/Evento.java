
package java_ticket;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public  class Evento 
{
    protected int codigo;//el codigo de cada evento es unico
    protected String tituloEvento;
    protected String descripcion;
    protected Date fechaEvento;
    protected int montoRenta;//renta del estadio
    protected boolean eventoCancelado;
    private boolean cancelado;
    protected double multaEvento;
    //todas se ingresan desde el teclado

    public Evento(int codigo, String tituloEvento, String descripcion, Date fechaEvento, int montoRenta) {
        this.codigo = codigo;
        this.tituloEvento = tituloEvento;
        this.descripcion = descripcion;
        this.fechaEvento = fechaEvento;
        this.montoRenta = montoRenta;
        this.eventoCancelado = false;
        this.multaEvento = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTituloEvento() {
        return tituloEvento;
    }

    public void setTituloEvento(String tituloEvento) {
        this.tituloEvento = tituloEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public int getMontoRenta() {
        return montoRenta;
    }

    public void setMontoRenta(int montoRenta) {
        this.montoRenta = montoRenta;
    }

    public boolean isEventoCancelado() {
        return eventoCancelado;
    }

    public void setEventoCancelado(boolean eventoCancelado) {
        this.eventoCancelado = eventoCancelado;
    }

    public double getMultaEvento() {
        return multaEvento;
    }

    public void setMultaEvento(double multaEvento) {
        this.multaEvento = multaEvento;
    }
    
    public boolean getEventoCancelado(){
        return cancelado;
    }
    
    public void cancelarEvento() {
        Calendar hoy = Calendar.getInstance();
        Calendar unDiaAntesEvento = Calendar.getInstance();
        unDiaAntesEvento.setTime(fechaEvento);
        unDiaAntesEvento.add(Calendar.DATE, -1);

        if (hoy.before(unDiaAntesEvento)) {
            eventoCancelado = true;
            cancelado = true;
            multaEvento = 0;
        } else {
            eventoCancelado = true;
            cancelado = true;
            multaEvento = montoRenta * 0.5;
        }
    }

    public String datosCancelados() {
        if (eventoCancelado) {
            return "Estado: Cancelado, Multa: Lps." + multaEvento;
        }
        return "El evento no está cancelado";
    }

    
    
    @Override
    public String toString() {
        return "{" + " codigo=" + codigo + ", tituloEvento=" + tituloEvento + ", descripcion=" + descripcion + ", fechaEvento=" + fechaEvento + ", montoRenta=" + montoRenta +"Estado"+eventoCancelado+'}';
    }
    
    
}
