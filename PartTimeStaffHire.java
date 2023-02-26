/**
/**
 * WRITE THE DISCRIPTION OF CLASS PartTymeStaffHire HERE.
 * 
 * @ AUTHOR [KAUSHAL GURUNG]
*/
class PartTimeStaffHire extends StaffHire{
     //DECLERRING PRIVATE VARIABLES
     private int workingHour;
     private int wagesPerHour;
     private String staffName;
     private String joiningDate;
     private String qualification;
     private String appointedBy;
     private String shifts;
     private boolean joined;
     private boolean terminated;
     //GETTER METHOD FOR PRIVATE VARIABLES
        public int getWorkingHour(){
        return workingHour;
       }
        public int getWagesPerHour(){
        return wagesPerHour;
       }
       public String getStaffName(){
        return staffName;
       }
       public String getShifts(){
        return shifts;
       }
       public String getQualification(){
        return qualification;
       }
       public String getAppointedBy(){
        return appointedBy;
       }
       public boolean getJoined() {
        return joined;
       }
       public String getJoinedDate() {
        return joiningDate;
       }
       public boolean getTerminated() {
        return terminated;
       }
      //METHOD TO SET NEW SHIFTS
       public void setWorkingShift(String newShift) {
            if (joined == false) {
            this.shifts = newShift;
           }   
            else {
            //System.out.println("cannot create new shifts");
           }
       }
      //METHOD TO TERMINATE A STAFF
       public void terminateAStaff() {
            if (terminated == true) {
            //System.out.println("the staff is already terminated");
           } 
            else {
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
            this.joined = false;
            this.terminated = true;
            //System.out.println("the staff has been terminated");
           }
        }
      //METHOD TO HIRE NEW PART-TIME-STAFF
       public void hirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy) {
            if(joined==false){
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
            }
            else{
            //System.out.println("Staff is already hired");
           }
        }
      //METHOD TO DISPLAY PartTimeStaffHires
       public void displayPartTimeStaff() {
            super.display();
           //checking joined or not
            if (joined==true)
            {
            //System.out.println("name="+staffName);
            //System.out.println("joiningDate"+joiningDate);
            //System.out.println("qualification="+qualification);
            //System.out.println("appointedby="+appointedBy);
            //System.out.println("workingHour="+workingHour);
            //System.out.println("wagesPerHour="+wagesPerHour);
            //System.out.println("salary="+wagesPerHour * workingHour);
            }
            else
            {
           // System.out.println("Staff has not joined");
           }
        }
      //OVERLOADING CONSTRUCTOR FOR CREATING INSTANCE OF A CLASS
       PartTimeStaffHire(int vacancyNumber, String Designation, int wagesPerHour, String JobType, int workingHour,
        String shifts) {
                //calling super constructors
                super(vacancyNumber, Designation, JobType);
                this.shifts = shifts;
                staffName = "";
                joiningDate = "";
                qualification = "";
                appointedBy = "";
                this.wagesPerHour=wagesPerHour;
                this.workingHour=workingHour;
                this.terminated = false;
                this.joined = false;
        }
}
        
        
