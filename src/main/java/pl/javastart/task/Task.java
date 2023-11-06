package pl.javastart.task;

public class Task {
    private String name;
    private String description;
    private int priority;
    private Person person;

    public Task(String name, String description, int priority, Person person) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.person = person;
    }

    public Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public boolean highPriority() {
        return priority > 0;
    }

    public boolean mediumPriority() {
        return priority == 0;
    }

    public boolean lowPriority() {
        return priority < 0;
    }

    public void showInfoAboutPriority() {
        System.out.printf("Czy zadanie %s ma priorytet wysoki? %b\n", name, highPriority());
        System.out.printf("Czy zadanie %s ma priorytet normalny? %b\n", name, mediumPriority());
        System.out.printf("Czy zadanie %s ma priorytet niski? %b\n", name, lowPriority());
        System.out.println();
    }
}
