package practicos.tp3.Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista con los días de la semana
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Insertar «Juernes» en la posición 4
        daysOfWeek.add(4, "Juernes");
        System.out.println("Element at position 3: " + daysOfWeek.get(3));
        System.out.println("\nElement at position 4: " + daysOfWeek.get(4));

        // Mostrar el primer y el último elemento de la lista
        System.out.println("\nFirst element: " + daysOfWeek.get(0));
        System.out.println(
                "\nLast element: " + daysOfWeek.get(daysOfWeek.size() - 1));

        // Eliminar el elemento que contiene «Juernes»
        boolean removed = daysOfWeek.remove("Juernes");
        if (removed) {
            System.out.println("\nElement 'Juernes' removed successfully.");
        } else {
            System.out.println("\nElement 'Juernes' not found.");
        }

        // Crear un iterador y mostrar cada valor de la lista
        Iterator<String> iterator = daysOfWeek.iterator();
        System.out.println("\nValues of the list:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Comprobar si «lunes» existe en la lista (distingue mayúsculas de
        // minúsculas)
        boolean containsLunes = daysOfWeek.contains("monday");
        System.out.println(
                "\nDoes 'monday' exist in the list? " + containsLunes);

        // Comprobar si «lunes» existe en la lista (no distingue mayúsculas de
        // minúsculas)
        boolean containsLunesIgnoreCase = false;
        for (String day : daysOfWeek) {
            if (day.equalsIgnoreCase("monday")) {
                containsLunesIgnoreCase = true;
                break;
            }
        }
        System.out.println(
                "\nDoes 'monday' exist in the list (case-insensitive)? " +
                        containsLunesIgnoreCase);

        // Borrar todos los elementos de la lista
        daysOfWeek.clear();
        System.out.println("\nList cleared.");
    }
}
