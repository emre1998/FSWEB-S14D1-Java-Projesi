package models.DeveloperCompany;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id,String name,double salary) {
        super(id,name,salary);
    }
    @Override
    public void work() {
        System.out.println("Mid Developer " + getName() + " starts to working.");
        setSalary(getSalary() + 2000);
    }
    }

