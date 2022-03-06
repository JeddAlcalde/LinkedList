import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class JPanelClass extends JPanel
{
	LinkedListJA myStructure = new LinkedListJA();;
	public JPanelClass()
	{
		Scanner scanInt = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);
		System.out.println("Hello and Welcome to Jedd's LinkedList demo");
		System.out.println("Please Type in your head, for this demo we require it be an int?");
		int myHead = scanInt.nextInt();
		myStructure.addFirst(myHead);
		String response = "";
		int input = 0;
		String output;
		int inputIndex = 0;
		System.out.println("//////////");
		System.out.println("You will be put into a while loop that will only stop if you input STOP");
		System.out.println("Here are some extra options:");
		System.out.println("[AddFirst] adds object to the front of the list)");
		System.out.println("[AddLast] adds object to the end of the list");
		System.out.println("[Clear] clears list");
		System.out.println("[Contains] returns true if the object inputted is in the list");
		System.out.println("[Get] returns the input of the specified index");
		System.out.println("[GetFirst] returns object from the front of the list");
		System.out.println("[GetLast] returns object from the end of the list");
		System.out.println("[IndexOf] returns index with the specified object");
		System.out.println("[Remove] removes object from the specified index");
		System.out.println("[RemoveFirst] removes object from the front of the list");
		System.out.println("[Set] sets specified index to a given object");
		System.out.println("[Size] sets specified index to a given object");
		System.out.println("//////////");

		while(response != "STOP")
		{
			System.out.println("Type in the method you would like to use");
			response = scanStr.nextLine();

			if(response.equals("AddFirst") == true)
			{
				System.out.println("Please input your new object");
				input = scanInt.nextInt();
				myStructure.addFirst(input);
				System.out.println("Your object has been added");
			}

			else if(response.equals("AddLast") == true)
			{
				System.out.println("Please input your new object");
				input = scanInt.nextInt();
				myStructure.addLast(input);
				System.out.println("Your object has been added");
			}

			else if(response.equals("Clear") == true)
			{
				myStructure.clear();
				System.out.println("Your list has been cleared");
			}

			else if(response.equals("Contains") == true)//Not Complete WIP
			{
				System.out.println("Please input your object to search for");
				input = scanInt.nextInt();
				output = Boolean.toString(myStructure.contains(input));
				System.out.println(output);//needs to be implemented first
			}

			else if(response.equals("Get") == true)
			{
				System.out.println("Please input your index which you intend to get");
				input = scanInt.nextInt();
				output = String.valueOf(myStructure.get(input));
				System.out.println(output);
			}
			else if(response.equals("GetFirst") == true)
			{
				output = String.valueOf(myStructure.getFirst());
				System.out.println(output);
			}
			else if(response.equals("GetLast") == true)
			{
				output = String.valueOf(myStructure.getLast());
				System.out.println(output);
			}
			else if(response.equals("IndexOf") == true)//Not Complete
			{
				System.out.println("Please input your object which you will get an index for");
				input = scanInt.nextInt();
				output = String.valueOf(myStructure.indexOf(input));
				System.out.println(output);
			}
			else if(response.equals("Remove") == true)
			{
				System.out.println("Please input your index which you intend to get rid of");
				input = scanInt.nextInt();
				myStructure.remove(input);
				System.out.println("Your object has been removed");
			}
			else if(response.equals("RemoveFirst") == true)
			{
				myStructure.removeFirst();
				System.out.println("Your object has been removed");
			}
			else if(response.equals("Set") == true)//Not Complete
			{
				System.out.println("Please input your index which you intend to get set");
				input = scanInt.nextInt();
				System.out.println("Please input your new object");
				int input2 = scanInt.nextInt();
				//myStructure.set(input, input2);
				System.out.println("Your object has been set");
			}
			else if(response.equals("Size") == true)//Not Complete
			{
				output = String.valueOf(myStructure.size());
				System.out.println("The size of the list is : " + output);
			}
		}

		System.out.println("Thank you User, GOODBYE");
	}
}