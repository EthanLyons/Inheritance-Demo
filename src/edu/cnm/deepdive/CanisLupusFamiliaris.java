package edu.cnm.deepdive;

public class CanisLupusFamiliaris extends CanisLupus {

  /* (non-Javadoc)
   * @see edu.cnm.deepdive.CanisLupus#vocalize()
   */
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
    return super.toString() + " and I am a good boy.";
  }

   
}
