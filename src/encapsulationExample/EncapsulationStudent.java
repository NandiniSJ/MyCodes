package encapsulationExample;

class EncapsulationStudent {

    private String name;
    private int age;
    private int rollNum;
    private double GPA;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getRollNum(){
        return rollNum;
    }

    public double getGPA(){
        return GPA;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setRollNum(int newRollNum){
        rollNum = newRollNum;
    }

    public void setGPA(double newGPA){
        GPA = newGPA;
    }
}


