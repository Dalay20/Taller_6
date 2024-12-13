import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void contratarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void despedirEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public List<Empleado> obtenerEmpleadosPorHorasTrabajadasaPartirDe(int horas) {
        return empleados.stream()
                .filter(empleado -> empleado.getHorasTrabajadas() > horas)
                .collect(Collectors.toList());
    }

    // Más metodos
}

