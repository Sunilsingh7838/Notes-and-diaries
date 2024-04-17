import java.sql.Array;
import java.util.ArrayList;

class Department{
    private String department;

    public Department(String name){
        this.department = name;
    }

    public String getDepartment(){
        return department;
    }
}

class Hospital{
    private String name;
    private ArrayList<Department> departments;

    public Hospital(String name){
        this.name = name;

        this.departments = new ArrayList<>();
    }

    public void addDepartment( Department department){
        departments.add(department);
    }

    public ArrayList<Department> getDepartments(){
        return departments;
    }
}
public
class Aggregation {
    public static
    void main(String[] args) {

        Department facility1 = new Department("X-Ray");
        Department facility2 = new Department("MRI");

        Hospital Delhi = new Hospital("Max");
        Delhi.addDepartment(facility1);
        Delhi.addDepartment(facility2);

//       for(String str : departments.toString()){
//           System.out.println(str);
//       }

    }
}
