package assignment;
/**
 * This class stores the semester one module offerings and is able to retrieve each module.
 * It also has a method which can check what modules a student has passed.
 * @author rajrathod 17969599
 **/
public class TechnicalSchool 
{
	private Module[] offerings;
	/**
	 	 * This method stores the papers that are offered for semester one in a module array.
	 	 * @return it returns a module array.
	 	 * @author 17969599 
	 	 **/
	private static Module[] semesterOneModuleOfferings()
	{
		Module[] offerings = new Module[13];
		
		offerings[0] = new Module("Programming", "PROG101", Level.ONE, ModuleType.TAUGHT);
		offerings[1] = new Module("Statistics", "STAT102", Level.ONE, ModuleType.TAUGHT);
		offerings[2] = new Module("Database Design", "DATA222", Level.TWO, ModuleType.TAUGHT);
		offerings[3] = new Module("Object-Oriented Programming", "PROG202", Level.TWO, ModuleType.TAUGHT);
		offerings[4] = new Module("Information Systems", "INSY313", Level.THREE, ModuleType.TAUGHT);
		offerings[5] = new Module("Web Services", "WEBS332", Level.THREE, ModuleType.TAUGHT);
		offerings[6] = new Module("Technology Applications", "TECH103", Level.ONE, ModuleType.SELF_STUDY);
		offerings[7] = new Module("Theory of Computation", "THEO111", Level.ONE, ModuleType.SELF_STUDY);
		offerings[8] = new Module("Model Checking", "MODC233", Level.TWO, ModuleType.SELF_STUDY);
		offerings[9] = new Module("Topology", "TOPG233", Level.TWO, ModuleType.SELF_STUDY);
		offerings[10] = new Module("Logic", "LOGI321", Level.THREE, ModuleType.SELF_STUDY);
		offerings[11] = new Module("Web App Dev", "PROJ399", Level.THREE, ModuleType.PROJECT);
		offerings[12] = new Module("Great Code Company", "EXTO396", Level.THREE, ModuleType.CLIENT_PROJECT);
		
		return offerings;
	}
	
	public TechnicalSchool()
	{
		this.offerings = TechnicalSchool.semesterOneModuleOfferings();
	}

	public Module[] getSemesterOfferings() 
	{
		return offerings;
	}
	/**
	 	 * This method searches for the offerings that correspond with the code that is entered.
	 	 * @param code it is the code of a module.
	 	 * @return it returns the offerings module that corresponds with the code that is entered. 
	 	 * @return returns null.
	 	 * @author 17969599
	 	 **/
	public Module lookup(String code)
	{
		for(Module offeringsArray: offerings)
		{
			if(code.equals(offeringsArray.getCode()))
			{
				return offeringsArray;
			}
		}
		return null;
	}
	/**
	 	 * This method checks whether or not a student meets 4 requirements:
	 	 * at least three modules passed at level 1, either taught or self-study AND 
	 	 * at least three modules passed at level 2, more than one must be self-study AND
	 	 * at least four modules passed at level 3, at least two must be taught AND
	 	 * at least one project module passed (either of project or client project).
	 	 * @param student is a Student object. The Student object that is entered as the parameter is the student that will be checked
	 	 * to meet all 4 requirements.
	 	 * @return if the student meets all 4 requirements, it returns true. Else it returns false.
	 	 * @author 17969599
	 	 **/
	public boolean isCertified(Student student)
	{
		int lvlOnePapers = 0, lvlTwoPapers = 0, lvlThreePapers = 0; 
		boolean lvlOnePass = false, lvlTwoPass = false, lvlThreePass = false, projPass = false;
		int selfStudy = 0, taught = 0;
		
		for(int i = 0; i < student.getTranscript().length; i++)
		{
			Level studentsPaperLvl = student.getTranscript()[i].getModule().getLevel();
			ModuleType studentsMT = student.getTranscript()[i].getModule().getType();
			boolean studentsGrade = student.getTranscript()[i].getGrade().isPass();
		
			if((studentsPaperLvl == Level.ONE) && (studentsGrade)) 
			{
				// Counts the amount of level 1 papers that is TAUGHT or SELF_STUDY that a student has passed. 
				lvlOnePapers++; 
				
				if(lvlOnePapers >= 3)
				{
					// Sets true when the student has passed 3 modules at level one, either TAUGHT or SELF_STUDY
					lvlOnePass = true; 
				}
			}
			
			if((studentsPaperLvl == Level.TWO) && (studentsGrade))
			{
				// Counts the amount of level 2 papers a student has passed.
				lvlTwoPapers++; 
				
				if(studentsMT == ModuleType.SELF_STUDY) 
				{
					// Counts the amount of SELF_STUDY papers the student has passed.
					selfStudy++; 
				}
				
				if(lvlTwoPapers >= 3 && selfStudy > 1) 
				{
					// Sets true when the student has at least three modules passed at level 2, and when more than one of the paper's passed is SELF_STUDY
					lvlTwoPass = true;
				}
			}
			
			if((studentsPaperLvl == Level.THREE) && (studentsGrade))
			{
				// Counts the amount of level 3 papers a student has passed.
				lvlThreePapers++; 
				
				if(studentsMT == ModuleType.TAUGHT)
				{
					// Counts the amount of TAUGHT papers the student has passed.
					taught++; 
				}
				
				if(lvlThreePapers >= 4 && taught >= 2) 
				{
					// Sets true whe the student has at least four modules passed at level 3, at least two of the modules were taught
					lvlThreePass = true; 
				}
				
				if(((studentsMT == ModuleType.PROJECT) || (studentsMT == ModuleType.CLIENT_PROJECT)) && (studentsGrade)) 
				{
					// Sets true when the student has passed at least one project module (either PROJECT or CLIENT_PROJECT).
					projPass = true; 
				}
			}
		}
		// Evaluates whether or not  the student has passed all 4 requirements.
		if(lvlOnePass && lvlTwoPass && lvlThreePass && projPass) 
		{
			return true;
		}
		return false;
	}
}