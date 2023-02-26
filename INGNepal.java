/**
 * GUI code INGNepal.
 * 
 * @ AUTHOR [KAUSHAL GURUNG]
*/
//Importing java packages  
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*; 
import java.util.*;
import java.awt.Font;
import java.awt.Color;

class INGNepal implements ActionListener {
    // Initilizing the instances of class
    ArrayList<StaffHire> staffList = new ArrayList<StaffHire>();
    /**Array List*/
    
    JFrame frame1, frame2, frame3, frame4, frame5, frame6, frame7, frame8, frame9, frame10;/** Frames */
    
    JButton btnAddFullTimeVacancy, btnAddPartTimeVacancy, btnHirePartTimeStaff, btnHireFullTimeStaff,
            btnDisplayPartTime, backBtn, backBtn2, backBtn3, backBtn4, btnDisplayFullTime, btnTerminateFunction, btnTerminate,
            btnSavePartTimeVacancy, btnSavePartTimeStaff, btnSaveFullTimeVacancy, btnSaveFullTimeStaff, Reset1, Reset2,
            Reset3, Reset4, 
            exit, showInfoBtn;/**Buttons*/
            
    JTextField wagesPerHourFT, DesignationFT, VacancyNumPT, jobTypeFT, joinedDatePTS, staffNamePTS, qualificationPTS, 
               appointedByPTS, vacancyNoFTS,designationFTS, jobTypeFTS, salaryFTS,  
               staffNameFTS, joiningDateFTS, qualificationFTS, appointedByFTS;/**TextFields*/
               
    JTextArea  StaffInfoToTerminateTxtArea;/** Text area */
    
    JLabel     lblworkingHourPartTime, lblShift, lblWagesPerHour, lblDesignationPartTime, lblVacancyNoPartTime,
               lblJobTypePartTime,lblStaffNamePartTime, lblJoiningDatePartTime, 
               lblQualificationPartTimeStaff,lblAppointedByPartTime,lblVacancyNumberPartTime,  
               lblStaffInfoToTerminate,lblVacancyNumberToTerminate,lblVacancyFullTimeStaff, lblworkingHourFullTime,
               lblDesignationFullTime,lbljobTypeFullTime,lblSalaryFullTimeStaff, lblStaffNameFullTimeStaff, 
               lblJoiningDateFullTimeStaff,lblApprovedbyPartTime,lblQualificationFullTimeStaff,
               lblAppointedByFullTimeStaff,lblJoiningDateOfStaff,lblQualificationOfStaff,lblVacancyNoFullTimeStaff2;/**Lables */
            
    JComboBox<Integer> comboWorkingHourPartTime, comboVacancyNumberPartTime, terminatingVacancy,
            comboVacancyNumberFullTime, comboWorkingHourFullTime;/**Integer Combo-box */
            
    JComboBox<String> comboShift; /**String Combo-box */
    
    DefaultTableModel  model2,  model4;/**TableModel*/
    
    JTable  table1,  table4;/**Tables */
        
