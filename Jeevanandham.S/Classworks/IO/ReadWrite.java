import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
class ReadWrite
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

	
		// Using FileWriter and FileReader


		try(FileWriter fs = new FileWriter("file.txt");// this paranthesis will automatically close the files opened inside the paranthesis
		BufferedWriter bs = new BufferedWriter(fs);)
		{
			System.out.println("(using FileWriter)Enter the content");
			String s = sc.nextLine();
			bs.write(s);// write metho in FileWriter writes as character
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		try(FileReader fr = new FileReader("file.txt");
		BufferedReader br = new BufferedReader(fr);)
		{
			
			System.out.println(br.read());// reads the whole content as a character not as bytes
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


		//Using IO Stream



		try(FileOutputStream fos = new FileOutputStream("file.txt");
		    BufferedOutputStream bos = new BufferedOutputStream(fos);
		    InputStreamReader isr = new InputStreamReader(System.in);
		    BufferedReader b = new BufferedReader(isr);)
			
		{
			System.out.println("(using stream)Enter the content ");
			String st = b.readLine();// getting user input using InputStreamReader
			byte[] arr = st.getBytes();// converting string to byte array because the write method in stream writes only the bytes
			System.out.println(Arrays.toString(arr));//printing the byte array
			bos.write(arr); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try(FileInputStream fis = new FileInputStream("file.txt");
		   BufferedInputStream bis = new BufferedInputStream(fis);)
		{
			while(true){
				int by = bis.read();// it will read as bytes,it will read only one byte at a time 
				if(by == -1) // -1 indicates the end of file
				{
					break;	
				}
				System.out.print((char)by);// bytes are typecasted to characters
			}	 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}