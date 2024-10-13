package evenpackage;
import java.io.*;
public class CreateFile {
	public static void main(String[] args) throws IOException {
		File f =new File("MyFile.txt");
		f.createNewFile();
		String co="This is University Exam for OOPD.\nThis is a program to illustrate the use of Files.";
		try {
			FileOutputStream fo=new FileOutputStream(f);
			fo.write(co.getBytes());
			FileInputStream fi=new FileInputStream(f);
			int i;
			while((i=fi.read())!=-1)
			{
				char c=(char)i;
				System.out.print(c);
			}
		}
			catch(Exception e) {
			System.out.println("Error occured");
			}
		}
}
