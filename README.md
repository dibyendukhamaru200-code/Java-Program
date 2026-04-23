# Java Programs

## 1. Bakery Factory (Producer-Consumer Problem)

**Topic:** Advanced Inter-Thread Communication (Bounded Buffer)

**Objective:**  
Solve the classic Producer-Consumer problem using a shared buffer limit.

**Task:**  
1. Create a Bakery class with an ArrayList<String> representing a tray, and a MAX_CAPACITY = 5.  
2. Producer Method (bakeBread): Loop infinitely. If the tray is full (size == 5), call wait(). Otherwise, add a "Loaf" to the tray, print the current tray size, and call notifyAll().  
3. Consumer Method (buyBread): Loop infinitely. If the tray is empty (size == 0), call wait(). Otherwise, remove a "Loaf", print the remaining size, and call notifyAll().  
4. Start a Baker thread and a Customer thread.

**Goal:**  
Use while loop to check conditions before calling wait(), and use notifyAll() to wake up waiting threads.

**Code file:** Bakery.java
[👉 Click here to view code](Bakery.java)

## 2. Walkie-Talkie (Inter-Thread Communication)

**Topic:** Inter-Thread Communication (wait() and notify())

**Objective:**  
Coordinate the execution order of two threads so they take turns.

**Task:**  
1. Create a shared class RadioChannel with a boolean flag isQuestionTurn = true.  
2. Write a synchronized method askQuestion(String msg). If it's not the question's turn, call wait(). Otherwise, print the message, set the flag to false, and call notify().  
3. Write a synchronized method answerQuestion(String msg). If it's not the answer's turn, call wait(). Otherwise, print the message, set the flag to true, and call notify().  
4. Create two threads: one looping through an array of questions, the other through an array of answers.

**Goal:**  
Observe how wait() forces a thread to pause until another thread wakes it using notify().

**Code file:** WalkieTalkie.java  


[👉 Click here to view code](RadioChannel.java)

## 3. Ticket Booking Portal (Synchronized Blocks)

**Topic:** Synchronized Blocks  

**Objective:**  
Learn to optimize performance by locking only the critical sections of code rather than an entire method.

**Task:**  
1. Create a TicketCounter class with availableSeats = 50.  
2. Write a method bookTicket(String name, int seats).  
3. Inside the method, add some non-critical code (e.g., printing "Welcome to the portal, [name]!" and sleeping for 500ms).  
4. Create a synchronized(this) block only around the logic that checks availableSeats and deducts the requested seats.  
5. Spawn multiple threads trying to book seats concurrently.

**Goal:**  
Understand that synchronizing the whole method makes threads wait unnecessarily during the "Welcome" phase. Synchronized blocks improve throughput while maintaining thread safety.

**Code file:** TicketBooking.java  

[👉 Click here to view code](TicketCounter.java)

## 4. Joint Bank Account (Synchronized Method)

**Topic:** The synchronized Keyword (Method Level)  

**Objective:**  
Understand race conditions and how to prevent them using method-level synchronization.

**Task:**  
1. Create a class BankAccount with a private int balance = 1000.  
2. Write a method withdraw(int amount). If the balance is sufficient, simulate a delay using Thread.sleep(100) before subtracting the amount.  
3. Create a thread class FamilyMember that attempts to withdraw $1000.  
4. In main, create two FamilyMember threads sharing the same BankAccount object and start them simultaneously.

**Experiment:**  
Run the code without the synchronized keyword and observe negative balance (race condition). Then add synchronized and observe correct behavior.

**Goal:**  
Prove that threads can interrupt each other in the middle of a method unless a lock is enforced.

**Code file:** BankAccountTest.java  

[👉 Click here to view code](BankAccount.java)

## 5. The Impatient Supervisor (Interrupt Handling)

**Topic:** Interrupting Threads and Exception Handling  

**Objective:**  
Learn how to gracefully stop a thread using interrupt() instead of stop().

