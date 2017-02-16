/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamequintomilenio;

import java.io.InputStreamReader;
import java.util.Scanner;

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
            String titular=entI.skip("[\r\n]*").nextLine().toUpperCase().replace(" ", "");
            String ocult=entI.skip("[\r\n]*").nextLine().toUpperCase().replace(" ", "");
            if(titular.isEmpty() || ocult.isEmpty()){
                System.out.println("NO");
                continue;
            }
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
