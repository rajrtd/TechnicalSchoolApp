package assignment;
/**
 * This class represents all the information stored for a paper.
 * It also has getters and setters to modify this data.
 * @author rajrathod 17969599
 **/
public class Module 
{
	private String title;
	private String code;
	private Level level;
	private ModuleType type;
	
	public Module(String title, String code, Level level, ModuleType type) 
	{
		this.title = title;
		this.code = code;
		this.level = level;
		this.type = type;
	}

	public String getTitle() 
	{
		return title;
	}
	
	public String getCode() 
	{
		return code;
	}
	
	public Level getLevel() 
	{
		return level;
	}
	
	public ModuleType getType() 
	{
		return type;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public void setCode(String code) 
	{
		this.code = code;
	}

	public void setLevel(Level level) 
	{
		this.level = level;
	}

	public void setType(ModuleType type) 
	{
		this.type = type;
	}

	public String toString() 
	{
		return "Module [title = " +this.title+ ", code = " +this.code+ ", level = " +this.level+ ", type = " +this.type+ "]";
	}
}
