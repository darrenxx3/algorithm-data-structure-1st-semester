package CDARREN_00000054804_IS103AL;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
public class No2 {
	 private Formatter output;
	  public void outputFile () {
	   try {
	    output = new Formatter ("report.txt");
	   }catch (SecurityException excpt1) {
	    System.err.println("Error reading file!");
	    System.exit(1);
	   }catch (FileNotFoundException excpt2) {
	    System.err.println("Error opening file!");
	    System.exit(1);
	
	   }
	  }

	  public void isiDataOutput () {
		   try {
		    File file = new File ("Financial.txt");
		    Scanner scan = new Scanner (file);
		    runn [] rnr = new runn [5];
		    
		    for (int x = 0; x < rnr.length; x++) {
		     rnr [x] = new runn();
		    }
		    for (int x = 0; x < rnr.length; x++) {
		     rnr [x].nama = scan.nextLine();
		     rnr [x].kecepatan = scan.nextLine();  
		    }
		    
		   scan.close();
		 
		   for (int x = 0; x < 1; x++) {
			     int order = x + 1;
			     output.format("%d. %s: Rp.%s ", order, rnr[x].nama, rnr[x].kecepatan);
			    }
			    
			    for (int x = 1; x < 3; x++) {
			     int order = x + 1;
			     output.format("\n%d. %s: Rp.%s  ", order, rnr[x].nama, rnr[x].kecepatan);
			    }
			    
			    for (int x = 3; x < 4; x++) {
			     int order = x + 1;
			     output.format("\n%d. %s: Rp.%s  ", order, rnr[x].nama, rnr[x].kecepatan);
			    }
			    
			    for (int x = 4; x < 5; x++) {
			     int order = x + 1;
			     output.format("\n%d. %s: Rp.%s  ", order, rnr[x].nama, rnr[x].kecepatan);
			    }
			   }catch (Exception e) {
			    System.err.println("Incorrect file format!");
			    System.exit(1);
			   }
			  }
			  
			  public void tampilanOutputFile () {
			   try {
			    File file = new File ("report.txt");
			    Scanner scan = new Scanner (file);
			    
			    while (scan.hasNext()) {
			     System.out.println(scan.nextLine());
			    }
			    scan.close();
			   }catch (Exception e) {
			    System.err.println("Error writing file! ");
			   }
			  }
			  
			  public void tutupOutputFile () {
			   if (output != null) {
			    output.close();
			   }
			  }
			  
			 public static void main(String[] args) {
			  // TODO Auto-generated method stub
			 No2 runner = new No2 ();
			    runner.outputFile();
			    runner.isiDataOutput();
			    runner.tutupOutputFile();
			    runner.tampilanOutputFile();
			 }  
	

	}

