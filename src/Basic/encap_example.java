package Basic;

class Student{
    private Integer Roll_No;
    private String S_name;


    public String getName(){
        return S_name;
    }

    public void setS_name(String name){
        this.S_name = name;
    }


    public Integer getRoll_no(){
            return Roll_No;
    }

    public void setRoll_No(Integer data){
        if (data <= 0){
            System.out.println("Please enter roll number > 0");
        }
        else{
            this.Roll_No = data;
        }
    }


}
public class encap_example {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRoll_No(23);
        s.setS_name("Akbar");

        System.out.println("Student Name - " + s.getName());
        System.out.println("Roll No - " + s.getRoll_no());

    }
}
