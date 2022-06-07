package decorator.inputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
  public static void main(String[] args) {
    int c;
    try{
      InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/decorator/inputstream/test.txt")));
      while ((c = in.read()) >= 0) {
        System.out.print((char) c);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
