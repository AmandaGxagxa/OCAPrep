package ExamPrep;

public class PolymophysmAndInheritance {
    public static  long sum(int i,long l){
        System.out.println(i+6);
        return i+6;
    }

    public static long sum (long l,int i){
        System.out.println(l + 5);
        return l +6;
    }

    public static void main(String[] args) {
        PolymophysmAndInheritance PandI = new PolymophysmAndInheritance();
        //will only compile when the long is custed into l , so it can
        PandI.sum(4,7l);
        PandI.sum(76l,56);
    }

}

