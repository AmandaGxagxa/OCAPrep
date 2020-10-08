package ExamPrep;

public class initializatioandstatic {

        int a;
        static int b;
        {
            a ++;
            b= 45;
        }
        static {
            b = 132;

        }
        initializatioandstatic(){
            a=123;
            b=23;
        }

}

class sub extends initializatioandstatic{
    static {
        b =222;
    }

    public static void main(String[] args) {
        initializatioandstatic init = new initializatioandstatic();
        sub sub = new sub();
        System.out.println(init.a);
        System.out.println(init.b);
        System.out.println(sub.b);

    }

}