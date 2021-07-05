class Main{
public static void main(String[] args) {
    
    Employee employee1 = new Employee();
    Employee employee2 = new Employee("Mark Jones", 39119);
    Employee employee3 = new Employee("Joy Rogers", 81774,"Manuafacturing", "Engineering");

    employee1.setName("Susan Meyers");
    employee1.setidNumber("47899");
    employee1.setDepartment("Accounting");
    employee2.setDepartment("IT");
    employee2.setPosition("Programmer");
    employee1.setPosition("Vice President");
    System.out.println("Name\t\tID Number\t\tDepartment\t\tPostion\n-------------------------------------------------------------------------------");
    System.out.println(employee1.getName()+ "\t" + employee1.getIDNumber()+ "\t\t\t" + employee1.getDepartment()+ "\t\t" + employee1.getPosition());
    System.out.println(employee2.getName()+ "\t" + employee2.getIDNumber()+ "\t\t\t" + employee2.getDepartment()+ "\t\t\t" + employee2.getPosition());
    System.out.println(employee3.getName()+ "\t" + employee3.getIDNumber()+ "\t\t\t" + employee3.getDepartment()+ "\t\t" + employee3.getPosition());
}


}