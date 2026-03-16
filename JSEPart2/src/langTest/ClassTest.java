package langTest;

import java.lang.reflect.Constructor;

public class ClassTest {
    public static void main(String[] args) {
        Student student = new Student();
        Class c = student.getClass();
        Constructor[] constructors = c.getConstructors();
        for (Constructor con : constructors){

        }

    }
}