    INGNepal() {
        // color, title and fonts
        /** Colour */
        Color c = new Color(136, 244, 227);
        Color r = new Color(225, 0, 0);
        Color txt = new Color(0,225,0);
        Color b =new Color(0,1,1);
        Color t =new Color(216, 228, 164);
        /** Font */
        Font f = new Font("Bradley Hand ITC", Font.BOLD|Font.ITALIC, 22);
        Font l = new Font("Kristen ITC", Font.BOLD|Font.ITALIC, 11);
        Font x = new Font("Chiller", Font.BOLD|Font.ITALIC, 18);
        Font y = new Font("Chiller", Font.BOLD, 30);
        //Creating lable(Title)
        JLabel title = new JLabel();
        JLabel title2 = new JLabel();
        JLabel title3 = new JLabel(); 
        JLabel title4 = new JLabel();
        //Setting text fot title
        title.setText("Part-Time Vacancy Registration Form");
        title2.setText("Part-Time-Staff-Hire Registration Form");
        title3.setText("Full-Time Vacancy Registration Form");
        title4.setText("Full-Time-Staff-Hire Registration Form");
        //Setting bounds for title
        title.setBounds(50, 20, 400, 70);
        title.setFont(f);
        title2.setBounds(50, 20, 400, 70);
        title2.setFont(f);
        title3.setBounds(50, 20, 400, 70);
        title4.setBounds(50, 20, 400, 70);
        title3.setFont(f); 
        title4.setFont(f); 
        // Frame1
        frame1 = new JFrame("INGNepal-Staff Hire-");
        frame1.setSize(550, 550);
        frame1.setVisible(true);
        frame1.setLayout(null);
        frame1.setResizable(false);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.getContentPane().setBackground(b);
        // Adding buttons with unique name
        btnAddPartTimeVacancy = new JButton("Add vacancy for Part-Time-Staff");
        btnHirePartTimeStaff = new JButton("Hire a Part-Time-Staff");        
        btnDisplayPartTime = new JButton("Display Part-Time-Staff Information");
        btnTerminateFunction = new JButton("Terminate A Part-Time-Staff");        
        btnAddFullTimeVacancy = new JButton("Add vacancy for Full-Time-Staff");        
        btnHireFullTimeStaff = new JButton("Hire a Full-Time-Staff");
        btnDisplayFullTime = new JButton("Display Full-Time-Staff Information");
        exit = new JButton("!EXIT!");
        /** Setting bounds,font,colour for buttons */
        //Button "Add vacancy for Part-Time-Staff"
        btnAddPartTimeVacancy.setBounds(80, 20, 400, 50);
        btnAddPartTimeVacancy.setFont(y);
        btnAddPartTimeVacancy.setForeground(txt);
        btnAddPartTimeVacancy.setBackground(b);
        btnAddPartTimeVacancy.setBorderPainted(false);
        //Button "Hire a Part-Time-Staff"
        btnHirePartTimeStaff.setBounds(80, 80, 400, 50);
        btnHirePartTimeStaff.setFont(y);
        btnHirePartTimeStaff.setForeground(txt);
        btnHirePartTimeStaff.setBackground(b);
        btnHirePartTimeStaff.setBorderPainted(false);
        //Button "Display Part-Time-Staff Information"
        btnDisplayPartTime.setBounds(80, 140, 400, 50);
        btnDisplayPartTime.setFont(y);
        btnDisplayPartTime.setForeground(txt);
        btnDisplayPartTime.setBackground(b);
        btnDisplayPartTime.setBorderPainted(false);
        //Button "Terminate A Part-Time-Staff"
        btnTerminateFunction.setBounds(80, 200, 400, 50);
        btnTerminateFunction.setFont(y);
        btnTerminateFunction.setForeground(txt);
        btnTerminateFunction.setBackground(b);
        btnTerminateFunction.setBorderPainted(false);
        //Button "Add vacancy for Full-Time-Staff"
        btnAddFullTimeVacancy.setBounds(80, 260, 400, 50);
        btnAddFullTimeVacancy.setFont(y);
        btnAddFullTimeVacancy.setForeground(txt);
        btnAddFullTimeVacancy.setBackground(b);
        btnAddFullTimeVacancy.setBorderPainted(false);
        //Button "Hire a Full-Time-Staff"
        btnHireFullTimeStaff.setBounds(80, 320, 400, 50);
        btnHireFullTimeStaff.setFont(y);
        btnHireFullTimeStaff.setForeground(txt);
        btnHireFullTimeStaff.setBackground(b);
        btnHireFullTimeStaff.setBorderPainted(false);
        //Button "Display Full-Time-Staff Information"
        btnDisplayFullTime.setBounds(80, 380, 400, 50);
        btnDisplayFullTime.setFont(y);
        btnDisplayFullTime.setForeground(txt);
        btnDisplayFullTime.setBackground(b);
        btnDisplayFullTime.setBorderPainted(false);
        //Button "Exit"
        exit.setBounds(80, 440, 400, 50); 
        exit.setFont(y);
        exit.setForeground(r);
        exit.setBackground(b);
        exit.setBorderPainted(false);
        // Adding action listener to buttons
        btnAddFullTimeVacancy.addActionListener(this);
        btnAddPartTimeVacancy.addActionListener(this);
        btnDisplayFullTime.addActionListener(this);
        btnDisplayPartTime.addActionListener(this);
        btnTerminateFunction.addActionListener(this);
        btnHireFullTimeStaff.addActionListener(this);
        btnHirePartTimeStaff.addActionListener(this);
        exit.addActionListener(this);
        // Adding buttons to the frame1
        frame1.add(btnAddFullTimeVacancy);
        frame1.add(btnAddPartTimeVacancy);
        frame1.add(btnDisplayPartTime);
        frame1.add(btnDisplayFullTime);
        frame1.add(btnTerminateFunction);
        frame1.add(btnHireFullTimeStaff);
        frame1.add(btnHirePartTimeStaff);
        frame1.add(exit);        
        // Creating frame2
        frame2 = new JFrame("Create Vacancy for Part-Time staff");
        frame2.setLayout(null);
        frame2.setBounds(120, 60, 500, 450);
        frame2.setResizable(false);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Creating Buttons
        backBtn = new JButton("|Go Back|");
        backBtn2 = new JButton("|Go Back|");
        backBtn3 = new JButton("|Go Back|");
        backBtn4 = new JButton("|Go Back|");
        //Creating components for the frame 
        lblworkingHourPartTime = new JLabel("Working Hours:");
        lblworkingHourPartTime.setFont(l);
        comboWorkingHourPartTime = new JComboBox<Integer>();
        lblWagesPerHour = new JLabel("Wages per hour:");
        lblWagesPerHour.setFont(l);
        lblDesignationPartTime = new JLabel("Designation:");
        lblDesignationPartTime.setFont(l);
        DesignationFT = new JTextField(25);
        wagesPerHourFT = new JTextField();
        lblVacancyNoPartTime = new JLabel("Vacancy No:");
        lblVacancyNoPartTime.setFont(l);
        VacancyNumPT = new JTextField();
        lblShift = new JLabel("Shift:");
        lblShift.setFont(l);
        comboShift = new JComboBox<String>();
        btnSavePartTimeVacancy = new JButton("|Create|");
        Reset1 = new JButton("|Reset|");
        lblJobTypePartTime = new JLabel("Job Type:");
        lblJobTypePartTime.setFont(l);
        jobTypeFT = new JTextField();
        //Adding actionlistner to Buttons
        Reset1.addActionListener(this);
        btnSavePartTimeVacancy.addActionListener(this);
        backBtn.addActionListener(this);
        backBtn2.addActionListener(this);
        backBtn3.addActionListener(this);
        backBtn4.addActionListener(this);
        //Setting bounds 
        backBtn.setBounds(50, 300, 100, 40);
        backBtn.setFont(x);
        backBtn2.setBounds(50, 300, 100, 40);
        backBtn2.setFont(x);
        backBtn3.setBounds(50, 300, 100, 40);
        backBtn3.setFont(x);
        backBtn4.setBounds(50, 300, 100, 40);
        backBtn4.setFont(x);
        lblworkingHourPartTime.setBounds(50, 100, 300, 40);
        comboWorkingHourPartTime.setBounds(150, 105, 80, 25);
        lblWagesPerHour.setBounds(250, 100, 300, 40);
        wagesPerHourFT.setBounds(350, 105, 100, 25);
        lblDesignationPartTime.setBounds(250, 150, 300, 40);
        DesignationFT.setBounds(350, 160, 100, 25);
        lblJobTypePartTime.setBounds(250, 205, 300, 40);
        jobTypeFT.setBounds(350, 210, 100, 25);
        lblVacancyNoPartTime.setBounds(50, 150, 300, 40);
        VacancyNumPT.setBounds(150, 155, 20, 30);
        VacancyNumPT.setEditable(false);
        lblShift.setBounds(50, 200, 300, 40);
        comboShift.setBounds(150, 200, 90, 30);
        //comboShift.addItem("Select Shift");
        comboShift.addItem("Morning");
        comboShift.addItem("Day");
        comboShift.addItem("Evening");
        comboShift.addItem("Night");
        Reset1.setBounds(200, 300, 80, 40);
        Reset1.setFont(x);
        btnSavePartTimeVacancy.setBounds(330, 300, 130, 40);
        btnSavePartTimeVacancy.setFont(x);
        
        //Creating frame3
        frame3 = new JFrame();
        // only allowing user to input int in wages per hour
        wagesPerHourFT.addKeyListener(new KeyAdapter() 
        {
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                }
                else {
                    try{
                        Integer.parseInt(String.valueOf(ke.getKeyChar()));
                    }
                    catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(frame3,"Wage can't be a string!"+"\n"+"Please enter Integer Value!","Error!!",
                            JOptionPane.ERROR_MESSAGE);
                    wagesPerHourFT.setText("");
                   }
               }
           }
        });
        for (int i = 1; i < 9; i++) {
            comboWorkingHourPartTime.addItem(i);
        }
        // Adding elements to the frame2
        frame2.add(title);
        frame2.getContentPane().setBackground(c);
        frame2.add(backBtn);
        frame2.add(lblworkingHourPartTime);
        frame2.add(comboWorkingHourPartTime);
        frame2.add(lblWagesPerHour);
        frame2.add(wagesPerHourFT);
        frame2.add(lblDesignationPartTime);
        frame2.add(DesignationFT);
        frame2.add(lblVacancyNoPartTime);
        frame2.add(lblShift);
        frame2.add(comboShift);
        frame2.add(btnSavePartTimeVacancy);
        frame2.add(Reset1);
        frame2.add(jobTypeFT);
        frame2.add(lblJobTypePartTime);
        frame2.add(VacancyNumPT);
        // Creating frame4 for Part-Time-Staff-Hire! 
        lblJoiningDatePartTime = new JLabel("Joining date:");
        lblJoiningDatePartTime.setFont(l);
        lblStaffNamePartTime = new JLabel("Staff Name:");
        lblStaffNamePartTime.setFont(l);
        lblQualificationPartTimeStaff = new JLabel("Qualification:");
        lblQualificationPartTimeStaff.setFont(l);
        lblAppointedByPartTime = new JLabel("Appointed By:");
        lblAppointedByPartTime.setFont(l);
        lblVacancyNumberPartTime = new JLabel("Vacancy number:");
        lblVacancyNumberPartTime.setFont(l);
        comboVacancyNumberPartTime = new JComboBox<Integer>();
        btnSavePartTimeStaff = new JButton("|Hire|");
        Reset2 = new JButton("|Reset|");
        //Setting bounds
        btnSavePartTimeStaff.setBounds(330, 300, 130, 40);
        lblStaffNamePartTime.setBounds(50, 100, 300, 40);
        lblJoiningDatePartTime.setBounds(260, 100, 300, 40);
        lblQualificationPartTimeStaff.setBounds(50, 150, 300, 40);
        lblAppointedByPartTime.setBounds(260, 150, 300, 40);
        comboVacancyNumberPartTime.setBounds(200, 220, 50, 25);
        lblVacancyNumberPartTime.setBounds(50, 210, 300, 40);
        Reset2.setBounds(200, 300, 80, 40);
        Reset2.setFont(x);
        Reset2.addActionListener(this);
        btnSavePartTimeStaff.addActionListener(this);
        joinedDatePTS = new JTextField();
        staffNamePTS = new JTextField();
        qualificationPTS = new JTextField();
        appointedByPTS = new JTextField();

        joinedDatePTS.setBounds(350, 110, 100, 25);
        staffNamePTS.setBounds(150, 110, 100, 25);
        qualificationPTS.setBounds(150, 160, 100, 25);
        appointedByPTS.setBounds(350, 160, 100, 25);

        frame4 = new JFrame("Hire a Part-Time-Staff");
        frame4.setLayout(null);
        frame4.setResizable(false);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.add(title2);
        frame4.getContentPane().setBackground(c);
        frame4.setBounds(120, 60, 500, 450);
        frame4.add(backBtn2);
        frame4.add(lblStaffNamePartTime);
        frame4.add(lblQualificationPartTimeStaff);
        frame4.add(lblJoiningDatePartTime);
        frame4.add(lblAppointedByPartTime);
        frame4.add(joinedDatePTS);
        frame4.add(staffNamePTS);
        frame4.add(qualificationPTS);
        frame4.add(appointedByPTS);
        frame4.add(comboVacancyNumberPartTime);
        frame4.add(lblVacancyNumberPartTime);
        frame4.add(Reset2);
        frame4.add(btnSavePartTimeStaff);
        frame4.getContentPane().setBackground(c);
        // Creating frame 5 for Display of Part-Time-Staff-Hire
        Object[] column2 = { "Vacancy number", "Designation", "Wages-Per-Hour", "Job-Type", "Working-Hour", "Shift",
                "Staff Name", "Joining date", "Qualification", "Appointed by" };
        // Jtable for vacancy of Part Time Staff
        model2 = new DefaultTableModel();
        table1 = new JTable(model2);
        for (int i = 0; i < 10; i++) {
            model2.addColumn(column2[i]);
        }
        frame5 = new JFrame("-|Details of Part-Time-Staffs|-");
        JScrollPane sp2 = new JScrollPane(table1);
        frame5.add(sp2);
        frame5.setBounds(100, 100, 1000, 500);
        // add columns to model
        
        // frame6 for terminating the staff
        frame6 = new JFrame("Terminate a staff");
        frame6.setSize(500,350);
        frame6.setLayout(null);
        frame6.setResizable(false);
        frame6.getContentPane().setBackground(t);
        //Adding components to frame6
        lblStaffInfoToTerminate = new JLabel("Staff's Information:");
        lblStaffInfoToTerminate.setBounds(245, 5, 150,30);
        lblStaffInfoToTerminate.setFont(l);
        StaffInfoToTerminateTxtArea = new JTextArea(5,5);
        StaffInfoToTerminateTxtArea.setBounds(220, 35, 220, 220);
        StaffInfoToTerminateTxtArea.setLineWrap(true);
        StaffInfoToTerminateTxtArea.setEditable(false);
        StaffInfoToTerminateTxtArea.setFont(l);
        lblVacancyNumberToTerminate = new JLabel("Vacancy No.:");
        lblVacancyNumberToTerminate.setBounds(30, 55, 100, 30);
        lblVacancyNumberToTerminate.setFont(l);
        showInfoBtn = new JButton("|Show Staff Info|");
        showInfoBtn.setBounds(45, 150, 150, 35);
        showInfoBtn.setFont(x);
        showInfoBtn.addActionListener(this);
        btnTerminate = new JButton("|Terminate Staff|");
        btnTerminate.setBounds(45, 225, 150, 35);
        btnTerminate.setFont(x);
        btnTerminate.addActionListener(this);
        terminatingVacancy = new JComboBox<Integer>();
        terminatingVacancy.setBounds(130, 55, 50, 30);
        //adding components to frame        
        frame6.add(lblVacancyNumberToTerminate);
        frame6.add(btnTerminate);
        frame6.add(StaffInfoToTerminateTxtArea);
        frame6.add(showInfoBtn);
        frame6.add(lblStaffInfoToTerminate);
        // frame7 for creating Vacancy of Full-Time-Staff
        frame7 = new JFrame("Create vacancy for Full-Time-Staff");
        frame7.setBounds(120, 60, 500, 450);
        frame7.setLayout(null);

        vacancyNoFTS = new JTextField();
        lblVacancyFullTimeStaff = new JLabel("Vacancy Number:");
        lblVacancyFullTimeStaff.setFont(l);
        lblworkingHourFullTime = new JLabel("Working Hour:");
        lblworkingHourFullTime.setFont(l);
        lblDesignationFullTime = new JLabel("Designation:");
        lblDesignationFullTime.setFont(l);
        lbljobTypeFullTime = new JLabel("Job Type:");
        lbljobTypeFullTime.setFont(l);
        lblSalaryFullTimeStaff = new JLabel("Salary:");
        lblSalaryFullTimeStaff.setFont(l);
        comboWorkingHourFullTime = new JComboBox<Integer>();
        designationFTS = new JTextField();
        jobTypeFTS = new JTextField();
        salaryFTS = new JTextField();
        Reset3 = new JButton("|Reset|");
        btnSaveFullTimeVacancy = new JButton("|Create|");

         for (int i = 8; i < 13; i++) {
            comboWorkingHourFullTime.addItem(i);
         }

        lblVacancyFullTimeStaff.setBounds(50, 150, 300, 40);
        lblworkingHourFullTime.setBounds(50, 100, 300, 40);
        lblDesignationFullTime.setBounds(250, 160, 300, 25);
        lbljobTypeFullTime.setBounds(150, 205, 300, 40);
        lblSalaryFullTimeStaff.setBounds(250, 105, 300, 40);
        vacancyNoFTS.setBounds(160, 160, 30, 20);
        vacancyNoFTS.setEditable(false);
        comboWorkingHourFullTime.setBounds(150, 110, 50, 25);
        designationFTS.setBounds(350, 160, 100, 25);
        jobTypeFTS.setBounds(230, 215, 100, 25); 
        salaryFTS.setBounds(350, 115, 100, 25);
        Reset3.setBounds(200, 300, 80, 40);
        Reset3.setFont(x);
        btnSaveFullTimeVacancy.setBounds(330, 300, 130, 40);
        btnSaveFullTimeVacancy.setFont(x);
        Reset3.addActionListener(this);
        btnSaveFullTimeVacancy.addActionListener(this);
        salaryFTS.addKeyListener(new KeyAdapter()
        {
                @Override
                public void keyPressed(KeyEvent ke) {
                if(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE)
                   {  
                     }
                else{
                  try{
                    Integer.parseInt(String.valueOf(ke.getKeyChar()));
                   }
                   catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(frame7, "Salary can't be in String!","Error!!", 
                    JOptionPane.ERROR_MESSAGE);
                    salaryFTS.setText("");
                  }
                }
          }
        });
        vacancyNoFTS.setText(String.valueOf(staffList.size() + 1));

        frame7.add(lblVacancyFullTimeStaff);
        frame7.add(lblworkingHourFullTime);
        frame7.add(lblDesignationFullTime);
        frame7.add(lbljobTypeFullTime);
        frame7.add(lblSalaryFullTimeStaff);
        frame7.add(vacancyNoFTS);
        frame7.add(comboWorkingHourFullTime);
        frame7.add(designationFTS);
        frame7.add(jobTypeFTS);
        frame7.add(salaryFTS);
        frame7.add(title3);
        frame7.add(backBtn3);
        frame7.add(Reset3);
        frame7.add(btnSaveFullTimeVacancy);
        frame7.getContentPane().setBackground(c);
        frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        lblStaffNameFullTimeStaff = new JLabel("Staff Name:");
        lblJoiningDateFullTimeStaff = new JLabel("Joining Date:");
        lblQualificationFullTimeStaff = new JLabel("Qualification:");
        lblAppointedByFullTimeStaff = new JLabel("Appointed by:");
        lblVacancyNoFullTimeStaff2 = new JLabel("Vacancy Number:");

        btnSaveFullTimeStaff = new JButton("|Hire|");
        Reset4 = new JButton("|Reset|");
        btnSaveFullTimeStaff.setBounds(330, 300, 130, 40);
        btnSaveFullTimeVacancy.setFont(x);
        Reset4.setBounds(200, 300, 80, 40);
        Reset4.setFont(x);
        staffNameFTS = new JTextField();
        joiningDateFTS = new JTextField();
        qualificationFTS = new JTextField();
        appointedByFTS = new JTextField();
        comboVacancyNumberFullTime = new JComboBox<Integer>();
        comboVacancyNumberFullTime.setBounds(250, 220, 50, 25);
        lblQualificationFullTimeStaff = new JLabel("Qualification:");

        lblStaffNameFullTimeStaff.setBounds(50, 100, 300, 40);
        lblStaffNameFullTimeStaff.setFont(l);
        
        lblJoiningDateFullTimeStaff.setBounds(260, 100, 300, 40);
        lblJoiningDateFullTimeStaff.setFont(l);
        
        lblQualificationFullTimeStaff.setBounds(50, 150, 300, 40);
        lblQualificationFullTimeStaff.setFont(l);
        
        lblAppointedByFullTimeStaff.setBounds(260, 150, 300, 40);
        lblAppointedByFullTimeStaff.setFont(l);
        
        lblVacancyNoFullTimeStaff2.setBounds(50, 220, 150, 25);
        lblVacancyNoFullTimeStaff2.setFont(l);
        
        joiningDateFTS.setBounds(350, 110, 100, 25);
        joiningDateFTS.setFont(l);
        
        staffNameFTS.setBounds(150, 110, 100, 25);
        staffNameFTS.setFont(l);
        
        qualificationFTS.setBounds(150, 160, 100, 25);
        qualificationFTS.setFont(l);
        
        appointedByFTS.setBounds(350, 160, 100, 25);
        appointedByFTS.setFont(l);

        btnSaveFullTimeStaff.addActionListener(this);
        btnSaveFullTimeStaff.setFont(l);
        Reset4.addActionListener(this);

        frame9 = new JFrame("Hire Full-Time-Staff");
        frame9.setBounds(120, 60, 500, 450);
        frame9.add(title4);
        frame9.add(btnSaveFullTimeStaff);
        frame9.add(backBtn4);
        frame9.add(Reset4);
        frame9.add(staffNameFTS);
        frame9.add(joiningDateFTS);
        frame9.add(lblJoiningDateFullTimeStaff);
        frame9.getContentPane().setBackground(c);

        frame9.add(lblStaffNameFullTimeStaff);
        frame9.add(qualificationFTS);
        frame9.add(lblQualificationFullTimeStaff);
        frame9.add(appointedByFTS);
        frame9.add(lblAppointedByFullTimeStaff);
        frame9.add(comboVacancyNumberFullTime);
        frame9.setLayout(null);
        frame9.setResizable(false);
        frame9.add(lblVacancyNoFullTimeStaff2);
        frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame6.add(terminatingVacancy);
        vacancyNoFTS.setText(String.valueOf(staffList.size()+ 1));
        VacancyNumPT.setText(String.valueOf(PartTimeStaffCount() +1));
        // frame10 for displaying the full time staff details
        frame10 = new JFrame("-|Details Full-Time-Staff|-");
        model4 = new DefaultTableModel();

        Object[] column1 = { "Vacancy Number:", "Designation:", "Job-Type:", "Salary:", "Working-Hour:", "Staff Name:",
                "Joined-Date:", "Qualification:", "Appointed by:" };
        for (int i = 0; i < 9; i++) {
            model4.addColumn(column1[i]);
        }
        table4 = new JTable(model4);
        JScrollPane sp = new JScrollPane(table4);
        frame10.setBounds(100, 100, 1000, 500);
        frame10.add(sp);
    }

    public static void main(String[] args) {
        new INGNepal();
    }

    public void back() {
        frame1.setVisible(true);
        frame2.setVisible(false);
        frame4.setVisible(false);
        frame7.setVisible(false);
        frame9.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAddPartTimeVacancy) {
            frame1.setVisible(false);
            frame2.setVisible(true);
        } 
        else if (e.getSource() == btnAddFullTimeVacancy) {
            frame7.setVisible(true);
            frame1.setVisible(false);
        } 
        else if (e.getSource() == backBtn || e.getSource() == backBtn2 || e.getSource() == backBtn3
                || e.getSource() == backBtn4) {
            back();
        } 
        else if (e.getSource() == Reset1 || e.getSource() == Reset2 || e.getSource() == Reset3
                || e.getSource() == Reset4) {
            ResetX();
        } 
        else if (e.getSource() == btnSavePartTimeVacancy) {
             if (wagesPerHourFT.getText().trim().isEmpty() || jobTypeFT.getText().trim().isEmpty()
                    || DesignationFT.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill all the information");
             } 
             else {
                int Vno = Integer.parseInt(VacancyNumPT.getText());
                int Whr = Integer.parseInt(comboWorkingHourPartTime.getSelectedItem().toString());
                String sh = (String) comboShift.getSelectedItem();
                int wph = Integer.parseInt(wagesPerHourFT.getText());
                staffList.add(new PartTimeStaffHire(Vno, DesignationFT.getText(), wph, jobTypeFT.getText(), Whr, sh));
                JOptionPane.showMessageDialog(null, "Part-Time acancy created!");
                ResetX();
                vacancyNoFTS.setText(String.valueOf(staffList.size()+ 1));
                VacancyNumPT.setText(String.valueOf(staffList.size()+ 1));
             }
             setVacancy();                 
        }
        else if (e.getSource() == btnHirePartTimeStaff) {
            if ( PartTimeStaffCount() == 0) {
                JOptionPane.showMessageDialog(null, "No empty vacancy!");
            } else {
                frame1.setVisible(false);
                frame4.setVisible(true);
            }
        } else if (e.getSource() == btnSavePartTimeStaff) {
            String date = joinedDatePTS.getText();
            String name = staffNamePTS.getText();
            String qualification = qualificationPTS.getText();
            String appointedBy = appointedByPTS.getText();
            if (date.trim().isEmpty() || name.trim().isEmpty() | qualification.trim().isEmpty()
                    || appointedBy.trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame9,  "Please fill all the information!","Error!!",JOptionPane.ERROR_MESSAGE);
            } else {
                int Vno = Integer.parseInt(comboVacancyNumberPartTime.getSelectedItem().toString());
                if(staffList.get(Vno-1) instanceof FullTimeStaffHire){
                    JOptionPane.showMessageDialog(frame9, "Warning!","Can't hire Part-Time-Staff in Full-Time-Satff's vacancy!",  
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                 PartTimeStaffHire staff = (PartTimeStaffHire) staffList.get(Vno - 1);
                 if (!staff.getJoined()) {
                    staff.hirePartTimeStaff(staffNamePTS.getText(), joinedDatePTS.getText(), qualificationPTS.getText(),
                    appointedByPTS.getText());
                    JOptionPane.showMessageDialog(null, "Staff has been hired!");
                    
                    ResetX();
                 } else {
                    JOptionPane.showMessageDialog(frame4, "Staff has already been hired for this vacancy!", "Error",
                    JOptionPane.ERROR_MESSAGE);
                 }
               } 
            }
        } else if (e.getSource() == btnDisplayPartTime) {
            add();
            frame5.setVisible(true);
        } else if (e.getSource() == btnTerminateFunction) {
           if (PartTimeStaffCount() == 0) {
                JOptionPane.showMessageDialog(null, "Staff has not been hired!");
            } else {
                frame6.setVisible(true);
            }
        } 
        else if (e.getSource() == showInfoBtn) {
            PartTimeStaffHire staff= (PartTimeStaffHire) staffList.get(Integer.parseInt(terminatingVacancy.getSelectedItem().toString())-1);
            String Data= "\n"+"Name: "+ staff.getStaffName()+"\n"+"\n"+"Joined Date: "+ staff.getJoinedDate()+"\n"+"\n"+"Shifts: "+ staff.getShifts()+"\n"+"\n"+
            "Wages Per Hour: "+ staff.getWagesPerHour()+"\n"+"\n"+"Working Hour: "+ staff.getWorkingHour()+"\n"+"\n"+"Qualification: "+ staff.getQualification();
            StaffInfoToTerminateTxtArea.setText(Data);
            StaffInfoToTerminateTxtArea.setEditable(false);
            } 
        else if (e.getSource() == btnTerminate) {
            int Vno = Integer.parseInt(terminatingVacancy.getSelectedItem().toString());
            if(staffList.get(Vno-1) instanceof FullTimeStaffHire){
                JOptionPane.showMessageDialog(frame4,  "Can't Terminate a Full-Time-Staff!"+"\n"+"Select A Part-Time-Staff's Vacancy no."
                ,"Error!!",JOptionPane.ERROR_MESSAGE);
            }
            else { 
            PartTimeStaffHire staff = (PartTimeStaffHire) staffList.get(Vno-1);
              if (staff.getTerminated()) {
                JOptionPane.showMessageDialog(null, "Staff has already been Terminated!");
              } 
              else {
                staff.terminateAStaff();
                JOptionPane.showMessageDialog(null, "Staff has been sucessfully Terminated!");
              }
           } 
        }
        else if (e.getSource() == btnSaveFullTimeVacancy) {
            if (designationFTS.getText().trim().isEmpty() || jobTypeFTS.getText().trim().isEmpty()
                    || salaryFTS.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all the information!");
            } 
            else {
                int Vno = Integer.parseInt(vacancyNoFTS.getText());
                int Whr = Integer.parseInt(comboWorkingHourFullTime.getSelectedItem().toString());
                int salary = Integer.parseInt(salaryFTS.getText());
                staffList.add(new FullTimeStaffHire(Vno, designationFTS.getText(), jobTypeFTS.getText(), salary, Whr));
                JOptionPane.showMessageDialog(null, " Full-Time-Vacancy Created ");
                ResetX();
               
                VacancyNumPT.setText(String.valueOf(PartTimeStaffCount() +1));
                vacancyNoFTS.setText(String.valueOf(staffList.size()+ 1));
                setVacancy();
             }
        }
        else if (e.getSource() == btnHireFullTimeStaff) {
            if (FullTimeStaffCount()== 0) {
                JOptionPane.showMessageDialog(null, "No vacancy to hire!");
            } else {
                frame9.setVisible(true);
                frame1.setVisible(false);
            }
        } 
        else if (e.getSource() == btnSaveFullTimeStaff) {
            String date = joiningDateFTS.getText();
            String name = staffNameFTS.getText();
            String qualification = qualificationFTS.getText();
            String appointedBy = appointedByFTS.getText();
            if (date.trim().isEmpty() || name.trim().isEmpty() | qualification.trim().isEmpty()
                    || appointedBy.trim().isEmpty()) {
                      JOptionPane.showMessageDialog(frame9, "Please fill all the information!", "Error!!",
                      JOptionPane.ERROR_MESSAGE);
            } 
            else {
                int Vno = Integer.parseInt(comboVacancyNumberFullTime.getSelectedItem().toString());
                if(staffList.get(Vno-1) instanceof PartTimeStaffHire){
                    JOptionPane.showMessageDialog(frame9, "Can't hire Full-Time-Staff in Part-Time-Satff's Vacancy"+"\n"+
                    "Select proper Vacancy Number", "WARNING", 
                    JOptionPane.WARNING_MESSAGE);
                }
                else{
                 FullTimeStaffHire staff = (FullTimeStaffHire) staffList.get(Vno - 1);
                 if (!staff.getJoined()) {
                    staff.hireFullTimeStaff(staffNameFTS.getText(), joiningDateFTS.getText(), qualificationFTS.getText(),
                            appointedByFTS.getText());
                    JOptionPane.showMessageDialog(null, "Full-Time-Staff has been hired!");
                    ResetX();
                 } 
                  else {
                    JOptionPane.showMessageDialog(frame9, "A Staff has already been hired for this vacancy!"+"\n"+
                    "Vacancy unavailable", "Inane error", 
                    JOptionPane.ERROR_MESSAGE);
                 }
              }
           }
        } 
         else if (e.getSource() == btnDisplayFullTime) {
            add();
            frame10.setVisible(true);
         }
         else if (e.getSource() == exit) {
            System.exit(0);
        } 
    }
 
    public void ResetX() {
        joinedDatePTS.setText("");
        staffNamePTS.setText("");
        qualificationPTS.setText("");
        appointedByPTS.setText("");
        wagesPerHourFT.setText("");
        DesignationFT.setText("");
        jobTypeFT.setText("");
        designationFTS.setText("");
        jobTypeFTS.setText("");
        salaryFTS.setText("");
        staffNameFTS.setText("");
        jobTypeFTS.setText("");
        qualificationFTS.setText("");
        appointedByFTS.setText("");
        joiningDateFTS.setText("");
    }

    public int PartTimeStaffCount() {
        int PartTimeCount = 0;
         for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i) instanceof PartTimeStaffHire) {
                PartTimeCount += 1;
            }
         }
        return PartTimeCount;
    }

    public int FullTimeStaffCount() {
        int FullTimeCount = 0;
         for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i) instanceof FullTimeStaffHire) {
                FullTimeCount += 1;
            }
         }
        return FullTimeCount;
    }
     
    public void setVacancy(){
        terminatingVacancy.removeAllItems();
         for (int i=0; i<staffList.size();i++){
            if(staffList.get(i) instanceof PartTimeStaffHire){
              terminatingVacancy.addItem(i+1);
            }
         }
            comboVacancyNumberPartTime.addItem(staffList.size());
            comboVacancyNumberFullTime.addItem(staffList.size());
    }
    
    public void add() {
       VacancyNumPT.setText(String.valueOf(staffList.size() +1));
       model2.setRowCount(0);
       model4.setRowCount(0);
         for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i) instanceof PartTimeStaffHire) {
                PartTimeStaffHire staff = (PartTimeStaffHire) staffList.get(i);
                if (staff.getJoined()) {
                    model2.addRow(new Object[] { staff.getVacancyNumber(), staff.getDesignation(),
                            staff.getWagesPerHour(), staff.getJobType(), staff.getWorkingHour(), staff.getShifts(),
                            staff.getStaffName(), staff.getJoinedDate(), staff.getQualification(),
                            staff.getAppointedBy() }); 
                 } 
                else {
                    model2.addRow(new Object[] { staff.getVacancyNumber(), staff.getDesignation(),
                    staff.getWagesPerHour(), staff.getJobType(), staff.getWorkingHour(), staff.getShifts() });
                }
            } 
            else {
                FullTimeStaffHire staff = (FullTimeStaffHire) staffList.get(i);
                if (staff.getJoined()) {
                    model4.addRow(new Object[] { staff.getVacancyNumber(), staff.getDesignation(), staff.getJobType(),
                            staff.getSalary(), staff.getWorkingHours(), staff.getStaffName(), staff.getJoiningDate(),
                            staff.getQualification(), staff.getAppointedBy() });
                 } 
                else {
                    model4.addRow(new Object[] { staff.getVacancyNumber(), staff.getDesignation(), staff.getSalary(),
                            staff.getJobType(), staff.getWorkingHours() });
                } 
            }
         }
    }
}
