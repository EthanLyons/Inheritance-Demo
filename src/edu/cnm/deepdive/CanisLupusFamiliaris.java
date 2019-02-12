package edu.cnm.deepdive;

import java.util.Arrays;

public class CanisLupusFamiliaris extends CanisLupus implements Trainable {

  public CanisLupusFamiliaris() {
    System.out.println("CanisLupisFamiliaris::new");
    getData()[2] = 5;
    System.out.println(Arrays.toString(getData()));
  }
   
  @Override
  public void vocalize() {
    // TODO Auto-generated method stub
    System.out.println("Bark!"); 
  }

  /*
   * (non-Javadoc)
   * @see edu.cnm.deepdive.Canis#toString()
   */
  @Override
  public String toString() {
    return super.toString() + " and I am a good boy";
  }
  
  public static void about()    {
    System.out.println("Look nothing like other guys ");
  }
 
 @Override
 public void perform()  {
   System.out.println("Play fetch");
 }

   
}
