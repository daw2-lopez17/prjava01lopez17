package prjava01lopez17;
import java.io.*;

public class Prjava01lopez17 {

    public static void main(String[] args) throws IOException {
       
       File f = new File("fitxer01lopez17.html");
       
       try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
           
           bw.write("<html>");bw.newLine();
           bw.write("<head>");bw.newLine();
           bw.write("<title>");bw.newLine();
           bw.write("Nova p$agrave;gina web de lopez17");bw.newLine();
           bw.write("</title>");bw.newLine();
           bw.write("</head>");bw.newLine();
           bw.write("<body>");bw.newLine();
           bw.write("Nova p$agrave;gina web de lopez17");bw.newLine();
           bw.write("<br>");bw.newLine();
           bw.write("DAW2 UF4 Pr$agrave;ctica 2");bw.newLine();
           bw.write("</body>");bw.newLine();
           bw.write("</html>");bw.newLine();
           bw.close();
       
       }
        
    }
    
}
