package ExamPrep;

public class LoopConstructs {
    void crazyLoop(){
        int c = 0;
        JACK: while (c < 8){
            JILL: System.out.println(c);
            if (c > 3) break JACK; else c++;
        }
    }


    public static void main(String[] args) {
        LoopConstructs loops =new LoopConstructs();
        loops.crazyLoop();
    }
}
class ChooseWisely{

        public ChooseWisely() { super(); }
        public int choose(int choice) { return 5; }
        public int choose(short choice) { return 2; }
        public int choose(long choice) { return 11; }
        public static void main(String[] path) {
            System.out.print(new ChooseWisely().choose((byte)2+1));
        }


}

class Vehicle {
    static public String getModelName() { return "Volvo"; }
    public long getRegNo() { return 12345; }
}
class Car extends Vehicle {
    static public String getModelName() { return "Toyota"; }
    public long getRegNo() { return 54321; }
}
class TakeARide {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = c;
        System.out.println("|" + v.getModelName() + "|" + c.getModelName() +
                        "|" + v.getRegNo() + "|" + c.getRegNo() +
                "|");
    }
}