/**
 * Suma dos números.
 * @param {number} a - Primer número
 * @param {number} b - Segundo número
 * @returns {number} La suma de los dos números
 * @throws {TypeError} Si alguno de los parámetros no es un número
 */
function sumar(a, b) {
  if (typeof a !== "number" || typeof b !== "number") {
    throw new TypeError("Ambos parámetros deben ser números.");
  }
  return a + b;
}

/**
 * Divide un número entre otro.
 * @param {number} a - Dividendo
 * @param {number} b - Divisor
 * @returns {number} El resultado de la división
 * @throws {Error} Si se intenta dividir por cero
 * @throws {TypeError} Si alguno de los parámetros no es un número
 */
function dividir(a, b) {
  if (typeof a !== "number" || typeof b !== "number") {
    throw new TypeError("Ambos parámetros deben ser números.");
  }
  if (b === 0) {
    throw new Error("No se puede dividir por cero.");
  }
  return a / b;
}

/**
 * Genera un mensaje de saludo personalizado.
 * @param {string} nombre - Nombre de la persona a saludar
 * @returns {string} Un saludo personalizado
 * @throws {TypeError} Si el parámetro no es una cadena de texto
 */
function generarSaludo(nombre) {
  if (typeof nombre !== "string") {
    throw new TypeError("El nombre debe ser una cadena de texto.");
  }
  return `Hola, ${nombre}! Bienvenido.`;
}

/**
 * Determina si un número es par.
 * @param {number} n - Número que se quiere comprobar
 * @returns {boolean} true si es par, false si es impar
 * @throws {TypeError} Si el parámetro no es un número
 */
function esNumeroPar(n) {
  if (typeof n !== "number") {
    throw new TypeError("El parámetro debe ser un número.");
  }
  return n % 2 === 0;
}