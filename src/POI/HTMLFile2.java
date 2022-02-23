package POI;


import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;


import org.testng.annotations.Test;


public class HTMLFile2 {
 
 @Test
  
public void f() throws Exception{

File f=new File("C:\\Users\\HP\\Desktop\\SOFTWARE TESTING PROGRAMS\\result.html.txt");

FileWriter fw=new FileWriter(f);

BufferedWriter bw=new BufferedWriter(fw);

bw.write("<table cellspacing='2' cellpading='3' border='2'>");

bw.write("<tbody>");

bw.write("<tr>");

	bw.write("<td>");

	bw.write("<font size='4' color='green'>");

	bw.write("TC ID");

	bw.write("</font>");

	bw.write("</td>");

	bw.write("<td>MethodName</td>");
	
bw.write("<td>Description</td>");
	
bw.write("<td>Result</td>");

	bw.write("<td>ScreenShot</td>");

bw.write("</tr>");


bw.write("<tr>");

	bw.write("<td>1</td>");
	
bw.write("<td>Login</td>");
	
bw.write("<td>Login</td>");

	bw.write("<td>Pass</td>");
	
bw.write("<td><a href='D:\\WorkSpace_745\\test1.png' target='_blank'>Nagesh</a></td>");

bw.write("</tr>");


bw.write("<tr>");

bw.write("<td><font size='4' color='red'>2</font></td>");

bw.write("<td><font size='4' color='red'>Compose</font></td>");

bw.write("<td><font size='4' color='red'>Compose</font></td>");

bw.write("<td><font size='4' color='red'>Pass</font></td>");

bw.write("</tr>");


bw.write("</tbody>");

bw.write("</table>");


bw.close();


  }

}




