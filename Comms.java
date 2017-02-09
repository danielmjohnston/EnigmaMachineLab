import util.java.*;

public class Comms
{

  private String[] option = new String[5];
  
  option[0] = "#GNUAHOVBIPWCJQXDKRYELSZFMT";
  option[1] = "#EJOTYCHMRWAFKPUZDINSXBGLQV";
  option[2] = "#BDFHJLNPRTVXZACEGIKMOQSUWY";
  option[3] = "#NWDKHGXZVRIFJBLMAOPSCYUTQE";
  option[4] = "#TGOWHLIFMCSZYRVXQABUPEJKND";

  private int input;
  private String[] rotors = new String[3];
  private String action;
  private String[] init = new String[3];
  
  public Comms(Scanner in)
  {
    int argnum = args.length();
    if(argnum != 5)
      {
	System.out.println("Not enough arguments. Try again.");
	System.exit(1);
      }
    for(int i = 0; i < 3; i++)
      {
	input = in.nextInt();
	if(in-1 < 0 || in-1 > 4)
	  {
	    System.out.println("Rotor options are 1-5. Try again.");
	    System.exit(1);
	  }
	rotors[i] = option[input-1];
      }
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Comms check = new Comms(in);
    System.out.println("inner rotor: " + option[in-1] + " with " + init[0] + "on top");
    System.out.println("middle rotor: " + option[mid-1] + " with " + init[1] + "on top");
    System.out.println("outer rotor: " + option[out-1] + " with " + init[2] + "on top");
  }
}
