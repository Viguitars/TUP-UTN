import java.util.ArrayList;
import java.util.regex.*;
import java.util.Scanner;

/*
 * Las expresiones regulares (también conocidas como regex o regexp) son
 * patrones que definen un conjunto de cadenas de texto. Son una herramienta
 * poderosa para buscar, manipular y validar cadenas de caracteres. Aquí tienes
 * una introducción a los conceptos básicos de las expresiones regulares:
 * 
 * Caracteres Literales: Los caracteres literales son aquellos que coinciden
 * exactamente con ellos mismos. Por ejemplo, la expresión regular "hello"
 * coincidirá con la cadena "hello".
 * 
 * Caracteres Especiales: Los caracteres especiales tienen significados
 * especiales en las expresiones regulares. Algunos ejemplos de caracteres
 * especiales son:
 * . (punto): Coincide con cualquier carácter excepto un salto de línea.
 * (asterisco): Coincide con cero o más repeticiones del carácter o patrón
 * anterior.
 * + (signo más): Coincide con una o más repeticiones del carácter o patrón
 * anterior.
 * ? (signo de interrogación): Coincide con cero o una repetición del carácter o
 * patrón anterior.
 * | (barra vertical): Es un operador OR que permite alternar entre varias
 * opciones.
 * 
 * Cuantificadores: Los cuantificadores se utilizan para especificar el número
 * de repeticiones de un carácter o grupo. Algunos ejemplos de cuantificadores
 * son:
 * {n}: Coincide exactamente con n repeticiones.
 * {n,}: Coincide con al menos n repeticiones.
 * {n,m}: Coincide con un rango entre n y m repeticiones.
 * Grupos: Los grupos se utilizan para agrupar varios caracteres o patrones
 * juntos. Los paréntesis ( y ) se utilizan para definir grupos. Por ejemplo,
 * (abc)+ coincidirá con "abc", "abcabc", etc.
 * 
 * Ejemplos de patrones comunes de expresiones regulares:
 */
class EmailValidation {
    public static void main(String[] args) {
        String email = "user@example.com";
        String pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Correo electrónico válido");
        } else {
            System.out.println("Correo electrónico no válido");
        }
    }
}

/*
 * Direcciones de correo electrónico:
 * 
 * Explicación del patrón:
 * El patrón ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$ se usa para
 * validar direcciones de correo electrónico.
 * Veamos los elementos clave:
 * ^ y $ son anclas que indican que la cadena debe coincidir completamente con
 * el patrón.
 * [a-zA-Z0-9._%+-]+ coincide con el nombre de usuario, que puede contener
 * letras, números y ciertos caracteres especiales.
 * 
 * @ coincide con el carácter '@' literal.
 * [a-zA-Z0-9.-]+ coincide con el dominio, que también puede contener letras,
 * números y algunos caracteres especiales.
 * \\. coincide con el carácter '.' literal, que separa el nombre de dominio del
 * dominio de nivel superior (TLD).
 * [a-zA-Z]{2,} coincide con el TLD, que debe contener al menos 2 letras.
 */
class PhoneNumberValidation {
    public static void main(String[] args) {
        String phoneNumber = "123-456-7890";
        String pattern = "^\\d{3}-\\d{3}-\\d{4}$";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.println("Número de teléfono válido");
        } else {
            System.out.println("Número de teléfono no válido");
        }
    }
}

/*
 * Números de teléfono:
 * 
 * Explicación del patrón:
 * El patrón ^\\d{3}-\\d{3}-\\d{4}$ se usa para validar números de teléfono en
 * formato "###-###-####".
 * Veamos los elementos clave:
 * ^ y $ son anclas para marcar el inicio y el final de la cadena.
 * \\d coincide con cualquier dígito numérico.
 * {3} indica que debe haber exactamente 3 dígitos consecutivos.
 * - coincide con el carácter '-' literal.
 */
class URLValidation {
    public static void main(String[] args) {
        String url = "http://www.example.com";
        String pattern = "^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(/[^/\\s]*)?$";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(url);

        if (matcher.matches()) {
            System.out.println("URL válida");
        } else {
            System.out.println("URL no válida");
        }
    }
}

/*
 * URLs:
 * 
 * Explicación del patrón:
 * El patrón ^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(/[^/\\s]*)?$
 * se usa para validar URLs.
 * Veamos los elementos clave:
 * ^ y $ son anclas para marcar el inicio y el final de la cadena.
 * (http|https) es un grupo que coincide con "http" o "https".
 * :// coincide con los dos puntos y las barras diagonales dobles que siguen al
 * protocolo.
 * [a-zA-Z0-9.-]+ coincide con el nombre de dominio, que puede contener letras,
 * números y algunos caracteres especiales.
 * \\. coincide con el carácter '.' literal.
 * [a-zA-Z]{2,} coincide con el TLD, que debe contener al menos 2 letras.
 * (/[^/\\s]*)? es un grupo opcional que permite segmentos de URL adicionales
 * después del nombre de dominio.
 */
class DateValidation {
    public static void main(String[] args) {
        String date = "12/31/2022";
        String pattern = "^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/\\d{4}$";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(date);

        if (matcher.matches()) {
            System.out.println("Fecha válida");
        } else {
            System.out.println("Fecha no válida");
        }
    }
}

