# DSA Grind Day 1: Exploring Core Concepts 🚀

Welcome to Day 1 of my Data Structures and Algorithms (DSA) grind! Here, I'll be documenting and explaining the fundamental concepts I'm learning, along with simple, clear code examples.

---

## Table of Contents 📖

* [1. What I Learn 🗿](#What-I-Learned-Today)
* [1. List in Java](#1-List-in-Java)
* [2. How it Works Boi ](#2-Working-Boi)
* [3. List Example](#3-Example)

---
## What-I-Learned-Today🧠

### Building My Own Dynamic Array (aka Mastering `List` & `ArrayList`)

Today i build custome Arrray , I've got the basics down on how to:

* **Create** these dynamic arrays from scratch.
* **Insert** new elements precisely where they're needed.
* **Print/Access** any element by its position.
* **Search** for specific items within the collection.
---

*[See the Main Java Code](https://github.com/codewithmrkay/Dsa-Grind-Day1/Main.java)

---
## 1-List-in-Java☕

### What is a List?

A **`List`** in Java is an **ordered collection** of elements that is **dynamic in size**. `List` can automatically grow or shrink as you add or remove items. It also happily allows **duplicate elements**.
A **`List`** in Java is an **ordered collection** of elements that is **dynamic in size**. `List` can automatically grow or shrink as you add or remove items. It also happily allows **duplicate elements**.

### Why use a List instead of an Array?

While both store ordered elements, the `List` shines because of its **dynamic nature**. You don't need to manually resize it, and it comes with many built-in methods that simplify common operations like adding, removing, or checking for elements.

---
## 2-Working-Boi✨
### How `ArrayList` Grows Dynamically (The Magic Behind the Scenes) 

An `ArrayList` isn't magic, but it *feels* like it because it handles resizing for you! Internally, an `ArrayList` is actually backed by a regular **Java array**.

1.  **Initial Capacity**: When you create an `ArrayList`, it starts with a default initial capacity (usually 10 elements for an `ArrayList<>()`). This means it internally creates an array of size 10.
2.  **Adding Elements**: As you `add()` elements, they are stored in this internal array.
3.  **Resizing**: When the internal array becomes full (i.e., you try to add the 11th element to a list with capacity 10), the `ArrayList` does the following:
    * It creates a **new, larger array** (typically 1.5 times the size of the old array, plus one).
    * It **copies all the existing elements** from the old, full array into this new, larger array.
    * The old, smaller array is then garbage collected.
    * The new element is added to the newly sized array.

---

## 3-Example

---
## 2-Working-Boi✨
### How `ArrayList` Grows Dynamically (The Magic Behind the Scenes) 

An `ArrayList` isn't magic, but it *feels* like it because it handles resizing for you! Internally, an `ArrayList` is actually backed by a regular **Java array**.

1.  **Initial Capacity**: When you create an `ArrayList`, it starts with a default initial capacity (usually 10 elements for an `ArrayList<>()`). This means it internally creates an array of size 10.
2.  **Adding Elements**: As you `add()` elements, they are stored in this internal array.
3.  **Resizing**: When the internal array becomes full (i.e., you try to add the 11th element to a list with capacity 10), the `ArrayList` does the following:
    * It creates a **new, larger array** (typically 1.5 times the size of the old array, plus one).
    * It **copies all the existing elements** from the old, full array into this new, larger array.
    * The old, smaller array is then garbage collected.
    * The new element is added to the newly sized array.

---

## 3-Example

### Simple Example: `ArrayList` with Integers

Here's an example using `ArrayList`, a common implementation of the `List` interface, to store `Integer` values.

```java
```java
import java.util.ArrayList;
import java.util.List;
```java
import java.util.ArrayList;
import java.util.List;

public class CoreArrayListOperations {
public class CoreArrayListOperations {

    public static void main(String[] args) {
        // 1. Creation and Adding Elements
        List<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        System.out.println("Planets: " + planets); // Output: Planets: [Mercury, Venus, Earth]
        // 1. Creation and Adding Elements
        List<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        System.out.println("Planets: " + planets); // Output: Planets: [Mercury, Venus, Earth]

        // 2. Accessing by Index
        String secondPlanet = planets.get(1);
        System.out.println("Second planet: " + secondPlanet); // Output: Second planet: Venus
        // 2. Accessing by Index
        String secondPlanet = planets.get(1);
        System.out.println("Second planet: " + secondPlanet); // Output: Second planet: Venus

        // 3. Getting Size
        int count = planets.size();
        System.out.println("Number of planets: " + count); // Output: Number of planets: 3
        // 3. Getting Size
        int count = planets.size();
        System.out.println("Number of planets: " + count); // Output: Number of planets: 3

        // 4. Removing an Element (by value)
        planets.remove("Venus");
        System.out.println("After removing Venus: " + planets); // Output: After removing Venus: [Mercury, Earth]
        // 4. Removing an Element (by value)
        planets.remove("Venus");
        System.out.println("After removing Venus: " + planets); // Output: After removing Venus: [Mercury, Earth]

        // 5. Iterating
        System.out.println("Remaining planets:");
        for (String planet : planets) {
            System.out.println("- " + planet);
        // 5. Iterating
        System.out.println("Remaining planets:");
        for (String planet : planets) {
            System.out.println("- " + planet);
        }
        /* Output:
           Remaining planets:
           - Mercury
           - Earth
           Remaining planets:
           - Mercury
           - Earth
        */
    }
}
