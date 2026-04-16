public class ResumenFinanciero {

    private double totalIngresos;
    private double totalGastos;

    public ResumenFinanciero(double totalIngresos, double totalGastos) {
        this.totalIngresos = totalIngresos;
        this.totalGastos = totalGastos;
    }

    public double calcularBalance() {
        return totalIngresos - totalGastos;
    }

    public double calcularPorcentajeGasto() {
        if (totalIngresos == 0) return 0;
        return (totalGastos / totalIngresos) * 100;
    }

    public void mostrarResumen() {
        System.out.println("Total Ingresos: " + totalIngresos);
        System.out.println("Total Gastos: " + totalGastos);
        System.out.println("Balance: " + calcularBalance());
        System.out.println("Porcentaje de gasto: " + calcularPorcentajeGasto() + "%");
    }
}