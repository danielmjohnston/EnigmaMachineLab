public class Enigma
{
  private Rotor inner, middle, outer;

  Enigma(Rotor in, Rotor mid, Rotor out){
    inner = in;
    middle = mid;
    outer = out;
  }

  /**
  /* This calls rotate on the inner rotor, if it has completed a full revolution
  /*   it will return true and the middle rotor is rotated. If that returns true
  /*   the outer is rotated. */

  public void rotate()
  {
    if(this.inner.rotate()){
      if(this.mid.rotate()){
	this.outer.rotate();
      }
    }
  }

  
