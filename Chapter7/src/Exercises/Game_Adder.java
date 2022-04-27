package Exercises;
 
public class Game_Adder
{
private static final int MIN_NUM = 0, MAX_NUM = 20;
//private static int points;
private int answer;
private int attemptsMade;
 
private static final int FIRST_TRY = 5, SECOND_TRY = 3, THIRD_TRY = 1;
 
public void AdderGame()
{
answer = 0;
attemptsMade = 0;
}
 
public String showProblem()
{
int first_op, second_op;
 
first_op = (int)((MAX_NUM - MIN_NUM + 1) * Math.random() + MIN_NUM); //random integer between MIN_NUM and MAX_NUM
second_op = (int)((MAX_NUM - MIN_NUM + 1) * Math.random() + MIN_NUM); //random integer between MIN_NUM and MAX_NUM
 
String problem = first_op + " + " + second_op + " = ";
 
answer = first_op + second_op;
attemptsMade = 0;
return problem;
}
 
 
public int answerProblem(int playerAnswer)
{
attemptsMade += 1;
//if else statements to determine whether to give 1, 3, or 5 points
if (playerAnswer == answer)
{
if (attemptsMade == 1)
{
return(FIRST_TRY);
}
else if (attemptsMade == 2)
{
return(SECOND_TRY);
}
else if (attemptsMade == 3)
{
return(THIRD_TRY);
}
}
return(0);
}
 
public int numAttempts()
{
return(attemptsMade); //show number of attempts
 
}
 
public int getAnswer()
{
return(answer); //displays answer
 
}
}
