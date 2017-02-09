public class Rotor
{
  char[] letters = null;
  int rotation;

  public Rotor(String s)
  {
    letters = s.toCharArray();
    rotation = 0;
  }

  public char charAt(int n){
    return 'a';
  }

  public int indexOf(char c){
    return 1;
  }

  public boolean rotate(){
    char last = this.letters[this.letters.length-1]; //gets last letter;
    for(int i=this.letters.length-1; i > 0; i--){
      letters[i] = letters[i-1];
    }
    
    letters [0]= last;
    this.rotation++;
    if(this.rotation == 27){
      this.rotation = 0;
      return true;
    }
    return false;
  }

  public static void main(String[] args)
  {
    Rotor blah = new Rotor("#ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    while(!blah.rotate()){
      for(int i = 0; i < blah.letters.length-1; i++)
	System.out.print(blah.letters[i]);
     
      System.out.println(blah.letters[26]);
    }
  }
}
