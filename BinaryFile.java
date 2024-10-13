package evenpackage;
import java.io.*;
public class BinaryFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File b1=new File("binary1.txt");
			File b2=new File("binary2.txt");
			try
			{
				FileInputStream fi=new FileInputStream(b1);
				FileOutputStream fo=new FileOutputStream(b2);
				int i;
				System.out.print("Data of the original file:");
				while((i=fi.read())!=-1)
				     {
					char c=(char)i;
					System.out.print(c);
					fo.write(i);
				     }
				}
			catch(Exception e)
				{
				System.out.println("An error occured:"+e.getMessage());
				}
			try
				{
				FileInputStream fi2=new FileInputStream(b2);
				System.out.print("Data of the copied file:");
				int i;
				while((i=fi2.read())!=-1)
				{
				char c=(char)i;
				System.out.print(c);
				}
				}
			catch(Exception e)
				{
				System.out.println("An error occured while copying:"+e.getMessage());
				}

	}

}
