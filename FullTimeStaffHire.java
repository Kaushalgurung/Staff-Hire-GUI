/**
/**
 * WRITE THE DISCRIPTION OF CLASS PartTymeStaffHire HERE.
 * 
 * @ AUTHOR [KAUSHAL GURUNG]
*/
class FullTimeStaffHire extends StaffHire {
        //DECLEARING THE PRIVATE VARIABLES
        private int workingHours;
        private int salary;
        private String StaffName;
        private String joiningDate;
        private String qualification;
        private String appointedBy;
        private boolean joined;
        //GETTER METHODS FOR THE PRIVATE VARIABLES
        public int getWorkingHours() {
            return workingHours;
        }
        public int getSalary(){
            return salary;
        }
        public String getStaffName(){
            return StaffName;
        }
        public String getJoiningDate(){
            return joiningDate;
        }
        public String getQualification(){
            return qualification;
        }
        public String getAppointedBy(){
            return appointedBy;
        }
        public boolean getJoined(){
            return joined;
        }
        //SETTER METHODS FOR VARIABLES REQUIRED
        public void setSalary(int newSalary){
            if (joined = false) {
            salary = newSalary;
            } 
            else {
            //System.out.println("can't change salary");
           }
        }
        public void setWorkHour(int newWorkHour) {
            workingHours = newWorkHour;
        }
        //METHOD TO HEIRE NEW FULL-TIME-STAFF
        public void hireFullTimeStaff(String StaffName, String joiningDate, String qualification, String appointedBy) {
            if(joined==false){
                this.StaffName = StaffName;
                this.joiningDate = joiningDate;
                this.qualification = qualification;
                this.appointedBy = appointedBy;
                joined = true;
                //System.out.println("Staff has been hired");
            }
            else{
                //System.out.println("Staff already exists");
           }
        }
        //METHOD TO DISPLAY FullTimeStaffHires
        public void displayFulltimeStaff() {
           super.display();
            if (joined == true) {
            //System.out.println("workingHours= " + workingHours);
            //System.out.println("salary=" + salary);
            //System.out.println("name=" + StaffName);
            //System.out.println("joiningDate=" + joiningDate);
            //System.out.println("qualification=" + qualification);
            //System.out.println("appointedBy=" + appointedBy);
            }   
            else {
           // System.out.println("the staff has not joined");
           }
        }
        //OVERLOADING CONSTRUCTOR FOR CREATING INSTANCE OF A CLASS
        FullTimeStaffHire(int vacancyNumber, String Designation, String JobType, int salary, int workingHours) {
            super(vacancyNumber, Designation, JobType);
            this.salary= salary;
            this.workingHours= workingHours;
            StaffName = "";
            joiningDate = "";
            joined = false;
        }
}