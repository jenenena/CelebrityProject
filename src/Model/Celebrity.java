package model;

public class Celebrity
{

	private String name;
	private String gender;
	private int age;
	private String profession;
	
	private String clue;
	
	//-----------------//
	
	public Celebrity(String name, String clue)
	{
		this.name = name;
		this.clue = clue;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getProfession()
	{
		return profession;
	}
	
	public String getClue()
	{
		return clue;
	}
	
}
