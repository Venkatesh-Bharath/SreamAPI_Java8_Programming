## Stream API
The Stream API in Java 8 provides a modern, functional approach to processing sequences of elements, such as collections. It allows for more concise, readable, and flexible code by using declarative operations.

### Key Concepts

- **Stream:** A sequence of elements supporting sequential and parallel aggregate operations.
- **Intermediate Operations:** Return a new stream and are lazy (e.g., `filter`, `map`, `sorted`).
- **Terminal Operations:** Produce a result or a side effect and terminate the stream (e.g., `forEach`, `collect`, `reduce`).

### Example Usage

#### Creating a Stream
```java
List<String> list = Arrays.asList("apple", "banana", "cherry");
Stream<String> stream = list.stream();
```

#### Intermediate Operations

- **filter:** Filters elements based on a condition.
  ```java
  List<String> filteredList = list.stream()
                                  .filter(s -> s.startsWith("a"))
                                  .collect(Collectors.toList());
  // Output: ["apple"]
  ```

- **map:** Transforms each element.
  ```java
  List<Integer> lengths = list.stream()
                              .map(String::length)
                              .collect(Collectors.toList());
  // Output: [5, 6, 6]
  ```

- **sorted:** Sorts the elements.
  ```java
  List<String> sortedList = list.stream()
                                .sorted()
                                .collect(Collectors.toList());
  // Output: ["apple", "banana", "cherry"]
  ```

#### Terminal Operations

- **forEach:** Performs an action for each element.
  ```java
  list.stream()
      .forEach(System.out::println);
  ```

- **collect:** Accumulates the elements into a collection.
  ```java
  List<String> collectedList = list.stream()
                                   .collect(Collectors.toList());
  ```

- **reduce:** Reduces the elements to a single value.
  ```java
  Optional<String> concatenated = list.stream()
                                      .reduce((s1, s2) -> s1 + ", " + s2);
  // Output: Optional["apple, banana, cherry"]
  ```

### Advanced Example
```java
List<Employee> employees = Arrays.asList(
    new Employee(1, "John", 1000),
    new Employee(2, "Jane", 1500),
    new Employee(3, "Jack", 1200)
);

// Filter, map, and collect
List<String> names = employees.stream()
                              .filter(e -> e.getSalary() > 1100)
                              .map(Employee::getName)
                              .collect(Collectors.toList());
// Output: ["Jane", "Jack"]

// Sum salaries
int totalSalary = employees.stream()
                           .mapToInt(Employee::getSalary)
                           .sum();
// Output: 3700
```

### Benefits

- **Conciseness:** Reduces boilerplate code.
- **Parallelism:** Simplifies parallel processing.
- **Readability:** Enhances readability with a functional approach.

The Stream API is a powerful tool in Java 8 for working with collections in a more functional and declarative manner.
