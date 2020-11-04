package com.ToDo.subbu;
import java.util.*;
public class Main {
	private static Scanner scan= new Scanner (System.in);
	private static ToDoFunction myTodoList= new ToDoFunction();
	

	public static void main(String[] args) {
		int command = 0;
		boolean exit = false;
		printCommand();
		while (!exit) 
		{
			System.out.println("Enter your command/choices:");
			command= scan.nextInt();
			scan.nextLine();
			switch (command) {
			case 0:
				printCommand();
				break;
			case 1:
				myTodoList.printTodoList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				updateItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
			searchItem();
			    break;
			case 6:
				exit= true;
				break;
			default:
				System.out.println("please pick only from given commands");
			}
		}
	}
	public static void printCommand() {
		System.out.println("\n Commands:"+
				"\n Press 0 : To print instructions"+
				"\n Press 1 : To print all list"+
				"\n Press 2 : To add list in Todo"+
				"\n Press 3 : To modify item from Todo"+
				"\n Press 4 : To remove item from Todo"+
				"\n Press 5 : To search an item from Todo"+
				"\n Press 6 : To exit the application");
	}
	public static void addItem() {
		System.out.println("Enter the item to be added in todo list");
		myTodoList.addItem(scan.nextLine());
	}
		public static void updateItem() {
			System.out.println("Enter the item number:");
			int index = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter new item to be added:");
			String myNewItem = scan.nextLine();
			myTodoList.updateTodo(index-1, myNewItem);
		}
		public static void removeItem() {
			System.out.println("Enter the item number to be deleted:");
			int index = scan.nextInt();
			scan.nextLine();
			myTodoList.removeItem(index-1);
		}
		public static void searchItem() {
			System.out.println("Enter the item to be searched");
			String searchItem=scan.nextLine();
			if(myTodoList.findItem(searchItem)== null) {
				System.out.println("Item not found in you TODO list");
			}else {
				System.out.println(searchItem + "was found in your list");
			}
		}
	}
