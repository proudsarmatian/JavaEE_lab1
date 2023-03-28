public class Employee {
    private int id;
    private static int nextId;
    private String name;
    private String surname;
    private int salary;

    public Employee(String name, String surname, int salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id = nextId;
        setName(name);
        setSurname(surname);
        setSalary(salary);
        nextId++;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws FieldLengthLimitException{
        if(name.length()>20) throw new FieldLengthLimitException("Name must be less than 20 characters");
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws FieldLengthLimitException{
        if(surname.length()>20) throw new FieldLengthLimitException("Surname must be less than 20 characters");
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) throws IncorrectSalaryException{
        if(salary<=0) throw new IncorrectSalaryException("Salary must be greater than 0");
        this.salary = salary;
    }
}
