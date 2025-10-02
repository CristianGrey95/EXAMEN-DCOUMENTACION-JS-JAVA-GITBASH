/**
 * Representa una persona con nombre y edad.
 */
public class persona {

    /** Nombre de la persona */
    private String nombre;

    /** Edad de la persona */
    private int edad;

    /**
     * Constructor de persona.
     * @param nombre Nombre de la persona
     * @param edad Edad de la persona
     */
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Saluda presentándose.
     */
    public void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }

    /**
     * Indica si la persona es mayor de edad.
     * @return true si la edad es mayor o igual a 18, false si no
     */
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}
