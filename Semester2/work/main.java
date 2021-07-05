import javax.swing.JOptionPane;

class Main {

   public static double getLength() {
     return Double.parseDouble( JOptionPane.showInputDialog( "Please enter the length of the rectangle" ) );
   }  
    
    public static double getWidth() {
     return Double.parseDouble( JOptionPane.showInputDialog( "Please enter the width of the rectangle" ) );    
   }   
  
  
   public static double getArea( double lengthGiven, double widthGiven ){
       return ( lengthGiven * widthGiven );
   }

   public static void displayData( double lengthGiven, double widthGiven, double areaGiven ) {
     
     JOptionPane.showMessageDialog( null, "A rectangle with length" + lengthGiven + " and width" + widthGiven + "has a area of" + areaGiven );

   }
   
  public static void main ( String [ ] args) {
      double userLength = getLength();
      double userWidth = getWidth();
      displayData(userLength , userWidth, getArea( userLength, userWidth ) );
  }
}
