/**
 * WRITE THE DISCRIPTION OF CLASS StaffHire HERE.
 * 
 * @ AUTHOR [KAUSHAL GURUNG]
*/
    public class StaffHire{
    //DECLEARING THE PRIVATE VARIABLES
    private int VacancyNumber;
    private String Designation;
    private String JobType;
    //GETTER METHODS FOR PRIVATE VARIABLES
    public int getVacancyNumber(){
        return VacancyNumber;
    }
    public String getDesignation(){
        return Designation;
    }
    public String getJobType(){
        return JobType;
    } 
    //OVERLOADING CONSTRUCTOR FOR CREATING AN INSTANCE OF A CLASS
    StaffHire(int VacancyNumber, String Designation,String JobType){
        this.VacancyNumber=VacancyNumber;
        this.Designation=Designation;
        this.JobType=JobType;
    }
    //METHOD TO DISPLAY 
    public void display(){
        //System.out.println("Vacancy number:"+VacancyNumber);
        //System.out.println("Designation:"+Designation);
        //System.out.println("Jobtype:"+JobType);
    }
}