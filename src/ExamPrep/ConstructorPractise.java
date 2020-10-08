package ExamPrep;

import javax.naming.Name;

public class ConstructorPractise {
   // Name fullName;
    String name;
    String surname ;
    int age;

    //default method
    public  ConstructorPractise(){
        name = "Apahe";
        surname ="werna";
        age=19;
    }

    //Parameterized constructor
    public ConstructorPractise(String name,String surname,int age){
        super();
        name +=name;
        surname+=surname;
        age +=age;
    }

    //setters and getters
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    //Getters

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static void main(String[] args) {
        ConstructorPractise cp= new ConstructorPractise();
        cp.getAge();
    }
}



