package package1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Txt {
    
	 public static void txt(){


	        try (FileReader fInputStream = new FileReader("D://src/A.txt");
	             FileWriter fOutputStream  = new FileWriter("D://src/B.txt")){
	            StringBuffer st=new StringBuffer();
	            char[] ch=new char[14];
	            while ((fInputStream.read(ch)) !=-1) {
	                st.append(ch, 0,7);
	                st.append("，");
	                st.append(ch, 7, 7);
	                st.append("。"+"\n");
	            }
	            System.out.println(st);
	            fOutputStream.write(new String(st));
	        }catch (IOException e) {
	            e.printStackTrace();
	        }

	    }
}
