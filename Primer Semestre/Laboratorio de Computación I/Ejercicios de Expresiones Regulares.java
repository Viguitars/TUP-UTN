import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Validación de Teléfono: Escribe un programa que solicite al usuario su número
 * de teléfono. Utiliza la validación de teléfono proporcionada para garantizar
 * que el número tenga entre 7 y 10 dígitos.
 */
class ValidacionTelefono {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronTel = "[0-9]{7,10}";
        System.out.println("Ingrese su número de teléfono: ");
        String telefono = sc.nextLine();
        Pattern patternTel = Pattern.compile(patronTel);
        Matcher matcherTel = patternTel.matcher(telefono);

        if (matcherTel.matches()) {
            System.out.println("Número de teléfono válido.");
        } else {
            System.out.println("Por favor, ingrese un número de teléfono válido.");
        }

        sc.close();
    }
}

/*
 * Validación de CUIL: Crea un programa que pida al usuario su número de CUIL.
 * Utiliza la validación de CUIL proporcionada para verificar que el número
 * tenga exactamente 11 dígitos.
 */
class ValidacionCUIL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronCUIL = "[0-9]{11}";
        System.out.println("Ingrese su número de CUIL: ");
        String cuil = sc.nextLine();
        Pattern patternCUIL = Pattern.compile(patronCUIL);
        Matcher matcherCUIL = patternCUIL.matcher(cuil);

        if (matcherCUIL.matches()) {
            System.out.println("Número de CUIL válido.");
        } else {
            System.out.println("Por favor, ingrese un número de CUIL válido.");
        }

        sc.close();
    }
}

/*
 * Validación de Correo Electrónico: Desarrolla un programa que solicite una
 * dirección de correo electrónico. Utiliza la validación de correo electrónico
 * proporcionada para asegurarte de que la dirección cumple con un formato de
 * correo electrónico válido.
 */
class ValidacionCorreoElectronico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronCorreo = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        System.out.println("Ingrese su dirección de correo electrónico: ");
        String correo = sc.nextLine();
        Pattern patternCorreo = Pattern.compile(patronCorreo);
        Matcher matcherCorreo = patternCorreo.matcher(correo);

        if (matcherCorreo.matches()) {
            System.out.println("Correo electrónico válido.");
        } else {
            System.out.println("Por favor, ingrese una dirección de correo electrónico válida.");
        }

        sc.close();
    }
}

/*
 * Validación de Nomenclatura: Escribe un programa que requiera al usuario
 * ingresar una nomenclatura de 22 caracteres. Usa la validación de nomenclatura
 * para comprobar que la entrada tiene la longitud y el formato correctos.
 */
class ValidacionNomenclatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronNomenclatura = "[A-Za-z0-9]{22}";
        System.out.println("Ingrese la nomenclatura (22 caracteres alfanuméricos): ");
        String nomenclatura = sc.nextLine();
        Pattern patternNomenclatura = Pattern.compile(patronNomenclatura);
        Matcher matcherNomenclatura = patternNomenclatura.matcher(nomenclatura);

        if (matcherNomenclatura.matches()) {
            System.out.println("Nomenclatura válida.");
        } else {
            System.out.println("Por favor, ingrese una nomenclatura válida de 22 caracteres alfanuméricos.");
        }

        sc.close();
    }
}

/*
 * Validación de Letras: Crea un programa que pida al usuario ingresar un
 * nombre. Utiliza la validación de letras para asegurarte de que solo contenga
 * letras y tenga entre 7 y 10 caracteres.
 */

class ValidacionLetras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronLetras = "^[A-Za-z]{7,10}$";
        System.out.println("Ingrese un nombre: ");
        String nombre = sc.nextLine();
        Pattern patternLetras = Pattern.compile(patronLetras);
        Matcher matcherLetras = patternLetras.matcher(nombre);

        if (matcherLetras.matches()) {
            System.out.println("Nombre válido.");
        } else {
            System.out.println(
                    "Por favor, ingrese un nombre válido que contenga solo letras y tenga entre 7 y 10 caracteres.");
        }

        sc.close();
    }
}

/*
 * Combinación de Validaciones: Desarrolla un programa que solicite al usuario
 * su número de teléfono, CUIL y correo electrónico. Aplica las validaciones
 * adecuadas a cada entrada.
 */

class CombinacionValidaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronTel = "[0-9]{7,10}";
        System.out.println("Ingrese su número de teléfono: ");
        String telefono = sc.nextLine();
        Pattern patternTel = Pattern.compile(patronTel);
        Matcher matcherTel = patternTel.matcher(telefono);

        String patronCUIL = "[0-9]{11}";
        System.out.println("Ingrese su número de CUIL: ");
        String cuil = sc.nextLine();
        Pattern patternCUIL = Pattern.compile(patronCUIL);
        Matcher matcherCUIL = patternCUIL.matcher(cuil);

        String patronMail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        System.out.println("Ingrese su correo electrónico: ");
        String correo = sc.nextLine();
        Pattern patternMail = Pattern.compile(patronMail);
        Matcher matcherMail = patternMail.matcher(correo);

        if (matcherTel.matches() && matcherCUIL.matches() && matcherMail.matches()) {
            System.out.println("Datos válidos.");
        } else {
            System.out.println("Por favor, ingrese datos válidos según las indicaciones.");
        }

        sc.close();
    }
}

/*
 * Validación de Correo Electrónico Múltiple: Escribe un programa que permita al
 * usuario ingresar una lista de correos electrónicos separados por comas.
 * Aplica la validación de correo electrónico a cada dirección y muestra un
 * mensaje de error si alguna de ellas es inválida.
 */
class ValidacionCorreoElectronicoMultiple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronMailMultiple = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        System.out.println("Ingrese una lista de correos electrónicos separados por comas: ");
        String correos = sc.nextLine();
        String[] listaCorreos = correos.split(",");
        Pattern patternMailMultiple = Pattern.compile(patronMailMultiple);

        for (String correo : listaCorreos) {
            Matcher matcherMailMultiple = patternMailMultiple.matcher(correo.trim());
            if (matcherMailMultiple.matches()) {
                System.out.println("Correo válido: " + correo.trim());
            } else {
                System.out.println("Correo inválido: " + correo.trim());
            }
        }

        sc.close();
    }
}

/*
 * Validación de Teléfono Internacional: Crea un programa que solicite al
 * usuario un número de teléfono internacional. Utiliza una variante de la
 * validación de teléfono para aceptar números que contengan el prefijo
 * internacional.
 */
class ValidacionTelefonoInternacional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronTelefonoInternacional = "\\+?[0-9]+";
        System.out.println("Ingrese su número de teléfono internacional: ");
        String telefonoInternacional = sc.nextLine();
        Pattern patternTelefonoInternacional = Pattern.compile(patronTelefonoInternacional);
        Matcher matcherTelefonoInternacional = patternTelefonoInternacional.matcher(telefonoInternacional);

        if (matcherTelefonoInternacional.matches()) {
            System.out.println("Número de teléfono internacional válido.");
        } else {
            System.out.println("Por favor, ingrese un número de teléfono internacional válido.");
        }

        sc.close();
    }
}

/*
 * Validación de Correo Electrónico Personalizado: Desarrolla un programa que
 * requiera una dirección de correo electrónico. Utiliza una versión
 * personalizada de la validación de correo electrónico que acepte solo dominios
 * de correo electrónico específicos (por ejemplo, "miempresa.com").
 */
class ValidacionCorreoElectronicoPersonalizado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dominioPermitido = "miempresa\\.com";
        String patronCorreoPersonalizado = "^[A-Za-z0-9._%+-]+@" + dominioPermitido + "$";
        System.out.println("Ingrese su dirección de correo electrónico con dominio " + dominioPermitido + ": ");
        String correoPersonalizado = sc.nextLine();
        Pattern patternCorreoPersonalizado = Pattern.compile(patronCorreoPersonalizado);
        Matcher matcherCorreoPersonalizado = patternCorreoPersonalizado.matcher(correoPersonalizado);

        if (matcherCorreoPersonalizado.matches()) {
            System.out.println("Dirección de correo electrónico válida para el dominio " + dominioPermitido + ".");
        } else {
            System.out.println("Por favor, ingrese una dirección de correo electrónico válida con dominio "
                    + dominioPermitido + ".");
        }

        sc.close();
    }
}

/*
 * Validación de Código Postal: Escribe un programa que pida al usuario su
 * código postal. Utiliza una versión modificada de la validación de letras que
 * permita letras y números, pero asegúrate de que tenga el formato correcto.
 */
class ValidacionCodigoPostal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronCodigoPostal = "[A-Za-z0-9]{5,10}";
        System.out.println("Ingrese su código postal: ");
        String codigoPostal = sc.nextLine();
        Pattern patternCodigoPostal = Pattern.compile(patronCodigoPostal);
        Matcher matcherCodigoPostal = patternCodigoPostal.matcher(codigoPostal);

        if (matcherCodigoPostal.matches()) {
            System.out.println("Código postal válido.");
        } else {
            System.out.println("Por favor, ingrese un código postal válido.");
        }

        sc.close();
    }
}

