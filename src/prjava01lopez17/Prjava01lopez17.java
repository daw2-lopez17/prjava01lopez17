package prjava01lopez17;
import java.io.*;

public class Prjava01lopez17 {

    public static void main(String[] args) throws IOException {
       
       File f = new File("fitxer01lopez17.com");
       
       try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
           
           bw.write("<html>");bw.newLine();
           bw.write("<head>");bw.newLine();
           bw.write("<title>");bw.newLine();
           bw.write("Nova página web de lopez17");bw.newLine();
           bw.write("</title>");bw.newLine();
           bw.write("</head>");bw.newLine();
           bw.write("<body>");bw.newLine();
           bw.write("Nova página web de lopez17");bw.newLine();
           bw.write("</body>");bw.newLine();
           bw.write("</html>");bw.newLine();
           bw.close();
       
       }
        
    }
    
}
