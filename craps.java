import java.util.Scanner;
public class Craps
	{

		public static void main(String[] args)
			{
				boolean stillPlaying = true;
				int balance = 0;
				int point = 0;
				boolean stillRolling = true;
				int roll;
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello what is your name?");
				String name = userInput.nextLine();
				System.out.println("Hello "+name+" lets play craps!");
				balance = 100;
				while (stillPlaying)
					{
						System.out.println("Your balance is "+balance+" dollars");
						System.out.println("How much do you want to wager?");
						int wager = userInput.nextInt();	
						if(wager > balance)
							{
								System.out.println("Not enough money!");
								System.exit(0);
							}
						else
							{
								
							}
						int dice1 = (int)(Math.random()*6)+1;
						int dice2 = (int)(Math.random()*6)+1;
						int dice12sum = dice1 + dice2;
						System.out.println("you rolled a "+dice1+" and a "+dice2+" for a combined "+dice12sum+"");
						if(dice12sum == 7 || dice12sum == 11)
							{
								System.out.println("You rolled a "+dice12sum+" you Won!");
								balance = balance + wager;
							}
						else if (dice12sum == 2 || dice12sum == 12)
							{
								System.out.println("Sorry you rolled a "+dice12sum+" you lost!");
								balance = balance - wager;
							}
						else
							{
								System.out.println("Your point is "+dice12sum+"");
								System.out.println("press enter to roll.");
								Scanner userInput2 = new Scanner(System.in);
								String again2 = userInput2.nextLine();
								stillRolling = true;
								while (stillRolling)
									{
								
										int dice3 = (int)(Math.random()*6)+1;
										int dice4 = (int)(Math.random()*6)+1;
										int dice34sum = dice3 + dice4;
										System.out.println("You rolled a "+dice3+" and a "+dice4+" for a "+dice34sum+"");
										if (dice34sum == dice12sum)
											{
												System.out.println("Congratulations "+name+" you rolled your point! You win!");
												stillRolling = false;
												balance = balance + wager;
											}
										else if (dice34sum == 7)
											{
												System.out.println("Sorry "+name+" you rolled a 7, you loose!");
												stillRolling =false;
												balance = balance - wager;
											}
										else
											{
										System.out.println("Press enter to roll again.");
										Scanner userInput3 = new Scanner(System.in);
										String again = userInput3.nextLine();
											}
									}
								
							}
						if (balance==0)
							{
								System.out.println("Sorry you ran out of money!");
								stillPlaying = false;
							}
						else 
							{
								System.out.println("Do you want to play again or stop play?");
								System.out.println("1. Stop");
								System.out.println("2. Again");
								Scanner userInput4 = new Scanner(System.in);
								int again2 = userInput4.nextInt();
								if (again2==1)
									{
										stillPlaying = false;
									}
								else if (again2==2)
									{
										stillPlaying = true;
									}
								else 
									{
										
									}	
							}
						
						
					}
				
			}
	}
