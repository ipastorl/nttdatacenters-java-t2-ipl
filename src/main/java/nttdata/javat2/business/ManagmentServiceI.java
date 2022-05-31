package nttdata.javat2.business;


/**
 * Interface Managment service i Gestión de empleados.
 */
public interface ManagmentServiceI {
    // atributos

    /**
     * Categorías de contratación
     */
    enum Categories{
        /**
         * Juniordeveloper categories.
         */
        JUNIORDEVELOPER,
        /**
         * Developer categories.
         */
        DEVELOPER,
        /**
         * Seniordeveloper categories.
         */
        SENIORDEVELOPER,
        /**
         * Analyst categories.
         */
        ANALYST,
        /**
         * Architect categories.
         */
        ARCHITECT
    }

    // métodos

    /**
     * Añade un empleado, creando su id y comprobando que no se han superado el máximo de contrataciones
     *
     * @param name      the name
     * @param categorie the categorie
     */
    void addEmployee(String name, Categories categorie);

    /**
     * Muestra por pantalla la lista de empleados contratados
     */
    void showEmployees();

    /**
     * Muestra por pantalla el número de empleados contratados hasta el momento
     */
    void showNumEmployees();
}
