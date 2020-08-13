import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NewAccount  {
    public static String name;
    public static String accNo;
    public  static String PAN, acctype,gender,emailID,Branch;
    public  static String mobileNo;
    Scanner sc=new Scanner(System.in);
    public String account(){
        System.out.println("Please Enter branch code");
        Branch=sc.next();
        accNo=Branch+ "1234";
        return accNo;
    }

    public static String getDate() {
        DateFormat df = new SimpleDateFormat();
        Date dateobj = new Date();
        return df.format(dateobj);
    }

    public static void CustomerDetail() {
        System.out.println("Hi," + name + " you have successfully added account number" +accNo+" with " +acctype + " account with PAN number:" + PAN + " and emailID: " + emailID + "& Mobile No.:" + mobileNo+" has been registered with our bank on"+getDate());

    }



}

