package assignment;
/**
 * This class holds the information a student would need for their results.
 * It stores a Module and Grade attributes.
 * It also has getters and setters to modify this data.
 * @author rajrathod 17969599
 **/
public class Result 
{
	private Module module;
	private Grade grade;
	
	public Result(Module module, Grade grade) 
	{
		this.module = module;
		this.grade = grade;
	}

	public Module getModule() 
	{
		return module;
	}

	public Grade getGrade() 
	{
		return grade;
	}
	
	public void setModule(Module module) 
	{
		this.module = module;
	}

	public void setGrade(Grade grade) 
	{
		this.grade = grade;
	}

	public String toString() 
	{
		return "Result [module = " + module + ", grade = " + grade + "]";
	}
}
