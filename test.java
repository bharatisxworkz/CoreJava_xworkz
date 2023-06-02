1)Explain java and javac.
Ans- Java is used to run the programs
and Javac is a command used to compile the code, it will convert the source into byte code.

2)Explain JDK, JRE ,JVM.
Ans- JVM(Java Vertual Machine) ,JVM helps to run the program,it performs some tasks whice are 
 	*Loads the code
	*Verifies the code
	*Execute the code
	*provides the runtime environment
      
    JRE(Java Runtime Environment) , JRE is the combination of 
	JVM + Set of Libreries.it will execute the byte code.

    JDK(Java Development Kit) ,JDk is also platform dependent which includes
	JRE + Development Tools(compiler,documentation etc...)




3) Explain class object and signature of class.
Ans-  Object - object is a real world entity.
      Class - Class is a blueprint of the object.

	* Class contains States and Behavior.Behaviors means some tasks to performed.
	* Variables ,data types are known as States in a class whereas Method ,Blocks are known as Behavior of class. 



4)Explain the Method signature.
Ans- Method - Method is a set of statements which is used to perform some tasks or functionality.
	there are two types in methods.
	
	*User-defined method - some methods are used based on requirements.
	Ex- toDrive(), toEat() etc...
	
	*Default method - some methods are already defined by java,those methods called as Default methods.
	 default methods are also known as Standard Librery methods.
	Ex- .equals()



5)What is Java?
Ans- JAVA is a oblect oriented programming language.Now a days maximum of the companies using java programming language only.
	Java is easy to understand and secured.




6)What is Variable? explain its types.
Ans- Variable - Variable is a container which is used to hold/store the data or information.
	there are four types in variables.

	*Local Variables.
	*Static Variables.
	*Instance Variable.
	*Parameter Variable.

	* Local Variables- Variables which are used inside the class and inside the Main method are calles as local variables.
	Ex- class Laptop{
	    public static void main(String args[]){
		int price= 45000; 
		String brans = "HP"; // brand and price are local variables

	*Static Variables- Variables which are used inside the class and outside the main method by using a keyword called static.
	Ex- class Television{
		static long price = 67000;
		static String brand = sony;

	*Instance Variable- Variables which are used inside the class and outside the main method without using static keyword.
	Ex- class Tv{
		string brand = "sony";


7)List 15 Java keywords.
	1.double
	2.static
	3.for
	4.if
	5.break
	6.return
	7.else
	8.continue
	9.int
	10.switch
	11.long
	12.equal
	13.nested
	14.import 
	15.extends

8)What is class variable?
Ans- The variables which are used inside the class and outside the main method are called class variables.
	Ex- static variable and instance variable


9)What is Data type? Explain its types.
Ans- Data type - it is a representation of registered area in a memory.
	there are two types of data types ,which are

	*Primitive data types
	*Non primitive data types

	*Primitive data types- these are the pre defined data types, values are already in java.
	these data types starts with lowercase .they are 

	byte(1 byte)
	short(2 bytes)
	int (4 bytes)
	long(8 bytes)  
	float(4 bytes)
	double(8 bytes)
	char(2 bytes)
	boolean(1 bit)

	Default values of byte ,short,int and long is 0.
	Default value of float and double is 0.0.
	Default value of char is space(_).
	Default value of boolean is false.

	*Non primitive data types- these data types are used defined, size is vary, and all the non primitive data types starts with uppercase only.
	String
	ClassNames
	Default value of all non primitive data type is NULL.

10) List the java features.
	*Simple
	*Secured
	*Platform independent
	*Multithreaded
	*Object oriented
	*open souece

11)List the Java IDE's.
Ans-    Linux
	Intellij IDEA
        
	

11)What is Dot operator"
Ans- Dot operator is used to invoke the method.

12)What is Method overloading ?
Ans- Method overloading - method which are same in classnames but difference in the parameters is called as method overloading.

	
13)Difference between .java file and .class file.
Ans- .java file converts the source code into byte code, then run the program and .class file compile the code and gives the output.	

14)Limitations of array.
Ana-    Array is used to optimize the code.
	Paramaters in array must be in same type , if we use integer type in array,then we must use integer type parameters only.
	We can store multiple data in an array by seperated comma with it. 
	The size of an array is (n-1)
	Array index is always starts with zero(0).
	 