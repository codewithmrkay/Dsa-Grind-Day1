# DSA Grind Day 1: Exploring Core Concepts 🚀

Welcome to Day 1 of my Data Structures and Algorithms (DSA) grind! Here, I'll be documenting and explaining the fundamental concepts I'm learning, along with simple, clear code examples.

---

## Table of Contents 📖

* [1. List in Java](#List-in-java)
* [2. Eg in Java](#Example)

---

## List in Java ☕

### What is a List?

A **`List`** in Java is an **ordered collection** of elements that is **dynamic in size**. Think of it as a super-flexible container that remembers the order you put things in. Unlike fixed-size arrays, a `List` can automatically grow or shrink as you add or remove items, making it incredibly convenient for managing collections where the number of elements might change. It also happily allows **duplicate elements**.

Crucially, `List` is an **interface**. This means it defines a set of behaviors (like `add()`, `remove()`, `get()`, `size()`) that different "flavors" of lists, such as `ArrayList` or `LinkedList`, must implement.

### Why use a List instead of an Array?

While both store ordered elements, the `List` shines because of its **dynamic nature**. You don't need to manually resize it, and it comes with many built-in methods that simplify common operations like adding, removing, or checking for elements.

## Example

### Simple Example: `ArrayList` with Integers

Here's an example using `ArrayList`, a common implementation of the `List` interface, to store `Integer` values.

```java
import java.util.ArrayList; // Don't forget to import ArrayList
import java.util.List;    // It's good practice to refer to it as the List interface

public class SimpleArrayListExample {

    public static void main(String[] args) {
        // 1. Creating a List
        // We declare it as a List interface type, but instantiate it as an ArrayList
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Initial List: " + numbers); // Output: Initial List: []

        // 2. Adding elements to the List
        numbers.add(10);    // Adds 10 at index 0
        numbers.add(20);    // Adds 20 at index 1
        numbers.add(5);     // Adds 5 at index 2
        numbers.add(20);    // Adds another 20 (duplicates are allowed!) at index 3
        System.out.println("After adding elements: " + numbers); // Output: After adding elements: [10, 20, 5, 20]

        // 3. Getting an element by its index
        int firstElement = numbers.get(0); // Gets the element at index 0
        System.out.println("First element: " + firstElement); // Output: First element: 10

        // 4. Getting the size of the List
        int size = numbers.size();
        System.out.println("Number of elements: " + size); // Output: Number of elements: 4

        // 5. Removing an element
        // You can remove by value (first occurrence) or by index
        numbers.remove(Integer.valueOf(20)); // Removes the first '20' encountered
        System.out.println("After removing first 20: " + numbers); // Output: After removing first 20: [10, 5, 20]

        numbers.remove(0); // Removes the element at index 0 (which is now 10)
        System.out.println("After removing element at index 0: " + numbers); // Output: After removing element at index 0: [5, 20]

        // 6. Checking if the List contains an element
        boolean containsFive = numbers.contains(5);
        System.out.println("Does list contain 5? " + containsFive); // Output: Does list contain 5? true

        // 7. Iterating through the List
        System.out.println("Elements in the list:");
        for (int num : numbers) { // Enhanced for-loop (for-each loop)
            System.out.println("- " + num);
        }
        /* Output:
           Elements in the list:
           - 5
           - 20
        */

        // 8. Clearing the List
        numbers.clear();
        System.out.println("After clearing the list: " + numbers); // Output: After clearing the list: []
        System.out.println("Is list empty? " + numbers.isEmpty()); // Output: Is list empty? true
    }
}
