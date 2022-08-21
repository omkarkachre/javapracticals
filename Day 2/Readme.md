Pillar of OOPS

	- Encapsulation
	- Inheritance
	- Polymorphism
	- Abstraction



	Encapsulation - Data Wrapping / Data hiding
	How do we achieve?
		By using Class

	Constructors in class
	Constructors is a special method used to initialize variables whenever a new object of a class is created;
	In short whenever a object of a class is created, default values can be defined to the variables;


	Deconstructor and Garbage Collector // Homework


	Inheritance - Inheriting one class to another
	How do we achieve?
		By using extend keyword


	There is Super Class and Sub Class:
		Super: The class which will be inherited
		Sub: The class which inherits another class

	There are two keywords which are also important
		this - this keyword is used to say that the variable belongs to same class in which it is used
		this.a = 10;
		super - super keyword is used to say that the variable belongs to super class
		super.a = 10;


	Polymorphism - Same same of function but different parameter 
	How do we achieve?
		By using overriding or overloading

	Overloading - Same class but different functions with same name with different number of parameters
	Overriding - Different Class but same name of the functions. Both the functions can have same number of parameters

	Overloading:
		public static int GetMarks(){

		}

		public static int GetMarks(String Name){


		}


		GetMarks("Omkar");
		GetMarks();


	Overriding:
		class one{
			public static int GetMarks(){

			}
		}
		
		Class two{
			public static int GetMarks(){


			}
		}
		

		Class o = new one();
		Class t = new two();
		t.GetMarks();
		o.GetMarks();


	Abstraction - Data hiding/Data fixing
	How do we achieve?
		By using interfaces
		or using abstract classes or methods
		abstract classes or methods can be achieved by abstract keyword
		interface can be used by implements keyword


	A abstract class can have abstract method and non-abstract method

	
	Exercise:
	
	Human - Interface
		Walk
		Watch
		Run
		Dance

	Male - Abstract Class
		Inherit the Human interface

		non abstract methods
		Driving
		Swimming 


	Student - Class
		Inherit the Male Class

		Create the Object

	
