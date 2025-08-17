package TaskArray;

import java.util.Scanner;

public class Students {
    public long id;
    public String StudentName;
    public String Stack;
    public Genders gender;


    //the constructor
    public Students (long id, String StudentName, String Stack, Genders gender){
        this.id = id;
        this.StudentName = StudentName;
        this.Stack = Stack;
        this.gender = gender;
    }
    //print
    public String student_Details(){
        return "============================Full Details==========================\n"+
                "id:"+ this.id + "\n"+
                "StudentName:"+ this.StudentName +"\n" +
                "Stack:"+ this.Stack+ "\n" +
                "Gender:" + gender;
    }



    //how many student you want to register===========================================================================================
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        number of student you want to register
        System.out.println("how many student do you want to register:");
        int count = scan.nextInt();

//        Students[] SA = new Students[count];  //this to store users not the demo own
//        Students[] demoStudents ={user1,user2,user3};
        scan.nextLine();


        //        //this print the details
//        System.out.println(SA[count].student_Details());
//        System.out.println(.student_Details());
        Students user1 = new Students(1, "pellia micheal", "Java", Genders.male);
//        System.out.println(user1.student_Details());  //this is print 5 times
        Students user2 = new Students(2, "Abass Eket", "JavaScript", Genders.male);
//        System.out.println(user2.student_Details());   //this is print 5 times
        Students user3 = new Students(3, "Johanna ", "Phyon", Genders.female);
//        System.out.println(user3.student_Details());   //this is print 5 times

        //the users
//        Students[] demoStudents = {user1,user2,user3};
//        if(count > demoStudents.length){
//            System.out.println("\n😡 there are no users like that:" +demoStudents.length + "only ") ;
//            count = demoStudents.length;
//        }else{
//           for(int i = 0; i < count; i++){
//               System.out.println(demoStudents[i].student_Details());
//           }
//        }
////        System.out.println(demoStudents.student_Details);
//        for(int i = 0; i < count; i++){
//            System.out.println(demoStudents[i].student_Details());   //this is printing the users
//
//        }
////        so lets list the student dashboard
//        System.out.println("\n********************************88Student Dashboard**************************************");
//        for(int i = 0; i < count; i++){
////            System.out.println( "ID:" + demoStudents[i].id);
//            System.out.println( "StudentName:"+ demoStudents[i].StudentName);  //BY THEIR NAMES
////            System.out.println("Stack:" + demoStudents[i].Stack);
////            System.out.println("Gender:" +demoStudents[i].gender);
//        }
////        get a specified student
//        System.out.println("\n ==============Index of specified student:============--");
////        scan.nextLine();
//        String[] studentname = new String[3];
//        studentname[0] = "pellia micheal";
//        studentname[1] = "Abass Eket";
//        studentname[2] = "Johanna";
//
//        //UPDATE A SPECIFIC STUDENT we are updating th index 0;
//        studentname[0] = "lisa Emesowum";
//        demoStudents[0].StudentName = "lisa emesowum";
//
////        System.out.println("\n*************************** Enter the index of the specified student*****************************");
////        scan.nextLine();
//        int index = scan.nextInt();
//
//        if (index >= 0 && index < studentname.length) {
//            System.out.println("\n"+ studentname[index] +"\n");
//            System.out.println("\n" + demoStudents[index].student_Details() + "\n");
////
//        }else{
//            System.out.println("\n invalid" + studentname.length);
//        }
//        System.out.println(studentname[1]);


//==========================let me the non demo own ================================================================
        Students[] SA = new Students[count];  //this to store users not the demo own

        for(int i = 0; i <count; i++){
//            System.out.println("+++++++++++++++Enter the the first student ++++++++++++++++++++++++");
            System.out.println("Id:");
            int Id = scan.nextInt();

            //name
            System.out.println("Student name: ");
            String StudentName = scan.next();

            //stack
            System.out.println("Stack: ");
            String stack = scan.next();

            //gender
            System.out.println("Enter valid gender");
//            String gender = scan.nextLine();
            String genderA = scan.next();
            Genders gender = Genders.valueOf(genderA);  // we will convert the enum to string
            //text area
            SA[i] = new Students(Id,StudentName,stack,gender);
//            System.out.println("StudentName: " + SA[i]);

        }
//        ==============lets print the details
        System.out.println("\n ==========================================Real demo student ================");
        for(int i = 0; i< SA.length; i++){
            System.out.println("StudentName:"+ SA[i].StudentName);
        }


        //let check if this student is valid
//        for (int i = 0; i < count; i++) {     //loops through each student you want to register.
//            System.out.println("  Student Register:");
//        }
//
//        System.out.println("Enter student name");
//        String name = scan.nextLine();
//        if (name.trim().isEmpty()) {
//            System.out.println("put your student name");
//        } else {
//            System.out.println("Name:" + name);
//        }
//        System.out.println("Enter Stack");
//        String Stack = scan.nextLine();
//        if (Stack.trim().isEmpty()) {
//            System.out.println("put your Stack");
//        } else {
//            System.out.println("Stack:" + Stack);
//        }


//        ===================i Was trying to do for only the printed users not the demo users===================
//   well this code ;if the user put 2 users only 2 details should show
//
//        if(count !=1 && count !=2){
//            count = 1;
//        }
//        for(int i = 0; i < count; i++  ){
//            if(SA[i] != null){
//                System.out.println(SA[i].student_Details());
//            }
//        }
//
//        //so this user is just a demo
//        for (int i = 0; i < count; i++) {
//            System.out.println("Enter details for student "  + ":");
//
//            System.out.println("Enter you Id:");
//            long id = scan.nextLong();
//            scan.nextLine();
//
//            System.out.println("Student Name:");
//            String name = scan.nextLine();
//
//            System.out.println("Stack:");
//            String stack = scan.nextLine();
//
//            System.out.println("Gender (male/female):");
//            String gen = scan.nextLine();
//
//            Genders gender = gen.equals("female") ? Genders.female : Genders.male;
//            SA[i] = new Students(id, name, stack, gender);
//
//        }
//        for(Students s : SA){
//        System.out.println(s.student_Details());
//    }
//
//        =================================================================================================================




    }

}
