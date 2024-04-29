package practicos.tp3.Ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TodoList implements Iterable<Task> {
    private List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(String description) {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Task not found.");
        }
    }

    public int getTotalTasks() {
        return tasks.size();
    }

    @Override
    public Iterator<Task> iterator() {
        tasks.sort((t1, t2) -> t2.getPriority() - t1.getPriority());
        return tasks.iterator();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a new task");
            System.out.println("2. Show all tasks");
            System.out.println("3. Remove a task");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int option = 0;
            try {
                option = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (option) {
                case 1:
                    addNewTask(scanner, todoList);
                    break;
                case 2:
                    displayAllTasks(todoList);
                    break;
                case 3:
                    removeTask(scanner, todoList);
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addNewTask(Scanner scanner, TodoList todoList) {
        System.out.println("\nAdd a new task:");
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.print("Priority: ");
        int priority = 0;
        try {
            priority = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
        } catch (Exception e) {
            System.out.println(
                    "Invalid input for priority. Please enter a valid number.");
            scanner.nextLine(); // Clear input buffer
            return;
        }
        Task newTask = new Task(description, priority);
        todoList.addTask(newTask);
        System.out.println("Task added successfully.");
    }

    private static void displayAllTasks(TodoList todoList) {
        System.out.println("\nAll tasks (sorted by priority):");
        for (Task task : todoList) {
            System.out.println(task);
        }
    }

    private static void removeTask(Scanner scanner, TodoList todoList) {
        System.out.println("\nRemove a task:");
        System.out.print("Enter the description of the task to remove: ");
        String description = scanner.nextLine();
        todoList.removeTask(description);
    }
}
