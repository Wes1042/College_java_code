class Employee{
    String name, department,position;
    int idNumber;
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public String getPosition(){
        return position;
    }
    public int getIDNumber(){
        return idNumber;
    }




    public void setName(String NG){ //number given
        name = NG;
    }
    public void setidNumber(int IDG){ // idnumber given
        
        idNumber = IDG;
    }
    public void setidNumber(String IDG){ // idnumber given into a string
        
        idNumber = Integer.parseInt(IDG);
    }

    public void setDepartment( String DG){ // departnemt given
        department = DG ;
    }
    public void setPosition(String PG){ //position given 
        position = PG;

    }
public Employee(String employeeName, int employeeID, String employeeDeparment , String employeePosition){ // constructor / object
    name = employeeName;
    department = employeeDeparment;
    idNumber = employeeID;
    position = employeePosition;


}

public Employee(String employeeName, int employeeID){
    name = employeeName;
    department = "";
    idNumber = employeeID;
    position = "";


}
public Employee(){
    name = "";
    department = "";
    idNumber = 0;
    position ="";


}





}