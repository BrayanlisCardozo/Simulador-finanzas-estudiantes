import java.util.ArrayList;

public class SistemaFinanzas {

    private ArrayList<Ingreso> listaIngresos = new ArrayList<>();
    private ArrayList<Gasto> listaGastos = new ArrayList<>();

    public void agregarIngreso(Ingreso ingreso) {
        listaIngresos.add(ingreso);
    }

    public void agregarGasto(Gasto gasto) {
        listaGastos.add(gasto);
    }

    public void eliminarIngreso(int index) {
        listaIngresos.remove(index);
    }

    public void eliminarGasto(int index) {
        listaGastos.remove(index);
    }

    public ResumenFinanciero obtenerResumen() {
        double totalIngresos = 0;
        double totalGastos = 0;

        for (Ingreso i : listaIngresos) {
            totalIngresos += i.getMonto();
        }

        for (Gasto g : listaGastos) {
            totalGastos += g.getMonto();
        }

        return new ResumenFinanciero(totalIngresos, totalGastos);
    }
}