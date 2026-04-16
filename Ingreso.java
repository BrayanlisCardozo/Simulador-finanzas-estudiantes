import java.time.LocalDate;

public class Ingreso extends Transaccion {
    private String tipoIngreso;

    public Ingreso(double monto, LocalDate fecha, String descripcion, String tipoIngreso) {
        super(monto, fecha, descripcion);
        this.tipoIngreso = tipoIngreso;
    }

    public String getTipoIngreso() {
        return tipoIngreso;
    }
}