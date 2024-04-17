public
class Encapsulation {

    private String Name;
    private int age;

    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public static
    void main(String[] args) {

        Encapsulation en = new Encapsulation();
        en.setName("Sunil");
        en.setAge(24);
        System.out.println("My name is " + en.getName()+ " and age is " + en.getAge()+".");
    }
}
