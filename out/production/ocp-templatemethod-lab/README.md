# ocp-templatemethod-lab
CSC 309 Lab on the Open-Closed Principle and Template Method Design Pattern

*A software artifact (e.g., module, class, package, component) should be open for extension but closed for modification*

*Apply the template method design pattern to define an extensible skeleton (i.e., template) of an algorithm and allow subclasses to redefine certain steps of the algorithm (that's being open for extension) without changing its structure and without having to change other classes in the design (that's being closed for modification).*

## Overview of this repo

Inside you will find the beginnings of a ground-breaking coffee brewery. Unfortunately in the rush to get features completed the main CoffeeMaker class is starting to turn into a big ball of mud.

You'll start by adding one more feature to it to get it into a right mess, then we'll fix it up good.

There's also an example before and after refactoring placed in separate folders.

## Getting started

1. Fork this repo.
2. Clone your fork to make a local copy.
2. Build it on your favorite IDE.

## Making the situation worse...

### Feature: Making a new type of coffee -- Americano

* **As a** WWII veteran
* **I want** to drink an Americano coffee
* **So that** I can remind the old times during the WWII in Italy when we had to dilute espresso with hot water

Add a new type of coffee to ```CoffeMaker``` that follows this recipe: first, ```boilWater()``` and then ```brewEspresso()``` like the other types of coffee, then ```addIngredients()``` (which in this case it means to add more hot water -- ```System.out.println("Add more hot water")```), and the ```finalTouch()``` is to add sugar and cream (```System.out.println("Add sugar and cream")```).

## ...What's gone wrong?

Even though it is doable to keep adding multiple methods every time you need different types of coffee, it is error-prone, code duplication increases, the class becomes too large, and one day you may not be able to evolve your CoffeeMaker class to another version while you still want to accomodate new types of coffee.

## How to fix it?

*Apply the Open-Closed Principle to make the CoffeeMaker class open for extension and closed for modification by implementing the Template Method design pattern on this design*
