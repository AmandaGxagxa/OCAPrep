package OCAWarmUp;

import java.util.ArrayList;

public class Calculation2 {
    int people;
    int desks;

public Calculation2(int people){
    this.people=people;

}

    public int getDesks() {
        if(people > 50){
            return 0;
        }
        for (int i = 0; i<=people; i++){
            if(i % 4 == 0 && i !=0){
                desks++;
            }

        }
        if(people % 4 != 0){
            desks++;
        }
        return desks;
    }

    public static void main(String[] args) {
    Calculation2 calc2 = new Calculation2(50);
        System.out.println(calc2.getDesks());

    }
}
