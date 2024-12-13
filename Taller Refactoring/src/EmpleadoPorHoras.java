public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;
<<<<<<< Updated upstream

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento,
            String genero) {
        super(nombre, 0, horasTrabajadas, departamento, genero);
        super.setSalarioBase(calcularSalario());
        this.tarifaHora = tarifaHora;
    }

    public void imprimirDetalles() {
        imprimirDetallesBase();
        System.out.println("tarifaHora: " + tarifaHora);
=======
    

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        super(nombre, 0, horasTrabajadas, departamento,genero);
        super.setSalarioBase(calcularSalario());
        this.tarifaHora = tarifaHora;
        
>>>>>>> Stashed changes
    }

    @Override
    public double calcularSalario() {
<<<<<<< Updated upstream
        return super.getHorasTrabajadas() * tarifaHora;
    }

    // Más metodos
}
=======
        return super.getHorasTrabajadas()*tarifaHora;
        return super.getHorasTrabajadas() * super.getTarifaHora();
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Tarifa por Hora: " + tarifaHora);
        

    }
}
>>>>>>> Stashed changes
