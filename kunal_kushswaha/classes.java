package kunal_kushswaha; //name of the folder, can go deeper by using '.' like kunal_kushswaha.code1, SEQUENCE: package->import->class(->object->call)

public class classes {
    public static void main(String[] args) {
        
        //store 5 numbers
        //int[] numbers= new int[5];
        
        //store 5 names
        //String[] names= new String[5];

        //store data of 4 students, here CLASS is used, CLASS-a named group of properties and functions OR we can say to create your own data type CLASSES are used
        //Student[] students = new Student[5];// when not initialized, the defualt value is NULL
        //how to call :- REFERENCE VAR.INSTANCE VAR (std1.roll)

        Student aryan;//this is just declaring in the stack memory
        aryan = new Student();//NEW dynamically allocated memory at runtime and return a reference variable to it stored in std1 variable
        
        //OBJECTS created in heap and REF VAR in stack therefore dynamic memory allocation is required

        
        Student sanj /*created at compile time*/= new Student();/*created at runtime, 'Student()' is a CONSTRUCTOR:- defines what happens when the object is being created, its a special type of function in the class, here its 'by default constr'*/

        // Student sanj = new Student(1101,"sanj",9.8); will call constr will3 paremeters

        //here CONSTR can be used to allocate values, by using THIS

        // sanj.roll=1101;
        // sanj.marks=9.8f;
        // sanj.names="Sanj";

        Student golu = new Student(aryan);

        sanj.greetings();
        sanj.changeName("Sanjeevini");

        System.out.println(sanj.names); //default=null
        System.out.println(sanj.roll); //default=0
        System.out.println(sanj.marks); //default=0.0
        System.out.println(sanj.branch);

        System.out.println(golu.names);
    }
    
}

class Student { //CLASS is like a template to make own OBJECTS with varying values
    // OBJECTS exist physically/physical reality, occupying space in memory; CLASS is just a set of rules or properties, just a logical construct
    // OBJECTS are instance(meaning a physical stuff) of a CLASS
    int roll;
    String names;// variables inside the object are called INSTANCE VARIABLES
    float marks;
    String branch="CSE"; //default value for branch, will be printed if no value for branch is there in the object

    void greetings(){
        System.out.println("hello my name is "+this.names);
        //here if '+this.name' then it will take the value of the object its called by    EG) kunal.greetings
    }

    void changeName(String newName){
        this.names=newName;
    }

    Student(){ //peremeters are null so this constr will be called
        this.roll=1101; //THIS is one word to access all objects (here both Sanj and Aryan)
        this.names="aryan";
        this.marks=9.8f;
    }

    Student(int roll, String naam, float marks){ //3 paremeters this will get called, THIS IS CALLED CONSTRUCTOR OVERLOADONG 
        this.roll=roll;
        names=naam; //this not used cause name and naam are diff
        this.marks=marks; //here used as its same, therefore its better to use this
    }

    Student(Student other){
        this.names=other.names; //here other is aryan and this is golu
        this.roll=other.roll;
        this.marks=other.marks;
    }

    // Student(){
        // internally it will be like Student (2205,"default name",10);
        //THATS HOW WE CALL A CONSTR FROM A CONSTR
    //     this (2205,"default name",10);
    // }
}

//primitive data types (int,bool,double,float etc) stored in stack unlike NEW