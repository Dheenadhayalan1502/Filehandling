
package Menu1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MenuMain1 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        File f1=new File("D:\\j57 java\\file handling\\Dheena.txt");
        while(true)
        {
            System.out.println("1.write data");
            System.out.println("2.Read");
            System.out.println("3.Append");
            System.out.println("4.Exit");
            System.out.println("eneter your choice :");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                {
                try
                {
                    FileWriter fw=new FileWriter(f1);
                    System.out.println("enter the data");
                    String data=sc.nextLine();
                    
              
                    fw.write(data);
                    fw.close();
                } 
                catch (IOException ex) 
                {
                    System.out.println("error with writing file ");
                }
                break;
                    
                    
                }
                case 2 :
                {
                    if(!f1.exists())
                    {
                        System.out.println("file not found");
                    }
                    else
                    {
                        
                    
                    FileReader fr=new FileReader(f1);
                    int a=0;
                    while((a=fr.read())!=-1)
                    {
                        char ch=(char)a;
                        System.out.println(ch);
                    }
                    fr.close();
                    }
                    break;
                }
                case 3:
                {
                     FileWriter fw=new FileWriter(f1,true);
                    
                     System.out.println("enter the data");
                    String data=sc.nextLine();
                     fw.write("\n"+data);
                     System.out.println("Data written successfully.");
                    fw.close();
                    break;
                }
                case 4:
                {
                    System.out.println("exitinig");
                    sc.close();
                    System.exit(0);
                    
                    
                }
            }
            
            
        }
        
    }
    
    
}
