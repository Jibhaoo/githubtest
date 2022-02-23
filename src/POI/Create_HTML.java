package POI;
import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

@Test
public class Create_HTML {
  public void f() throws Exception {
	  File f=new File("C:\\Users\\HP\\Desktop\\SOFTWARE TESTING PROGRAMS\\jivan.html");
	  FileWriter fw=new FileWriter(f);
	  BufferedWriter bw=new BufferedWriter(fw);
	  bw.write("<table cellpadding='20' cellspacing='1' border='2'>");
	   bw.write("<tbody>");
	   bw.write("<tr>");
	   bw.write("<td><font size='10 ' face='bold' color='orange'>");
	   bw.write("jibhaoo");
	   bw.write("</font></td>");
	   bw.write("</tr>");
	   bw.write("<tr>");
	   bw.write("<td><font size='8' face='bold' color='red'>");
	   bw.write("sriram");
	   bw.write("</font></td>");
	   bw.write("</tr>");
	   
	   
	   
	   bw.close();
	   
	  
  }
}
