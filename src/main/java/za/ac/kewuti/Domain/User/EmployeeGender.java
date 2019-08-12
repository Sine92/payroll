package za.ac.kewuti.Domain.User;

public class EmployeeGender {

    private String empId, genderId;
    private EmployeeGender()
    {

    }
    public EmployeeGender(Builder build)
    {
        this.empId = build.empId;
        this.genderId = build.genderId;
    }

    public String getEmpId() {
        return empId;
    }

    public String getGenderId() {
        return genderId;
    }
    public static class Builder{
        private String empId, genderId;

        public Builder empId(String eId){
            this.empId =eId;
            return this;
        }
        public Builder  genderId(String gId){
            this.genderId =gId;
            return this;
        }
           public EmployeeGender build()
           {
               return new EmployeeGender(this);
           }


    }
}
