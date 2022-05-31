package nttdata.javat2;


import nttdata.javat2.business.ManagementServiceImpl;
import nttdata.javat2.business.ManagmentServiceI;

/**
 * Clase principal en la que se usan los métodos de MANAGMENT_SERVICE
 */
public class T2MainIPL {
    private static final ManagmentServiceI MANAGMENT_SERVICE = new ManagementServiceImpl();

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        MANAGMENT_SERVICE.addEmployee("Ricardo Argüelles Miranda", ManagmentServiceI.Categories.ANALYST);
        MANAGMENT_SERVICE.addEmployee("Isabel Pastor López", ManagmentServiceI.Categories.JUNIORDEVELOPER);
        MANAGMENT_SERVICE.addEmployee("Alfonso Tacón Jiménez", ManagmentServiceI.Categories.JUNIORDEVELOPER);
        MANAGMENT_SERVICE.addEmployee("Jose María García Durán", ManagmentServiceI.Categories.ARCHITECT);
        MANAGMENT_SERVICE.addEmployee("Ana Castilla Ordoñez", ManagmentServiceI.Categories.SENIORDEVELOPER);
        MANAGMENT_SERVICE.addEmployee("Encarni Gracia Miraflores", ManagmentServiceI.Categories.DEVELOPER);

        MANAGMENT_SERVICE.showNumEmployees();

        MANAGMENT_SERVICE.showEmployees();
    }
}
