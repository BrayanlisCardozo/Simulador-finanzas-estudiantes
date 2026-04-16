import java.time.LocalDate;

public abstract class Transaccion {
    protected double monto;
    protected LocalDate fecha;
    protected String descripcion;

    public Transaccion(double monto, LocalDate fecha, String descripcion) {
        this.monto = monto;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}