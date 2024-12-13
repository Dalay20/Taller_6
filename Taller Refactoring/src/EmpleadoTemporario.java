public class EmpleadoTemporario extends Empleado {
    private int mesesContrato;
    
    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento,genero);
        this.mesesContrato = mesesContrato;
        
    }

    @Override
    public void imprimirDetalles() {
        imprimirDetallesBase();
        System.out.println("Meses de Contrato: " + mesesContrato);
       
    }
}

