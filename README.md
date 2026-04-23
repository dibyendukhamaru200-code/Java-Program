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
