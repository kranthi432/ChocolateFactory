# ChocolateFactory
Scenario:

Consider a Chocolate Factory which produces various types of chocolates like milk chocolate, dark chocolate, white chocolate. The consumers can request for the required types of chocolates through the factory. However from the consumer's perspective they are completely unaware of who is creating this object. They just know that the Factory is providing them the required chocolates.

Problem Statement:

It is a standard practice that objects are created by calling the “new” keyword. Imagine a scenario where there are multiple cases in the client class and we call multiple new keywords for creating new objects.

if (selection.equalsIgnoreCase("white")) {
   return new WhiteChocolate();
  } else if (selection.equalsIgnoreCase("dark")) {
   return new DarkChocolate();
  }

If we now have to add organic chocolate or caramel chocolate we have to keep on modifying the client code and further add the new keyword. This creates a dependency on the client code and in turn makes it difficult to maintain.

Another problem is that the client application has to know how many types of concrete classes are available upfront. Later if we have to add another concrete class e.g. organic or semisweet or caramel then client code has to be changed and recompiled.

Input:

Select your chocolate?
1. White
2. Dark
3. Milk
Select your toppings
1. Sugar balls
2. Coconut powder
3. Nuts
4. Choco chips

Output:

Enjoy your <type> chocolate with <topping> 


Solution with below expectations:

Should push to a Github repository regularly
The chocolate factory shall be a library which needs to be imported in the client application
UI is optional. Can run in a CLI
Client application shall exit only on Ctrl + C key input. It need to take input from user any number of times.
Client does not need to know about the subclass of objects which are created.
The client code should be reusable by other clients.
The client code should be scalable by adding more products without making many changes in it.
The code should be maintainable.
