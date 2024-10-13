package evenpackage;
import java.io.*;
public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content="Smitha is your java teacher\n";
		File f1=new File("File1.txt");
		File f2=new File("File2.txt");
	    try
		   {
		      if(f1.exists())
		      {
				System.out.println("File1 exists.");
				FileOutputStream fo=new FileOutputStream(f1);
				fo.write(content.getBytes());
				fo.close();
			}
		      else
		        {
		          System.out.println("File1 does not exists");
		        }
		   }
		catch(Exception e)
		{
				System.out.println(e.getMessage());
		}
		if(f2.exists())
		{
		   System.out.println("File2 exists");
		   try
		{
			FileInputStream fi=new FileInputStream(f1);
			FileOutputStream fo=new FileOutputStream(f2);
			System.out.println("File contents copied from file1 to file2.");
			int c;
			while((c=fi.read())!=-1)
			 {
				fo.write(c);
			 }
			fi.close();
			fo.close();
			String line;
			System.out.println("**file contents of file 1**");
			BufferedReader b1=new BufferedReader(new FileReader(f1));
			while((line=b1.readLine())!=null)
			 {
				System.out.println(line);
			 }
			 b1.close();
			 System.out.println("**File contents of File 2**");
			 BufferedReader b2=new BufferedReader(new FileReader(f2));
			  while((line=b2.readLine())!=null)
			   {
			     System.out.println(line);
			   }
			   b2.close();
			}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		}
		else
		{
		System.out.println("File2 does not exists");
		}
    }
}
