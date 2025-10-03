# Kotlin Language Learning 📘

Kotlin is **fully compatible with Java**, which means Java code and libraries can be used in Kotlin programs.

---

## 🌍 What Kotlin Can Be Used For
- 📱 Mobile applications (in my case – Android apps)
- 🌐 Web development (optional)
- 💻 Server-side applications (optional)
- 📊 Data science (optional)

Kotlin is **free to use** and easy to learn — especially if you already know Java.  
I chose **IntelliJ IDEA** to support my Kotlin learning.

---

## 📝 Basics (from `Main.kt`)

### Functions
- Declared with the `fun` keyword.
- Can take arguments or be argument-free.

Examples:
```kotlin
fun myFunc(x: Int, y: Int) = x + y
```
or
```kotlin
fun myFunc(x: Int, y: Int): Int {
    return x + y
}
```
- No Semicolon required!

**Output**
- Built-in functions like `println()` print to the screen + new line, `print()` print to the screen.

**Comments**

// Single line comment

/* Multi-line comment */

**Variables**
- `var` - can be changed
- `val` - cannot be changed
- **Uninitialized variable (must declare type)**

**Strings**

- Strings behave like arrays of characters, Index starts at 0.

**Arrays**

- Create arrays with arrayOf()
- You can loop through arrays and ranges

**Conditions**
```kotlin
if (age >= 18) {
    println("Adult")
} else {
    println("Minor")
}
```
**When Expression**

Equivalent to Java’s `switch`
```kotlin
when (x) {
    1 -> println("One")
    2 -> println("Two")
    else -> println("Other")
}
```

**Loops**
- For loop
```kotlin
for (i in 1..5) {
    println(i)
}
```
- While loop:
```kotlin
var x = 0
while (x < 5) {
    println(x)
    x++
}
```
**Loop control:**

`continue` → skip current iteration

`break` → exit loop completely

**Kotlin vs Java**
- You must use conversion functions:
```kotlin
toByte(), toShort(), toInt(), toLong(), 
toFloat(), toDouble(), toChar()
```
---
## 🧩 Object-Oriented Programming (from Classes&Objects.kt)
OOP means writing classes and creating objects from them.
Example:

**Class:** Dog

**Objects:** Labrador, Poodle, Pomeranian , etc..

---
**Classes**

Way 1 – Properties inside body
```kotlin
class Dog {
    var type = ""
    var name = ""
    var age = 0

    fun catchBall() {
        println("$name caught the ball!")
    }
}
```
Way 2 – Primary constructor
```kotlin
class Job(var name: String, var mainTool: String) {
        fun jobNoise() {
            if (mainTool == "CocktailShaker") println("Shik-Shak-Shook")
                else println("Pew-Pew!")
            }
}
```

**Inheritance**

- Parent classes must be marked open.
- Functions must also be open if they should be overridden.
- Child classes use override to change parent behavior.