**Task:**  
1. Create a thread class DataDownloader that extends Thread.  
2. In run(), simulate a long download using an infinite loop printing "Downloading chunk..." and sleeping for 2 seconds.  
3. In main, start the thread.  
4. After 5 seconds, call interrupt() on it.  

**Catch:**  
Handle InterruptedException and print "Download cancelled by user. Cleaning up resources..." and exit loop.

**Goal:**  
Understand that interrupt() signals a thread to stop safely.

**Code file:** DataDownloader.java  

[👉 Click here to view code](DataDownloader.java)

## 6. Resource Manager (Finally Block)

**Topic:** Ensuring cleanup with finally block  

**Objective:**  
Guarantee execution of cleanup code regardless of errors.

**Task:**  
1. Take user input and calculate average.  
2. Use Scanner(System.in).  
3. Use try-catch for InputMismatchException.  
4. Use finally to print "Scanner resource released" and close scanner.

**Key Concept:**  
finally always executes.

**Code file:** ResourceManager.java  

[👉 Click here to view code](ResourceManager.java)


## 7. Lifecycle Tracker (Thread States)

**Topic:** Thread Lifecycle  

**Objective:**  
Observe thread states like NEW, RUNNABLE, TIMED_WAITING, TERMINATED.

**Task:**  
1. Create TaskRunner (Runnable).  
2. Sleep for 2 seconds in run().  
3. Print thread state at different points.

**Goal:**  
Understand thread lifecycle.

**Code file:** TaskRunnerTest.java  

[👉 Click here to view code](TaskRunner.java)


## 8. Dual Tasker (Basic Thread Creation)

**Topic:** Creating Threads  

**Objective:**  
Run two tasks simultaneously.

**Task:**  
1. NumberPrinter (extends Thread)  
2. LetterPrinter (implements Runnable)  
3. Run both together  

**Key Concept:**  
start() creates new thread.

**Code file:** DualTasker.java  

[👉 Click here to view code](NumberPrinter.java)

## 9. Age Validator (Custom Exception)

**Topic:** throw keyword  

**Objective:**  
Create custom exception.

**Task:**  
1. Create InvalidAgeException  
2. Throw if age < 18  

**Key Concept:**  
throw is used to manually trigger exception.

**Code file:** AgeValidator.java  

[👉 Click here to view code](AgeValidator.java)


## 10. Smart Traffic Light

**Topic:** Threads + Priority + Interrupt  

**Objective:**  
Combine all thread concepts.

**Task:**  
1. Cycle RED, GREEN, YELLOW  
2. Use MAX_PRIORITY  
3. Interrupt after 7 seconds  

**Goal:**  
Understand real-world thread control.

**Code file:** TrafficLight.java  

[👉 Click here to view code](TrafficLight.java)

## 11. Unfair Race (Thread Priority)

**Topic:** Thread Priorities  

**Objective:**  
Observe effect of priority.

**Task:**  
1. Create 3 threads  
2. Assign MIN, NORM, MAX priority  
3. Run and compare counts  

**Goal:**  
Understand priority impact.

**Code file:** CounterThreadTest.java  

[👉 Click here to view code](CounterThread.java)


## 13. Recursive String Explorer

**Topic:** Recursion & String  

**Objective:**  
Use recursion to solve string problems without loops.

**Task:**  
1. Create a class StringProcessor.  
2. Write a recursive method reverseString(String str).  

**Logic:**  
- Base Case: If string is empty or one character, return it.  
- Recursive Step: Take last character + reverse of remaining string.  

**Bonus:**  
Add a recursive method to count vowels.

**Code file:** StringProcessor.java  

[👉 Click here to view code](StringProcessor.java)


## 14. Global Bank Vault (Static Concept)

**Topic:** Static Fields & Methods  

**Objective:**  
Understand how static data is shared across objects.

**Task:**  
1. Create class BankVault.  
2. Define static variable totalVaultBalance.  
3. Create static method deposit(double amount).  

**Requirement:**  
Create multiple objects and show shared balance.

**Key Concept:**  
Static variables are shared across all objects.

**Code file:** BankVault.java  

[👉 Click here to view code](BankVault.java)


