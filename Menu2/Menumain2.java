
package Menu2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Menumain2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
          try 
          {

            File file = new File("D:\\j57 java\\file handling\\biodata.txt");

            if (!file.exists()) 
            {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);

            // Personal Details
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter Date of Birth: ");
            String dob = sc.nextLine();

            System.out.print("Enter Blood Group: ");
            String blood = sc.nextLine();

            // Educational Details
            System.out.print("Enter Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Enter College Name: ");
            String college = sc.nextLine();

            System.out.print("Enter Percentage/CGPA: ");
            String cgpa = sc.nextLine();

            // Professional Details
            System.out.print("Enter Skills: ");
            String skills = sc.nextLine();

            System.out.print("Enter Experience (Years): ");
            String experience = sc.nextLine();

            // Contact Details
            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Enter Email ID: ");
            String email = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            // Family Details
            System.out.print("Enter Father Name: ");
            String father = sc.nextLine();

            System.out.print("Enter Mother Name: ");
            String mother = sc.nextLine();

            // Writing to File
            fw.write("=========== BIO DATA ===========\n\n");

            fw.write(" Personal Details\n");
            fw.write("Name : " + name + "\n");
            fw.write("Age : " + age + "\n");
            fw.write("Gender : " + gender + "\n");
            fw.write("DOB : " + dob + "\n");
            fw.write("Blood Group : " + blood + "\n\n");

            fw.write("🎓 Education\n");
            fw.write("Qualification : " + qualification + "\n");
            fw.write("College : " + college + "\n");
            fw.write("CGPA : " + cgpa + "\n\n");

            fw.write("💼 Professional Details\n");
            fw.write("Skills : " + skills + "\n");
            fw.write("Experience : " + experience + " Years\n\n");

            fw.write("📞 Contact Details\n");
            fw.write("Phone : " + phone + "\n");
            fw.write("Email : " + email + "\n");
            fw.write("Address : " + address + "\n\n");

            fw.write("👨‍👩‍👧 Family Details\n");
            fw.write("Father Name : " + father + "\n");
            fw.write("Mother Name : " + mother + "\n");

            fw.write("\n================================");

            fw.close();

            System.out.println("\nBio Data saved successfully in biodata.txt");

        } 
          catch (IOException e)
        {
            System.out.println("Error while writing file.");
        }

        sc.close();
        
    }
    
}
