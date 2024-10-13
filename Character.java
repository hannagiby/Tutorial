package evenpackage;
import java.io.*;
public class Character {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		try
		{
			File f=new File("line.txt");
			FileInputStream fi=new FileInputStream(f);
			BufferedReader br=new BufferedReader(new InputStreamReader(fi));
			String line;
			int no=1;
			while((line=br.readLine())!=null)
			{
			System.out.println(no+":"+line);
			no++;
			}
			}
		catch(Exception e)
		{
		System.out.println("An error occured:"+e.getMessage());
		}
	}
}
