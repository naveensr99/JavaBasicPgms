package Inheritance;

public class ChildClass extends  ParentClass{

    public void stop(){
        System.out.println("childclass stopped");
    }

    @Override
    public  void start(){
        System.out.println("childclass started");
    }

    public void demo(){

    }

    //Downcasting is not possible
    //we cannot override static methods
    //We can increase the visibility of the access specifiers but cannot decrease it
    //Whenever we are trying to accss the overriden method of cheild class using parent obj ref then it will call
    //child class method only

    //Multiple inheritance=not possible ? to avooid the abguity
    //Multilevel inheritance

    //Calss A
    //Class B extends ClassA
    //Class C extendds Class A this is called hireachial inheritance












}
