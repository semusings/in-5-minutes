---
marp: true
theme: your-theme
paginate: true
header: '© Software Engineering Musings - <https://bhuwanupadhyay.dev/> - subscribe us on <https://youtube.com/@semusings>'
---

<style> section { overflow: auto; display: block; width: 100%; height: 100%; } </style>

# Unnamed Classes and Instance Main Methods

**JEP-445**

-  Ever found Java's "Hello, World!" program a bit too complex?

- Java's complexity can be daunting for beginners.

- No more unnecessary clutter in simple programs.

---

## Classic Approach

Classic Hello, World! program that is often used as the first program for Java students:

```java
public class HelloWorld { 
    static String greeting = "Hello, World!";

    public static void main(String[] args) {
        System.out.println(String.format(":%s\n:%s\n:%s", HelloWorld.class.getName(), greeting,
                "Subscribe us on youtube.com/@semusings"));        
    }
}
```

```bash
java --source 22 --enable-preview HelloWorld.java
```

In this approach -> too much code, too many concepts, too many constructs 

---

## Mordern Approach

Allow to lunch instance main methods. Such methods are not static, need not be public, and need not have a String[] parameter. 

```java
class HelloWorldUsingInstanceMethod {

    String greeting = "Hello, World!";

    void main() {
        System.out.println(String.format(":%s\n:%s\n:%s", getClass().getName(), greeting,
                "Subscribe us on youtube.com/@semusings"));
    }

}
```

```bash
java --source 22 --enable-preview HelloWorldUsingInstanceMethod.java
```

---

## Mordern Approach (contd.)

Unnamed classes to make the class declaration implicit

```java
String greeting = "Hello, World!";

void main() {
    System.out.println(String.format(":%s\n:%s\n:%s", getClass().getName(), greeting,
            "Subscribe us on youtube.com/@semusings"));
}
```

```bash
java --source 22 --enable-preview HelloWorldUsingUnnamedClass.java
```

---

## Thank You!

> Please feel free to reach out to me if you have any question.
>
> semusings@gmail.com

&nbsp;
&nbsp;
Subscribe us on YouTube <https://youtube.com/@semusings>


---

### References

- <https://openjdk.org/jeps/445>