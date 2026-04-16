import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        SistemaFinanzas sistema = new SistemaFinanzas();

        // Agregar ingresos
        sistema.agregarIngreso(new Ingreso(1000, LocalDate.now(), "Salario", "Trabajo"));

        // Agregar gastos
        sistema.agregarGasto(new Gasto(300, LocalDate.now(), "Comida", "Alimentación"));
        sistema.agregarGasto(new Gasto(200, LocalDate.now(), "Transporte", "Movilidad"));

        // Mostrar resumen
        ResumenFinanciero resumen = sistema.obtenerResumen();
        resumen.mostrarResumen();

        // Simulación
        Simulador sim = new Simulador();
        double resultado = sim.simularEscenario(1000, 700);

        System.out.println("Resultado simulación: " + resultado);
    }
}