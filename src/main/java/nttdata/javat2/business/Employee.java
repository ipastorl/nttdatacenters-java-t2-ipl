package nttdata.javat2.business;

import java.util.Objects;

/**
 * La clase Employee registra el id de empleado, categoría, nombre de la empresa,
 * máximo de altas permitidas y un número de control que no podrá alcanzar el máximo
 * de altas establecido.
 */
public class Employee {
    // atributos
    /** Número identificativo del empleado autoincremental */
    private Integer id;
    /** Nombre del empleado */
    private String name;
    /** Nombre de la empresa */
    private static final String BUSINESS = "NTT Data";


    /**
     * Constructor Empleado
     *
     * @param id   the id
     * @param name the name
     */
    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    // getters and setters
    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    protected void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", empresa = " + BUSINESS +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId().equals(employee.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
