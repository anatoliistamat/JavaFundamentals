package ObjectsAndClassesExercise.OrderByAge;

public  class Person {
    String name;
    String id;
    int age;

    Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}