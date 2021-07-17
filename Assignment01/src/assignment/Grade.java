package assignment;
/**
 * This enumeration stores all the possible grades that a student can receive.
 * Each grade has a maximum and minimum integer value. 
 * It also has a boolean for whether the grade is a passing grade or not.
 * This enum also has a method that can check whether a grade is a passing grade or not.
 * @author rajrathod 17969599
 **/
public enum Grade 
{
	APLUS(100, 90, true), A(89, 85, true), AMINUS(84, 80, true), BPLUS(79, 75, true), B(74, 70, true), 
	BMINUS(69, 65, true), CPLUS(64, 60, true), C(59, 55, true), CMINUS(54, 50, true), D(49, 0, false); 
	private int high;
	private int low;
	private boolean pass;

	private Grade(int max, int min, boolean pass)
	{
		this.high = max;
		this.low = min;
		this.pass = pass;
	}
	
	public String toString() 
	{
		switch(this.name())
		{
		case "APLUS":
			return "A+";
		case "AMINUS":
			return "A-";
		case "BPLUS":
			return "B+";
		case "BMINUS":
			return "B-";
		case "CPLUS":
			return "C+";
		case "CMINUS":
			return "C-";
		}
		return this.name();
	}

	public boolean isPass() 
	{
		if(this.low >= 50)
		{			
			return this.pass;
		}
		return false;
	}

	public int getHigh() 
	{
		return this.high;
	}

	public int getLow() 
	{
		return this.low;
	}
}
