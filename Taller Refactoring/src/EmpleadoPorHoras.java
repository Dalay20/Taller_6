public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        super(nombre, 0, horasTrabajadas, departamento, genero);
        super.setSalarioBase(calcularSalario());
        this.tarifaHora = tarifaHora;
    }

    public void imprimirDetalles() {
        imprimirDetallesBase();
        System.out.println("tarifaHora: " + tarifaHora);
    }

    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * tarifaHora;
    }

    // Más metodos
}
