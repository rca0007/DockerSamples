import java.text.DecimalFormat;

public class RunForever {
	
	public static void main(String[] args)
	{
		//purely to ensure that the jdk is present on the Docker container
		DecimalFormat formatter = new DecimalFormat("###"); 
		while(true)
		{
			String hell = "hell";
			String o = "o";
			
			String hello = hell + o;
		}
	}
}
