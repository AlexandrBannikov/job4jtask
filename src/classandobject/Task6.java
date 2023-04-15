package classandobject;

public class Task6 {
    private int age = 20;
    private String name;
    private String surName;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Task6() {
    }

    public Task6(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
}
