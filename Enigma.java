public class Enigma
{
  private Rotor inner, middle, outer;

  Enigma(Rotor in, Rotor mid, Rotor out){
    inner = in;
    middle = mid;
    outer = out;
  }

  /**
  /* This takes in a 3 char string to represent the letter that should be at the top of each rotor.
  /* it iterates through each rotor, until the desired letter is at index 0 of the rotor char array
  */
  
  public void intializeRotor(String a){
    while(inner.charAt(0) != a[0]){
      inner.rotate;
    }
    while(middle.charAt(0) != a[1]){
      inner.rotate;
    }
    while(outer.charAt(0) != a[2]){
      inner.rotate;
    }
  }
    

  /**
  /* This calls rotate on the inner rotor, if it has completed a full revolution
  /*   it will return true and the middle rotor is rotated. If that returns true
  /*   the outer is rotated. */

  public void rotate(){
    if(this.inner.rotate()){
      if(this.mid.rotate()){
	this.outer.rotate();
      }
    }
  }

  public b
