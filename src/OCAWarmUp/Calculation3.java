package OCAWarmUp;

public class Calculation3 implements ForDesks,ForPeople {
    public int people;
    public int desks;


    @Override
    public void getPeople(int people) {
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
    @Override
    public int getDesks() {
        return desks;
    }
    public static void main(String[] args) {
        Calculation3 calc3 = new Calculation3();
        calc3.getPeople(8) ;
        System.out.println(calc3.getDesks());

    }
}

