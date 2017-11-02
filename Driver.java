import java.io.*;

public class Driver {
	
    public static void main(String args[]) {
        InputStreamReader inputStream = null;
        try {
            if (args.length == 1) { 
                System.out.println("\nReading from file " + args[0]);
                inputStream =  new FileReader(args[0]);
            } else {
               System.out.println(
                              "Usage: java Driver input.txt");
               System.exit(-1);
            }
            
            Parser parser =  new Parser(inputStream);
            ASTSpeech root = parser.Speech();
            System.out.println(
			    "\nspeech file parsed successfully.\n");
 
            // Print an indented list of the AST nodes: 
            ShowSyntaxTree printer = new ShowSyntaxTree(); 
            printer.print(root);            
            
        } catch (ParseException pe) {
            System.out.println("Main : " + pe.getMessage());
        }catch (java.io.FileNotFoundException fnfe) {
            System.out.println("Main : " + fnfe.getMessage());
            System.exit(0);
        }
    }
}
