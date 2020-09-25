package homework4;

/**
 * @AlanLin 2020/6/19
 */
public class Student {
    String name;
    String stuNum;

    public void play(Instrument instrument){
        System.out.println(name+"正在演奏");
        instrument.play();
    }

    public Student(String name, String stuNum) {
        this.name = name;
        this.stuNum = stuNum;
    }
}
