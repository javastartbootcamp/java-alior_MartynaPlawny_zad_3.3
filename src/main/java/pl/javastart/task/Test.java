package pl.javastart.task;

public class Test {

    public static void main(String[] args) {
        Person person1 = new Person("Anna", "Jankowska");
        Person person2 = new Person("Andrzej", "Mak");
        Person person3 = new Person("Joanna", "Sielska");
        Task task1 = new Task("washing", "washing dirty clothes");
        Task task2 = new Task("vacuuming", "vacuuming all house", 90);
        Task task3 = new Task("cleaning the floor", "cleaning the floor in all rooms", 30, person1);
        Task task4 = new Task("window washing", "window washing in the kitchen", -9, person2);
        Task task5 = new Task("washing dishes", "washing dirty dishes", 0, person3);

        task1.showInfoAboutPriority();
        task2.showInfoAboutPriority();
        task3.showInfoAboutPriority();
        task4.showInfoAboutPriority();
        task5.showInfoAboutPriority();
    }
}
