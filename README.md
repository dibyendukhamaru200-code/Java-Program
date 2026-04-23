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

# Java Programs
##2. The Walkie-Talkie
**Topic:** Inter-Thread Communication (wait() and notify())
**Objective:**
Coordinate the execution order of two threads so they take turns.
**Task:**
Create a RadioChannel class with a boolean flag isQuestionTurn = true.
Write a synchronized method askQuestion(String msg). If it's not the question's turn, call wait(). Otherwise, print the message, set the flag to false, and call notify().
Write a synchronized method answerQuestion(String msg). If it's not the answer's turn, call wait(). Otherwise, print the message, set the flag to true, and call notify().
Create two threads: one looping through questions and the other through answers.
**Goal:**
Use wait() and notify() to control execution order between threads.
**Code file:** WalkieTalkieTest.java
