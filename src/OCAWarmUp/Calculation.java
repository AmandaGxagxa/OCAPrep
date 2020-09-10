package OCAWarmUp;

import java.util.ArrayList;

public class Calculation {
    ArrayList<Integer> people = new ArrayList<>();
    int desks;

    public void setNumberOfPeople(int people) {
        if (people >50){
            System.out.println("the is no more space! First come first serve.");
            return ;
        }
        for (int i = 0; i<=people; i++){
            if(i % 4 == 0 && i !=0){
            desks++;
            }
        }

        if(people %4 != 0){
            desks++;
        }
    }

    public int getDesks() {
        return desks;
    }

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        calculation.setNumberOfPeople(55);
        System.out.println(calculation.getDesks());
    }


}
