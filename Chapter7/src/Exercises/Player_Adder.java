package Exercises;
 
public class Player_Adder
{
private int playerAnswer;
private int playerScore;
 
 
public Player_Adder()
{
playerAnswer = 0;
playerScore = 0;
}
 
 
//Constructor
 
 
public void updateScore(int points)
{
playerScore += points;
}
 
public int getScore()
{
return playerScore;
}
 
 
}
