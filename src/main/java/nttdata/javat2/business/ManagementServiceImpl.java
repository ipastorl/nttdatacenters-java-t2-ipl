package nttdata.javat2.business;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Implementación de ManagmentServiceI la gestión de empleados, añade,
 * muestra empleados y el número de empleados
 */
public class ManagementServiceImpl implements ManagmentServiceI{
    /** Sólo podrán darse de alta un número determinado de empleados */
    private static final Integer maxEmployees = 22000;
    /** Control del número de alta e ID */
    private static Integer numEmployee = 0;
    /** Mapa empleados - categorías */
    Map<Employee, Categories> employees = new LinkedHashMap<>();


    @Override
    public void addEmployee(String name, Categories categorie) {

        // sólo si no ha alcanzado el número de altas establecido
        if (numEmployee<maxEmployees) { // el número de contrataciones no supere el máximo
            numEmployee++; // Asigna el id al nuevo empleado a la vez que cuenta
            Employee employee = new Employee(numEmployee, name);
            employees.put( employee, categorie);
        } else {
            String showinfo = "Se ha alcanzado el número máximo de contrataciones, "
                    .concat("el empleado con id ")
                    .concat(String.valueOf(numEmployee))
                    .concat("no ha sido insertado");
            System.out.println(showinfo);
        }
    }

    @Override
    public void showEmployees() {
        // iterar por el Mapa empleados
        Set<Map.Entry<Employee, Categories>> emp = employees.entrySet();
        for (Map.Entry<Employee, Categories> empleado : emp) {
            System.out.println(empleado);
        }
    }

    @Override
    public void showNumEmployees() {
        String showinfo = "El número de contrataciones es de : "
                .concat(String.valueOf(numEmployee))
                .concat(" empleados.");
        System.out.println(showinfo);
    }
}
