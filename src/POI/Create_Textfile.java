package POI;

import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create_Textfile {
  @Test
  public void f() throws Exception {
	  File f =new File("C:\\Users\\HP\\Desktop\\SOFTWARE TESTING PROGRAMS\\shiv.txt");
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("jibhaoo");
	bw.newLine();
	bw.write("nanaji");
	bw.newLine();
	bw.write("bhadane");
	bw.close();
  }
}
