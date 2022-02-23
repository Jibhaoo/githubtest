package POI;



import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;


import org.testng.annotations.Test;


public class HTMLfile {
 
 @Test
  
public void createTXT() throws Exception{

File f=new File("C:\\Users\\HP\\Desktop\\SOFTWARE TESTING PROGRAMS\\sample.html.txt                        ");

FileWriter fw=new FileWriter(f, true);

BufferedWriter bw=new BufferedWriter(fw);

	  bw.write("Nagesh");
	
  bw.newLine();
	 
 bw.write("Raj");

	  bw.newLine();
	
  bw.write("Testing");
	
  bw.close();
 
 }
  
@Test
 
 public void createHTML() throws Exception{

	  File f=new File("C:\\Users\\HP\\Desktop\\SOFTWARE TESTING PROGRAMS\\sample.html.txt                        ");
	
  FileWriter fw=new FileWriter(f);
	
  BufferedWriter bw=new BufferedWriter(fw);

	  bw.write("<table cellspacing='2' cellpading='3' border='3'>");

	  bw.write("<tbody>");
	 
 bw.write("<tr>");

	  bw.write("<td>");
	
  bw.write("Nagesh");
	
  bw.write("</td>");

	  bw.write("<td>");

	  bw.write("Suresh");
	 
 bw.write("</td>");
	
  bw.write("</tr>");
	

  bw.write("<tr>");

	  bw.write("<td>Manual Testing</td>");

	  bw.write("<td>Automation Testing</td>");
	
  bw.write("</tr>");
	
  bw.write("<tr>");
	
  bw.write("<td><font size='8' color='green'>Raj</font></td>");
	
  bw.write("<td><font size='10' color='Red'>Ram</font></td>");
	  

	  bw.write("</tr>");
	
  bw.write("</tbody>");
	
  bw.write("</table>");
	 
 bw.close();

  }

}






