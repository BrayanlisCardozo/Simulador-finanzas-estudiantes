import java.time.LocalDate;

public class Gasto extends Transaccion {
    private String categoria;

    public Gasto(double monto, LocalDate fecha, String descripcion, String categoria) {
        super(monto, fecha, descripcion);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}