public class doc {
    /**
     * Genera un mensaje de saludo personalizado.
     * @param nombre Nombre de la persona a saludar
     * @return Un saludo personalizado
     */
    public String generarSaludo(String nombre) {
        return "Hola, " + nombre + "! Bienvenido.";
    }

    /**
     * Determina si un número es par.
     * @param n Número a comprobar
     * @return true si es par, false si es impar
     */
    public boolean esNumeroPar(int n) {
        return n % 2 == 0;
    }
}
