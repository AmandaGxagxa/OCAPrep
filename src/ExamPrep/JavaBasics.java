package ExamPrep;

public class JavaBasics {


}

class DataTypes{
    double d1 = 5f;
    double d2 = 5.0;
    float f1 = 5f;
    float f2 = 5.0f;

    double def;
    int i;
    short s;
    long l;
    float f ;
    public static void main(String args[] ){
        DataTypes dt = new DataTypes();
        System.out.println(dt.i);
        System.out.println(dt.def);
        System.out.println(dt.f);
        System.out.println(dt.l);

    }

}
class DataTypesPart2{
    double d1 = 5f;
    double d2 = 5.0;
    float f1 = 5f;
    float f2 = 5.0f;
    char c = 180;
    double def;
    int i;
    short s;
    long l;
    float f ;

    public static void main(String args[] ){
        DataTypes dt = new DataTypes();
        String s1, s2 , s3;
//        i1 = i2 = i3 = "hello";
//     System.out.println(i1);
        long l1 = 10;
        byte b1 =6;
        long results = l1+b1;
        System.out.println(results);
        String chair, table = "metal";
//        chair = chair + table;
//        System.out.println(chair);


        //the code run only when casted in tp an int. A long is bigger than int therefore it cant fit on int.g][
        long l2 = 2;
        int i1= (int) l2 +100;
        System.out.println(i1);
        //
        int i3= 40;
        int i4 = 10;
        int i5 = i3 +(int) (i4/12.7);
        System.out.println(i5);

    }

}

class InitClass{
    public static void main(String args[] ){
        InitClass obj = new InitClass(5);
    }
    int m;
    static int i1 = 5;
    static int i2 ;
    int  j = 100;
    int x;
    public InitClass(int m){
        System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
    }
    { j = 30; i2 = 40; }  // Instance Initializer
    static { i1++; }      // Static Initializer
}
class Switcher{

    public static void main(String[] args){
        Byte b1 = (byte)100;
int sale =1;
        int a =1;
        System.out.println(a++ + a++ + ++a);
        System.out.println(sale++ + ++sale + ++sale);
//        if(b) System.out.println(args[2]);
    }

}