package day04;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.io.FileHandler;

public class Flie {
	@Test
	public void open() throws IOException{
		//FileHandler.createDir(new File("D:\\selenium\\data1"));
		FileHandler.copy(new File("D:\\\\selenium\\\\data"),
				new File("D:\\\\selenium\\\\data1"),".docx" );
	}
}
