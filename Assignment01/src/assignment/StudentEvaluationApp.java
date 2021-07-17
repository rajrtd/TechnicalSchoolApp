package assignment;/**
 * This class has transcripts for multiple students and checks
 * whether or not these students are certified.
 * @author rajrathod 17969599
 **/
public class StudentEvaluationApp 
{
	/**
	 	 * This method creates a student object and appends results to their transcript.
	 	 * This is the same for the rest of the methods within this class.
	 	 * @return it returns a student object.
	 	 * @author 17969599
	 	 **/
	public static Student robin()
	{
		Student objRobin = new Student("Robin");
		TechnicalSchool objSchool = new TechnicalSchool();
		
		objRobin.addResultToTranscript(objSchool.lookup("PROG101"), Grade.C);
		objRobin.addResultToTranscript(objSchool.lookup("DATA222"), Grade.C);
		objRobin.addResultToTranscript(objSchool.lookup("INSY313"), Grade.CPLUS);
		objRobin.addResultToTranscript(objSchool.lookup("WEBS332"), Grade.CPLUS);
		objRobin.addResultToTranscript(objSchool.lookup("TECH103"), Grade.CPLUS);
		objRobin.addResultToTranscript(objSchool.lookup("MODC233"), Grade.CMINUS);
		objRobin.addResultToTranscript(objSchool.lookup("TOPG233"), Grade.CMINUS);
		objRobin.addResultToTranscript(objSchool.lookup("PROJ399"), Grade.APLUS);
		
		return objRobin; 
	}
	
	public static Student kate()
	{
		Student objKate = new Student("Kate");
		TechnicalSchool objSchool = new TechnicalSchool();
		
		objKate.addResultToTranscript(objSchool.lookup("PROG101"), Grade.APLUS);
		objKate.addResultToTranscript(objSchool.lookup("STAT102"), Grade.AMINUS);
		objKate.addResultToTranscript(objSchool.lookup("TECH103"), Grade.BPLUS);
		objKate.addResultToTranscript(objSchool.lookup("MODC233"), Grade.A);
		objKate.addResultToTranscript(objSchool.lookup("TOPG233"), Grade.C);
		objKate.addResultToTranscript(objSchool.lookup("DATA222"), Grade.A);
		objKate.addResultToTranscript(objSchool.lookup("INSY313"), Grade.BPLUS);
		objKate.addResultToTranscript(objSchool.lookup("WEBS332"), Grade.AMINUS);
		objKate.addResultToTranscript(objSchool.lookup("PROJ399"), Grade.B);
		objKate.addResultToTranscript(objSchool.lookup("EXTO396"), Grade.B);
		
		return objKate; 
	}
	
	public static Student axel()
	{
		Student objAxel = new Student("Axel");
		TechnicalSchool objSchool = new TechnicalSchool();
		
		objAxel.addResultToTranscript(objSchool.lookup("PROG101"), Grade.BPLUS);
		objAxel.addResultToTranscript(objSchool.lookup("STAT102"), Grade.C);
		objAxel.addResultToTranscript(objSchool.lookup("TECH103"), Grade.A);
		objAxel.addResultToTranscript(objSchool.lookup("MODC233"), Grade.AMINUS);
		objAxel.addResultToTranscript(objSchool.lookup("TOPG233"), Grade.A);
		objAxel.addResultToTranscript(objSchool.lookup("DATA222"), Grade.D);
		objAxel.addResultToTranscript(objSchool.lookup("INSY313"), Grade.B);
		objAxel.addResultToTranscript(objSchool.lookup("WEBS332"), Grade.B);
		objAxel.addResultToTranscript(objSchool.lookup("PROJ399"), Grade.CMINUS);
		objAxel.addResultToTranscript(objSchool.lookup("EXTO396"), Grade.C);
		
		return objAxel; 
	}
	
