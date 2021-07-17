package assignment;

import java.util.Arrays;
/**
 * This class represents the information a student at a school would store.
 * Their name, transcript, and the number of and results.
 * It also has a constant that defines the maximum length of a transcript.
 * @author rajrathod 17969599
 **/
public class Student 
{
	private String name;
	private static final int MAX_TRANSCRIPT_LENGTH = 20;
	private int nResults;
	private Result[] transcript;
	
	public Student(String name)
	{
		this.name = name;
		this.transcript = new Result[MAX_TRANSCRIPT_LENGTH];
	}
	/**
	 	 * This method allows for the results of a student to be appended to their transcript.
	 	 * @param module 
	 	 * @param grade
	 	 * @author 17969599
	 	 **/
	public void addResultToTranscript(Module module, Grade grade)
	{
		Result resultObj = new Result(module, grade);
		
		if(nResults == transcript.length)
		{
			return;
		}
		else if(nResults < transcript.length)
		{
			transcript[nResults] = resultObj;
			nResults++;
		}
	}
	/**
 	 	 * This method prints out a student's transcript and whether or not the student
 	 	 * meets the requirement for the certification.
 	 	 * @author 17969599
 	 	 **/
	public void printStudentResults()
	{	
		TechnicalSchool tempSchool = new TechnicalSchool();
		String studentsResults = getName() + "'s Transcript:\n";
	
		for(int i = 0; i < getTranscript().length; i++)
		{
			// Concatenating each result of a student to the 'studentResults' String.
			studentsResults += getTranscript()[i].getModule().getCode()+ " " +getTranscript()[i].getGrade()+ "\n";
		}
		// Concatenating the student that is calling the printStudentResults method's certification to the 'studentResults' String.  
		studentsResults += tempSchool.isCertified(Student.this)+ "\n\n";
		System.out.print(studentsResults);
	}
	/**
	 	 * This method retrieves a student's transcript without any null values within the Result array. 
	 	 * @return returns the transcript of the student that is calling the method.
	 	 * @author 17969599
	 	 **/
	public Result[] getTranscript()
	{
		Result[] tempTranscript = new Result[nResults];
		
		for(int i = 0; i < nResults; i++)
		{
			if(transcript[i] != null)
			{
				tempTranscript[i] = transcript[i];
			}
		}
		// This makes it so that the transcript that is being returned returns no null values.
		Student.this.transcript = tempTranscript;
		return Student.this.transcript;
	}
	
	public int getNResults() 
	{
		return nResults;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setTranscript(Result[] transcript) 
	{
		this.transcript = transcript;
	}
	
	public void setNResults(int nResults) 
	{
		this.nResults = nResults;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String toString() 
	{
		return "Name: " +name+ ", number of results: " +nResults+ ", transcript: " +Arrays.toString(transcript);
	}
}