/*
 * Validación de DNI: Crea un programa que solicite al usuario su número de
 * Documento Nacional de Identidad (DNI). Utiliza una versión adaptada de la
 * validación de CUIL para asegurarte de que tenga exactamente 8 dígitos.
 */
class ValidacionDNI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronDNI = "[0-9]{8}";
        System.out.println("Ingrese su número de Documento Nacional de Identidad (DNI): ");
        String dni = sc.nextLine();
        Pattern patternDNI = Pattern.compile(patronDNI);
        Matcher matcherDNI = patternDNI.matcher(dni);

        if (matcherDNI.matches()) {
            System.out.println("Número de DNI válido.");
        } else {
            System.out.println("Por favor, ingrese un número de DNI válido.");
        }

        sc.close();
    }
}

/*
 * Validación de Usuario: Desarrolla un programa que requiera un nombre de
 * usuario. Utiliza una variante de la validación de letras que permita letras,
 * números y guiones bajos, pero asegúrate de que cumpla con ciertas
 * restricciones de longitud.
 */
class ValidacionUsuario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronUsuario = "[A-Za-z0-9_]{5,20}";
        System.out.println("Ingrese su nombre de usuario: ");
        String usuario = sc.nextLine();
        Pattern patternUsuario = Pattern.compile(patronUsuario);
        Matcher matcherUsuario = patternUsuario.matcher(usuario);

        if (matcherUsuario.matches()) {
            System.out.println("Nombre de usuario válido.");
        } else {
            System.out.println("Por favor, ingrese un nombre de usuario válido.");
        }

        sc.close();
    }
}

/*
 * Validación de Fecha: Escribe un programa que solicite al usuario una fecha en
 * formato "dd/mm/aaaa". Utiliza una versión modificada de la validación de
 * letras para comprobar que la entrada tenga el formato de fecha correcto.
 */
class ValidacionFecha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronFecha = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        System.out.println("Ingrese una fecha en formato dd/mm/aaaa: ");
        String fecha = sc.nextLine();
        Pattern patternFecha = Pattern.compile(patronFecha);
        Matcher matcherFecha = patternFecha.matcher(fecha);

        if (matcherFecha.matches()) {
            System.out.println("Fecha válida.");
        } else {
            System.out.println("Por favor, ingrese una fecha válida en formato dd/mm/aaaa.");
        }

        sc.close();
    }
}

/*
 * Validación de Dominio Web: Crea un programa que permita al usuario ingresar
 * nombres de dominio web. Aplica la validación de correo electrónico
 * personalizada para garantizar que solo se aceptan nombres de dominio válidos.
 */
class ValidacionDominioWeb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronDominioWeb = "^(www\\.)?[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,})+$";
        System.out.println("Ingrese un nombre de dominio web: ");
        String dominioWeb = sc.nextLine();
        Pattern patternDominioWeb = Pattern.compile(patronDominioWeb);
        Matcher matcherDominioWeb = patternDominioWeb.matcher(dominioWeb);

        if (matcherDominioWeb.matches()) {
            System.out.println("Nombre de dominio web válido.");
        } else {
            System.out.println("Por favor, ingrese un nombre de dominio web válido.");
        }

        sc.close();
    }
}

/*
 * Validación de Nombres de Producto: Desarrolla un programa que requiera el
 * nombre de un producto. Utiliza la validación de letras para asegurarte de que
 * solo contenga letras y tenga una longitud mínima de 5 caracteres.
 */
class ValidacionNombreProducto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronProducto = "^[A-Za-z]{5,}$";
        System.out.println("Ingrese el nombre de un producto: ");
        String nombreProducto = sc.nextLine();
        Pattern patternProducto = Pattern.compile(patronProducto);
        Matcher matcherProducto = patternProducto.matcher(nombreProducto);

        if (matcherProducto.matches()) {
            System.out.println("Nombre de producto válido.");
        } else {
            System.out.println("Por favor, ingrese un nombre de producto válido con al menos 5 letras.");
        }

        sc.close();
    }
}

/*
 * Validación de contraseña: Crea un programa que requiera una contraseña.
 * Utiliza una versión personalizada de la validación de letras y números que
 * aplique restricciones de longitud y complejidad.
 */
class ValidacionContraseña {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String patronContrasena = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        System.out.println("Ingrese una contraseña: ");
        String contrasena = sc.nextLine();
        Pattern patternContrasena = Pattern.compile(patronContrasena);
        Matcher matcherContrasena = patternContrasena.matcher(contrasena);

        if (matcherContrasena.matches()) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("La contraseña debe tener al menos 8 caracteres, incluyendo letras y números.");
        }

        sc.close();
    }
}
