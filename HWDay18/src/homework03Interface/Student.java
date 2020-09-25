package homework03Interface;

/**
 * @AlanLin 2020/6/20
 */
public class Student {
    String name;
    String id;
    public void play(Instrument instrument){
        System.out.print(name);
        instrument.play();
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Student() {
    }
}