/*
 * Fechas (Formato MM/DD/AAAA):
 * 
 * Explicación del patrón:
 * El patrón ^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/\\d{4}$
 * se usa para validar fechas en formato "MM/DD/AAAA".
 * Veamos los elementos clave:
 * ^ y $ son anclas para marcar el inicio y el final de la cadena.
 * (0[1-9]|1[0-2]) es un grupo que coincide con el mes (01-12) con el cero
 * opcional para valores menores de 10.
 * (/) coincide con el carácter '/' literal que separa el mes y el día.
 * (0[1-9]|[12][0-9]|3[01]) es un grupo que coincide con el día (01-31) con el
 * cero opcional para valores menores de 10.
 * (/) coincide con otro carácter '/' que separa el día y el año.
 * \\d{4} coincide con el año, que debe tener 4 dígitos.
 */
class IPAddressValidation {
    public static void main(String[] args) {
        String ipAddress = "192.168.1.1";
        String pattern = "^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(ipAddress);

        if (matcher.matches()) {
            System.out.println("Dirección IP válida");
        } else {
            System.out.println("Dirección IP no válida");
        }
    }
}

/*
 * Direcciones IP:
 * 
 * Explicación del patrón:
 * El patrón ^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$ se usa para validar
 * direcciones IP.
 * Veamos los elementos clave:
 * ^ y $ son anclas para marcar el inicio y el final de la cadena.
 * (\\d{1,3}) es un grupo que coincide con un número de 1 a 3 dígitos.
 * (\\.) coincide con el carácter '.' literal que separa los grupos de números.
 */
class NumberValidation {
    public static void main(String[] args) {
        String number = "-123.45";
        String pattern = "^-?\\d+(\\.\\d+)?$";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(number);

        if (matcher.matches()) {
            System.out.println("Número válido");
        } else {
            System.out.println("Número no válido");
        }
    }
}
/*
 * Números enteros o decimales:
 * 
 * Explicación del patrón:
 * El patrón ^-?\\d+(\\.\\d+)?$ se usa para validar números enteros o decimales.
 * Veamos los elementos clave:
 * ^ y $ son anclas para marcar el inicio y el final de la cadena.
 * ^-? permite un signo negativo opcional al principio.
 * \\d+ coincide con uno o más dígitos enteros.
 * (\\.) coincide con el carácter '.' literal.
 * (\\d+)? permite un decimal opcional después del punto.
 */

/* EJERCICIOS */

/* Comprobar si el String cadena no acaba con un dígito. */
class TP12Ejercicio1 {
    public static void main(String[] args) {
        String cadena = "Juan";

        boolean noTerminaConDigito = !cadena.matches(".*\\d$");

        if (noTerminaConDigito) {
            System.out.println(cadena + " no termina con un dígito.");
        } else {
            System.out.println(cadena + " termina con un dígito.");

        }

    }
}

/* Comprobar si el String cadena no empieza por un dígito. */
class TP12Ejercicio2 {
    public static void main(String[] args) {
        String cadena = "Juan";

        boolean noEmpiezaConDigito = !cadena.matches("^\\d.*");

        if (noEmpiezaConDigito) {
            System.out.println(cadena + " no empieza con un dígito.");
        } else {
            System.out.println(cadena + " empieza con un dígito.");

        }

    }
}

/*
 * Comprobar si el String cadena está formado por un mínimo de 5 letras
 * mayúsculas o minúsculas y un máximo de 10.
 */
class TP12Ejercicio3 {
    public static void main(String[] args) {
        String cadena = "Sebastian";

        boolean cumpleLongitud = cadena.matches("^[a-zA-Z]{5,10}$");

        if (cumpleLongitud) {
            System.out.println(cadena + " es válido.");
        } else {
            System.out.println(cadena + " no es válido.");

        }

    }
}

/* Validar el ingreso de un DNI (xx-xxx-xxx). */
class TP12Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese número de documento:");
        String dni = sc.nextLine();

        boolean esDNIValido = dni.matches("^\\d{2}-\\d{3}-\\d{3}$");

        if (esDNIValido) {
            System.out.println("Documento válido");
        } else {
            System.out.println("Documento no válido");
        }

        sc.close();
    }
}

/*
 * Guardar en un arraylist una serie de mails, pero antes de ser guardados deben
 * cumplir con las condiciones de las expresiones regulares.
 */
class TP12Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaDeMails = new ArrayList<>();

        String email;

        do {
            System.out.println("Ingrese email (0 para finalizar):");
            email = sc.nextLine();

            if (email.equals("0")) {
                break;
            }

            if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                listaDeMails.add(email);
            } else {
                System.out.println("Email no válido.");
            }

        } while (true);

        System.out.println("Lista de emails válidos:");
        for (String valido : listaDeMails) {
            System.out.println(valido);
        }

        sc.close();

    }
}

/* Comprobar si el String cadena contiene “abc”. */
class TP12Ejercicio6 {
    public static void main(String[] args) {
        String cadena = "Santiabcgo";

        boolean contieneABC = cadena.contains("abc");

        if (contieneABC) {
            System.out.println(cadena + " contiene 'abc'.");
        } else {
            System.out.println(cadena + " no contiene 'abc'.");

        }

    }
}