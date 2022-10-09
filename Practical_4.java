//ID : 21CE113
//Aim :  WAP to show use of character and byte stream.
import java.io.File;
import java.io.FileInputStream;
import java.io.*;
public class Practical_4
{
public static void main(String[] args) throws IOException
{ 
FileReader sourceStream = null;
try
{
sourceStream = new FileReader("D:\\java part 5\\Practical_4.txt");
// reading from the file character by character
int temp;
while ((temp = sourceStream.read()) != -1)
{
System.out.println((char)temp);
}
}
finally
{ 
// closing stream as no longer in use
if (sourceStream != null) 
{
sourceStream.close();
} 
}
}
}
