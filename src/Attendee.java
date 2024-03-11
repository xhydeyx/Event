public class Attendee {
    private String name;
    private char gender;
    private int age;

    public Attendee(String name,char gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setGender(char gender){
        this.gender=gender;
    }

    public char getGender(){
        return gender;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

}
