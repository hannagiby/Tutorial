package evenpackage;
import java.io.*;
public class CountLine { 
	public static void main(String[] args) {
		int i=0;
		try
		{
		FileInputStream fi=new FileInputStream("input.txt");
		BufferedReader b=new BufferedReader(new InputStreamReader(fi));
		String line;
		int no=0;
		while((line=b.readLine())!=null)
		{
		System.out.println(line);
		no++;
		}
		System.out.println("Number of lines:"+no);
		}
		catch(Exception e)
		{
		System.out.println("An error occured:"+e.getMessage());
		}
    }
}
