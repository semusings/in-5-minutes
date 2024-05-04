---
marp: true
theme: your-theme
paginate: true
header: '© Software Engineering Musings - <https://bhuwanupadhyay.dev/> - subscribe us on <https://youtube.com/@semusings>'
---

<style> section { overflow: auto; display: block; width: 100%; height: 100%; } </style>

# Unnamed Classes and Instance Main Methods

**JEP:** https://openjdk.org/jeps/445

- 

---

## Classic Approach

Classic Hello, World! program that is often used as the first program for Java students:

```java
public class HelloWorld { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!");
    }
}
```

In this approach -> too much code, too many concepts, too many constructs 

---

## Mordern Approach

* Allow to lunch instance main methods. Such methods are not static, need not be public, and need not have a String[] parameter. 

```java
class HelloWorld { 
    void main() { 
        System.out.println("Hello, World!");
    }
}
```

```bash
java --source 22 --enable-preview HelloWorldUsingInstanceMethod.java
```

---

## Mordern Approach (contd.)

* Unnamed classes to make the class declaration implicit

```java
void main() {
    System.out.println("Hello World! \nSubscribe us on youtube.com/@semusings");
}
```

---

## Conclusion



---

### References


