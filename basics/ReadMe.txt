What is Thread-Safety and What are different approaches to achieve it?: https://www.baeldung.com/java-thread-safety
How to make a classes thread safe?
What is a race condition? How will you detect and solve race condition? 
How do you share data between two thread in Java? 
Synchronized block vs. Synchronized method
What is a volatile variable? How is it different from the synchronized keyword in Java?
What is the difference between the volatile and atomic variable in Java?
What is Happens-Before Guarantee in multithreading?
What is ThreadLocal variable in Java? 
What is Deadlock. How to detect and resolve deadlock in Java? 
Explicit Locks vs Implicit Locks
    The difference is that explicit locks offer additional features. The main advantages or improvements over implicit synchronization are: Separation of locks by read or write. Some locks allow concurrent access to a shared resource (ReadWriteLock)

What is the advantage of the new Lock interface over a synchronized block in Java? 
What is ReentrantLock in Java? 
Difference between ReentrantLock and synchronized keyword in Java? 
What is ReadWriteLock in Java?  
What is the use of Future interface?
    https://stackabuse.com/guide-to-the-future-interface-in-java/#:~:text=The%20Future%20interface%20is%20an,cover%20in%20the%20upcoming%20sections.&text=The%20get()%20method%20retrieves%20the%20result.

Difference between synchronized collection and concurrent collection? 

Difference between the Runnable and Callable interfaces? How are they used? 

What is Thread Priority? What are different thread priorities available in java?
    java.lang.Thread.MIN_PRIORITY  = 1
    java.lang.Thread.NORM_PRIORITY = 5
    java.lang.Thread.MAX_PRIORITY  = 10
    https://docs.oracle.com/javase/7/docs/technotes/guides/vm/thread-priorities.html

How to catch a checked exception thrown inside the run() method and catch in the calling thread?
      Use Callable interface implementation so that an exception can be thrown from it. Use an Executer and the the get() will allow catching the execption and the inner exception will provide more details of what happended (Executers will help here, the factory or util class)
      
What is the difference between calling wait() and sleep() method in Java multi-threading? 
      The major difference is that wait() releases the lock or monitor while sleep() doesn't releases the lock or monitor while waiting. wait() is used for inter-thread communication while sleep() is used to introduce pause on execution, generally.
      
 


What is ExecutorService Framework? 
Difference between Executor and Executors in ExecutorService Framework? 
Difference between Fixed Thread Pool and Cached Thread Pool? 
What is fork/join pool framework. 
What is work-stealing algorithm?  
What are the advantages and disadvantages of fork/join framework? 
How to create Thread Pools in Java? 
What is Semaphore in Java? What problem can be solved using Semaphore? 
What is CountDownLatch? 
What is CyclicBarrier? 
What is the difference between CyclicBarrier and CountDownLatch in Java? 
What is CompletableFuture?
