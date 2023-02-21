import java.io.*;

class filetest {
   public static void main(String[] args) {
      try {
         FileReader fin = new FileReader("file1.txt");
         FileWriter fout = new FileWriter("file2.txt");
         int i;
         while ((i = fin.read()) != -1) {
            fout.write(i);
         }
         fin.close();
         fout.close();
      } catch (IOException e) {
         System.out.println(e);
      }
   }
}
