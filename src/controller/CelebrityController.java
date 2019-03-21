package controller;

import model.Celebrity;
import java.util.ArrayList;

public class CelebrityController
{
	
	private ArrayList <Celebrity> celebrityList;
	private String currentClue;
	private Celebrity currentCelebrity;
	
	public CelebrityController()
	{
		this.celebrityList = new ArrayList<Celebrity>();
	}

	
	private void start()
	{
		
	}

	private Celebrity currentCelebrity()
	{
		
	}
	
	public String getClue()
	{
		return currentCelebrity.getClue();
	}
	
	public Celebrity getRandomCelebrity()
	{
		int randomIndex = (int)(Math.random() * celebrityList.size());
		currentCelebrity = celebrityList.remove(randomIndex);
		return currentCelebrity;
	}	
	
	public String checkGuess(String guess)
	{
		String response = "";
		if(guess.equalsIgnoreCase(currentCelebrity.getName()))
		{
			response = "You got it!";
			if(celebrityList.size() != 0)
			{
				response += getRandomCelebrity().getClue();
			}
			else
			{
				response += "Game over... You WIN!";
			}
		}
		else
		{
			response = "Sorry, that's not right. Try again." + currentCelebrity.getClue();
		}
		return response;
	}
	
	public boolean checkClue(String clue)
	{
		
	}
	
	public void addCelebrity(String name, String clue, String type)
	{
		Celebrity toBeAdded = new Celebrity(name, clue);
		celebrityList.add(toBeAdded);
	}

	
	public void playGame()
	{
		
	}
}
