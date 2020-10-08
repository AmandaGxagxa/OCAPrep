package ExamPrep;

import java.io.*;

public class ExeptionExercise {

    static String [] fruit = {"orange","apple","pair","banana"};

    public static void main(String[] args) {
        //Index 5 out of bounds for length 4 of array fruit.
        System.out.println(fruit[5]);
    }

}

class Example {
static void open(boolean flag)throws Exception {

    }
    public static String stuff(String i) throws IOException {
        try {
            open(true);
            System.out.println("inthggggvbjn");
        } catch (IOException ioe) {
        } catch (Exception e) {
        } finally {
        }
        {
            return "done";
        }
    }


    //handling exception using throws
    public static void main(String args[]) throws IOException{

    stuff("goodest");

    }
}
class RuntimeEx{
    public static void open(boolean flag) throws RuntimeException {
        if(flag)

            throw new RuntimeException("not running");
    }
    public static void main(String[] args) { //code compiles fine but
        //Runtime exception will be
        //thrown at runtime
        open(false);
    }
}

class BasketBall {
    public static void main(String[] dribble) {
        try {
            System.out.print(1);
            throw new ClassCastException();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.print(2);
        } catch (Throwable ex) {
            System.out.print(3);
        } finally {
            System.out.print(4);
        }
        System.out.print(5);
    }
}
class ExOne extends Exception{
    void doStuff(int i){

    }
}
class Extwo extends ExOne{
    void doStuff(int i){

    }
}

class EXce{
    void doStuff(int i){
      try{

          if(i ==3 ) {
              throw new ExOne();
          }
          if( i == 7){
              throw new Extwo();
          }
      }catch (Extwo E) {

      }catch (ExOne e){

      }catch (Exception e) {

        }

    }

    public static void main(String[] args)  {
        ExOne ex1 = new ExOne();
        ex1.doStuff(3);

    }
}
//for tomorrow
class Animal{}
class Fish extends Animal{
}

class Zoo{
    Animal saw(){

        return null;
    }

}
class Aquarium extends Zoo{
    Fish saw(){
        return null;
    }
}
