package ExamPrep;

public class EvaluateStatic {
    static int numb = 15;

    public static void main(String[] args) {
        EvaluateStatic.numb= 55;
        EvaluateStatic p1 = new EvaluateStatic();
        EvaluateStatic p2 = new EvaluateStatic();
        System.out.println(p1.numb);
        System.out.println(p2.numb);

        p1.numb = 35;

        System.out.println(p1.numb);
        System.out.println(p2.numb);
        System.out.println(EvaluateStatic.numb);
        int i = 0;
        int j = 1;
        if( (i++ == 0) & (j++ == 2) ){
            i = 12;
        }
        System.out.println(i+" "+j);
    }
}

