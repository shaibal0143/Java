package javaProgram.oops;

class student {
    private int id;
    private String name;

    // If we use private access Modifier then we cannot use . operator so we have to
    // use getter and setter to access ...

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }

}

public class constructor2 {
    public static void main(String[] args) {
        student obj = new student();
        obj.setName = ("Shaibal kumar Pathak");
        obj.setId = 32;
        System.out.println(obj.getName());
        System.out.println(obj.getId());

    }

}
