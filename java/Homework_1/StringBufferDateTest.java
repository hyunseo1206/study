import java.util.Date;

public class StringBufferDateTest 
{
	public static void main (String[] args)
	{
		StringBuffer buf = new StringBuffer();
		
		buf.append("Hello ");
		buf.append("Hyun Seo Choi -- ");
		
		Date date = new Date();
		buf.append(date);
		System.out.println(buf.toString());
	}
}
 