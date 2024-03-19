public class Attendee {
    private String name;
    private char gender;
    private int age;
    private String seatNo;

    public Attendee(String name,char gender,int age,String seat){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.seatNo=seat;
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

    public void setSeatNo(String seatNo){
        this.seatNo=seatNo;
    }

    public String getSeatNo(){
        return seatNo;
    }

    @Override
    public String toString(){
        return "\n"+"Name:"+name+"\n"
        +"Gender:"+gender+"\n"
        +"Age:"+age+"\n"
        +"Seat No.:"+seatNo;
    }

}
