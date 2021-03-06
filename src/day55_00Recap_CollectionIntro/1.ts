/*
09/16/2021
Topics: OOP Review
		Collection Intro


package name: day55_OOPRecap_CollectionIntro



OOP: design pattern of the applications in organized and modular way

	Encapsulation, Inheritance, Abstraction, Polymorphism

	Encapsulation (POJO): hiding the data by using private.
						  generate public getter/setter instance methods

						 getter (read ONLY)

						 setter (write ONLY)

						 IF PRIVATE DATA IS FINAL, WE CAN NOT GENERATE SETTER


 	Inheritance (TestBase & BasePage) : building parent & child relationships between classes

 						child class: inherits all the variables & methods from parent class

 						parent class: does not inherit anything from child

 				advantages:
 					easy to maintain
 					improves the reusability
 					less codes
 					less memory



	 		abstract TestBase
	 				driver
				setUp (@BeforeEach):
					setup driver
					open the browser
					implicitwait
					maximize browser


				tearDown (@AfterEach):
					quit


			TestClass1 extends TestBase

				@Test (verify the title)
					driver.getTitle


			TestClass2 extends TestBase

			TestClass3 extends TestBase



	Abstraction (TestBase): focus on important things without worrying about the details

				abstract method: method without the body
							meant to be overriden

				2 ways:
					1. abstract class: not concrete ==> no objects, meant to be parent

								class can extends one abstract class

					2. interface: not a class. meant to be implemented

									PUBLIC is the only access modifier we can have

							class can implement multiple interfaces

							can not have:
								instance variables
								instance methods
								constructor
								blocks

							can have:
								final static variable
								abstract method
								static method
								default method



				WebDriver:

						get(URL);

				Interfaces that I have used:
						WebDriver, WebElement, TakeScreenShot, JavaScriptExecuter...
						List


	Polymorphism (WebDriverFactory): behaviors of the objects in many forms



		WebDriverFactory

			WebDriver getDriver(name){
				expect to return:
					1. Chrome
					2. FireFox
					3. Opera
					4. Safari
			}


			WebDriver driver = WebDriverFactory.getDriver(name);
			( (TakeScreenShot)driver ).takeScreenShot();
			( (JavaScriptExecuter)driver ).executerScript();



polymorphism short quiz due by 11:45 am


come back at 2:10 pm



Data Structures: work with data

		Array
		Collection
		Map


Array: size is fixed
	  can be multi-dimensional
	  supports both primitive and non-primitives




Collection framework: consists of multiple interfaces, each interface is implembnted by classes

	Collection (I): Dynamic Sized
					supports non-primitives ONLY

			extended by List, Set, Queue


			List (I): has index numbers, accept duplicates


			Set (I): does not have index, does not accept duplicates


			Queue (I): does not have index, accept duplicates



Remaining topics:
	Collection
	Map
	Enum
	Functional Interface & Lambda
	Stream
 */
