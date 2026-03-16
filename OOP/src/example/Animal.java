package example;

class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void eat() {
        System.out.println(name+"is eating...");
    }
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void bark(){
        System.out.println(getName() + "says :: Woof Woof");
    }
}

