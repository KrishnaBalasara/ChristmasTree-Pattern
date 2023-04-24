public class ChristmasTree {
    public static void main(String args[]) {  
        //First layer
        for(int i=1; i<=4; i++)  {  
            //print spaces 
            for(int k=1; k<=5-i+1; k++) {  
                System.out.print(" ");  
            } 
            //prints stars  
            for(int j=1; j<=2*i-1; j++) {  
                System.out.print("*");  
            }  
            System.out.println();  
        }  
        //Second layer  
        for(int i=1; i<=4; i++) {  
            for(int k=1; k<=4-i+1; k++) {  
                System.out.print(" ");  
            }  
            for(int j=1; j<=2*i+1; j++) {  
                System.out.print("*");  
            }  
            System.out.println();  
        }  
        //Third layer 
        for(int i=1; i<=4; i++) {  
            for(int k=1; k<=3-i+1; k++) {  
                System.out.print(" ");  
            }  
            for(int j=1; j<=2*i+3; j++) {  
                System.out.print("*");  
            }  
            System.out.println();  
        }  
        //Forth layer 
        for(int i=1; i<=2; i++) {  
            for(int k=1; k<=5; k++) {  
                System.out.print(" ");  
            }  
            for(int j=1; j<=1; j++) {  
                System.out.print("*");  
            }  
            System.out.println();  
        }  
        System.out.print("  *******");      
    }  
}
