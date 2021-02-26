package ObjectsAndClassesExercise.OpinionPoll;

public class OpinionPoll {

    private String name;
    private int age;

    public OpinionPoll(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return this.name;
    }

    @Override
    public String toString(){
        return name + " - " + age;
    }

}