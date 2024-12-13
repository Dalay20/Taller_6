public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private Departamento departamento;
    private double tarifaHora;
    private String genero;

    public Empleado(){}

    public Empleado(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento,String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this.genero= genero;
        this.genero=genero;
    }

   
    public double calcularSalario() { // replace nested conditions with guard clauses
        double salarioTotal=0;

        if (isValidSalary()){
           salarioTotal=calculateFromHours();
        } else {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
        salarioTotal = departamento.getSalary(salarioTotal);
        
        return salarioTotal;
    }
                             
    private double calculateFromHours() {
        double result = salarioBase;
        if(horasTrabajadas>40){
            result += (horasTrabajadas - 40) *50.0;
        } 
        return result;
    }

    private boolean isValidSalary() {              
        if (salarioBase < 0) {
            return false;
        }
        if (horasTrabajadas < 0) {
            return false;
        }
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    // Más metodos
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salarioBase);
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento.getClass().getSimpleName());
        System.out.println("Género: " + genero);
    }
}
