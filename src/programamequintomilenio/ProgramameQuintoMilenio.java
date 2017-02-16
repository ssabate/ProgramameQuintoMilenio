/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamequintomilenio;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author salcu
 */
public class ProgramameQuintoMilenio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entI=new Scanner(new InputStreamReader(System.in));
        long casos=entI.skip("[\r\n]*").nextLong();
        for (; casos >0; casos--) {
            
            
            //String text=entSt.nextLine();
            //String ocult=entSt.nextLine().replaceAll("\\p{Space}", "");
            //String regexp="[^"+ocult+"]";
            //text.replaceAll(regexp, "");
            //text=Pattern.compile(regexp).matcher(text).replaceAll("");
            
            String titular=entI.skip("[\r\n]*").nextLine().toUpperCase().replace(" ", "");
            String ocult=entI.skip("[\r\n]*").nextLine().toUpperCase().replace(" ", "");
            if(titular.isEmpty() || ocult.isEmpty() ||ocult.length()>titular.length()){
                System.out.println("NO");
                continue;
            }
            //String regexp="[^"+ocult+"]";
            //titular=Pattern.compile(regexp).matcher(titular).replaceAll("");
            int pos=titular.length()-1;
            int i;
            for (i = ocult.length()-1; i >=0 && pos>=0; i--) {
                int nPos=titular.lastIndexOf(ocult.charAt(i), pos);
                if(nPos==-1){ 
                    System.out.println("NO");
                    break;
                }
                pos=nPos-1;
            }
            if(i==-1)System.out.println("SI");
            else if(pos<0) System.out.println("NO");
        }
        entI.close();
    }
    
}