## 15. Recursive Matrix Pathfinder

**Topic:** Recursion & Static Methods  

**Objective:**  
Navigate a grid using recursion.

**Task:**  
1. Create class MazeSolver.  
2. Write recursive method findPath(int[][] grid, int row, int col).  

**Logic:**  

- Start from (0,0)  
- Move right or down  
- Mark visited cells  
- Return true if destination reached  

**Code file:** MazeSolver.java  

[👉 Click here to view code](MazeSolver.java)


## 16. Age Validator (Throw & Custom Exceptions)

**Topic:** Using the throw keyword and creating custom exceptions  

**Objective:**  
Learn how to manually trigger an exception when specific business logic is violated.

**Task:**  
1. Create a custom Unchecked Exception class named InvalidAgeException.  
2. Write a class ElectionBooth with a method checkEligibility(int age).  
3. If age < 18, use the throw keyword to trigger the InvalidAgeException with message "Underage voters not allowed."  

**Key Concept:**  
The throw keyword is used to explicitly throw an exception instance from a method or block of code.

**Code file:** AgeValidator.java  

[👉 Click here to view code](InvalidAgeException.java)

## 17. Data Parser (Throws & Checked Exceptions)

**Topic:** Using the throws keyword  

**Objective:**  
Understand how to pass exception handling responsibility to the caller.

**Task:**  
1. Create a class DataProcessor.  
2. Write a method parseData(String input) to convert string to integer.  
3. Do not use try-catch inside this method. Use throws keyword.  
4. In main, call the method with invalid input and handle exception using try-catch.

**Key Concept:**  
throws keyword declares exceptions.

**Code file:** DataParser.java  


[👉 Click here to view code](DataProcessor.java)

## 15. Recursive Factorial (Call-Stack Analysis)

**Topic:** Recursion & StackOverflow Errors  

**Objective:**  
Understand how recursion uses memory and what happens when it fails.

**Task:**  
1. Create a class MathWizard.  
2. Implement a recursive method factorial(int n).  
3. In main method, call factorial(5).  

**Error Experiment:**  
Call factorial(-1) to observe StackOverflowError.

**Analysis:**  
Understand infinite recursion and difference between Stack and Heap memory.

**Goal:**  
Recursion must always have a valid base case.

**Code file:** Factorial.java  

[👉 Click here to view code](MathWizard.java)

## 16. Smart Calculator (Multiple Catch)

**Topic:** Exception Classification & Multiple Catch  

**Objective:**  
Handle different types of errors separately.

**Task:**  
1. Create a Calculator class with divide(int a, int b).  
2. Use try block for division.  

**Implementation:**  
- catch ArithmeticException (division by zero)  
- catch InputMismatchException (wrong input)  
- catch Exception (generic fallback)  

**Goal:**  
Specific exceptions should be handled before general ones.

**Code file:** Calculator.java  

[👉 Click here to view code](Calculator.java)

## 17. Divider App (Try-Catch-Finally)

**Topic:** Exception Handling & finally  

**Objective:**  
Allow program to recover from errors.

**Task:**  
1. Take two integers as input.  
2. Perform division (a / b).  

**Logic:**  
- Use try block  
- Catch ArithmeticException  
- Use finally block to print "Calculation Attempt Finished"  

**Experiment:**  
Enter 0 as divisor.

**Observation:**  
Program does not crash and finally always executes.

**Code file:** Divider.java  

[👉 Click here to view code](DividerApp.java)

## 18. Array & Input Validator

**Topic:** Checked vs Unchecked Exceptions  

**Objective:**  
Understand difference between checked and unchecked exceptions.

**Task:**  
1. Create array of size 3  
2. Take index input from user  

**Unchecked Example:**  
Handle ArrayIndexOutOfBoundsException  

**Checked Example:**  
Use Class.forName("NonExistentClass")  

**Logic:**  
Show difference in compiler handling.

**Goal:**  
Understand checked vs unchecked exception behavior.

**Code file:** Validator.java  

[👉 Click here to view code](Array & Input Validator.java)
