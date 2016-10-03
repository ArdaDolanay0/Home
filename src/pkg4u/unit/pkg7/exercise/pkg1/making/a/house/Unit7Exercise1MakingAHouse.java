/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg4u.unit.pkg7.exercise.pkg1.making.a.house;

/**
 *
 * @author ardol7945
 */
public class Unit7Exercise1MakingAHouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String roof = addRoof();
      String base = addBase();
      System.out.println(roof);
        // TODO code application logic here
    }
    
    

   public static String addRoof(){
       String roof1 = ("/");
       String roof2 = ("\\");
       String space = (""), defultspace = ("    ");
       String rooft, rooftt = "";
       for(int i = 1; i<=4; i++){
           rooft = roof1+space+roof2;
           rooftt =rooftt+"\n"+defultspace+rooft;
           space = space+"  ";
           defultspace = defultspace.substring(0, defultspace.length() - 1);;
           
       }
       return rooftt;
           
   }
   
   public static String addBase(){
       
   }
    
}
