package za.ac.kewuti.Domain.User;

public class Employee {

    private String empId,empName,empLastName, empNumber;

    private Employee()
    {

    }

    public String getEmpId() {
        return empId;
    }

    private Employee(Builder build)
    {
        this.empId = build.empId;
        this.empName = build.empName;
        this.empLastName = build.empLastName;
        this.empNumber = build.empNumber;

    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public static class Builder {

        private String empId, empName, empLastName, empNumber;

        public Builder empId(String empId)
        {
            this.empId =empId;
            return this;
        }

        public Builder empName(String empName)
        {
            this.empName = empName;
            return this;
        }
        public Builder empLastName(String empLastName)
        {
            this.empLastName = empLastName;
            return this;
        }
        public Builder empNumber(String empNumber)
        {
            this.empNumber = empNumber;
            return this;
        }
        public Employee build()
        {
          return  new Employee(this);
        }

    }
}