	public static Student jim()
	{
		Student objJim = new Student("Jim");
		TechnicalSchool objSchool = new TechnicalSchool();
		
		objJim.addResultToTranscript(objSchool.lookup("PROG101"), Grade.A);
		objJim.addResultToTranscript(objSchool.lookup("STAT102"), Grade.BPLUS);
		objJim.addResultToTranscript(objSchool.lookup("DATA222"), Grade.CPLUS);
		objJim.addResultToTranscript(objSchool.lookup("PROG202"), Grade.C);
		objJim.addResultToTranscript(objSchool.lookup("INSY313"), Grade.C);
		objJim.addResultToTranscript(objSchool.lookup("WEBS332"), Grade.CPLUS);
		objJim.addResultToTranscript(objSchool.lookup("TECH103"), Grade.CMINUS);
		objJim.addResultToTranscript(objSchool.lookup("THEO111"), Grade.D);
		objJim.addResultToTranscript(objSchool.lookup("MODC233"), Grade.APLUS);
		objJim.addResultToTranscript(objSchool.lookup("TOPG233"), Grade.A);
		objJim.addResultToTranscript(objSchool.lookup("LOGI321"), Grade.B);
		objJim.addResultToTranscript(objSchool.lookup("PROJ399"), Grade.BMINUS);
		objJim.addResultToTranscript(objSchool.lookup("EXTO396"), Grade.APLUS);
		
		return objJim; 
	}
	
	public static Student ando()
	{
		Student objAndo = new Student("Ando");
		TechnicalSchool objSchool = new TechnicalSchool();
		
		objAndo.addResultToTranscript(objSchool.lookup("STAT102"), Grade.AMINUS);
		objAndo.addResultToTranscript(objSchool.lookup("TECH103"), Grade.B);
		objAndo.addResultToTranscript(objSchool.lookup("PROG101"), Grade.CPLUS);
		objAndo.addResultToTranscript(objSchool.lookup("DATA222"), Grade.AMINUS);
		objAndo.addResultToTranscript(objSchool.lookup("PROG202"), Grade.C);
		objAndo.addResultToTranscript(objSchool.lookup("TOPG233"), Grade.CMINUS);
		objAndo.addResultToTranscript(objSchool.lookup("INSY313"), Grade.BMINUS);
		objAndo.addResultToTranscript(objSchool.lookup("WEBS332"), Grade.BPLUS);
		
		return objAndo;
	}
	
	public static Student riyan()
	{
		Student objRiyan = new Student("Riyan");
		TechnicalSchool autObj = new TechnicalSchool();
		
		objRiyan.addResultToTranscript(autObj.lookup("PROG101"), Grade.A);
		objRiyan.addResultToTranscript(autObj.lookup("STAT102"), Grade.AMINUS);
		objRiyan.addResultToTranscript(autObj.lookup("TECH103"), Grade.BMINUS);
		objRiyan.addResultToTranscript(autObj.lookup("TOPG233"), Grade.BPLUS);
		objRiyan.addResultToTranscript(autObj.lookup("PROG202"), Grade.C);
		objRiyan.addResultToTranscript(autObj.lookup("MODC233"), Grade.CPLUS);
		objRiyan.addResultToTranscript(autObj.lookup("INSY313"), Grade.B);
		objRiyan.addResultToTranscript(autObj.lookup("WEBS332"), Grade.APLUS);
		objRiyan.addResultToTranscript(autObj.lookup("LOGI321"), Grade.C);
		objRiyan.addResultToTranscript(autObj.lookup("EXTO396"), Grade.CPLUS);
		objRiyan.addResultToTranscript(autObj.lookup("LOGI321"), Grade.B);
		
		return objRiyan;
	}
	
	public static Student xemoose()
	{
		Student objXemoose = new Student("Xemoose");
		TechnicalSchool autObj = new TechnicalSchool();
		
		objXemoose.addResultToTranscript(autObj.lookup("PROG101"), Grade.CMINUS);
		objXemoose.addResultToTranscript(autObj.lookup("STAT102"), Grade.BPLUS);
		objXemoose.addResultToTranscript(autObj.lookup("THEO111"), Grade.A);
		objXemoose.addResultToTranscript(autObj.lookup("DATA222"), Grade.AMINUS);
		objXemoose.addResultToTranscript(autObj.lookup("PROG202"), Grade.AMINUS);
		objXemoose.addResultToTranscript(autObj.lookup("TOPG233"), Grade.AMINUS);
		objXemoose.addResultToTranscript(autObj.lookup("LOGI321"), Grade.APLUS);
		
		return objXemoose;
	}	
	
	public static void main(String[] args) 
	{
		robin().printStudentResults();
		kate().printStudentResults();
		axel().printStudentResults();
		jim().printStudentResults();
		ando().printStudentResults();
		riyan().printStudentResults();
		xemoose().printStudentResults();
	}
}
