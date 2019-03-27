package model;
import java.util.ArrayList;

public class LiteratureCelebrity
//??
{
	private ArrayList<String> ClueList;
	
	public LiteratureCelebrity(String name, String clue)
	{
		super();
		ClueList = new ArrayList<String>();
		for(String Clue : clue.split(","))
		{
			ClueList.add(clue);
		}
	}
	
	public String getClue()
	{
		if(ClueList.size() > 0)
		{
			return ClueList.remove(0);
		}
		else
		{
			return ("No more clues");
		}
	}

}
