/**
 * Representa un estudiante, que es una Persona con carrera.
 */
public class estudiante extends persona {

    /** Carrera que estudia el estudiante */
    private String carrera;

    /**
     * Constructor de Estudiante.
     * @param nombre Nombre del estudiante
     * @param edad Edad del estudiante
     * @param carrera Carrera que estudia
     */
    public estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    /**
     * Muestra un mensaje indicando que está estudiando.
     */
    public void estudiar() {
        System.out.println("Estudiando " + carrera);
    }
}
