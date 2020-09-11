package OCAWarmUp;

public class Calculation {

    int desks;
    int chairs;
    public void setNumberOfPeople(int people) {
        if (people >50){
            System.out.println("the is no more space! First come first serve.");
            return ;
        }
        for (int i = 0; i<=people; i++){
            if(i % 4 == 0 && i !=0){
                chairs=chairs+4;
                desks++;
            }
        }
        if(people %4 != 0){
            chairs=people;
            desks++;
        }
    }
    public int getDesks() {
        return desks;
    }

    public int getChairs() {
        return chairs;
    }

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        calculation.setNumberOfPeople(15);
        System.out.println(calculation.getDesks());
        System.out.println(calculation.getChairs());
    }


}
