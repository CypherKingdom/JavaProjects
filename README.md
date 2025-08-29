# Java Projects Repository

This repository contains comprehensive Java code examples showcasing design patterns implementations, practical applications, and fundamental Java programming concepts. It serves as an educational resource for understanding object-oriented programming principles and software architecture patterns.

## Repository Structure

The repository is organized into the following main sections:

### 🎨 Design Patterns
Located in `src/design_patterns/`, this section includes complete implementations of 20+ design patterns:

- **Creational Patterns**
  - Abstract Factory (Chocolate factory system)
  - Builder (Pizza building system)
  - Factory Method (Chocolate creation)
  - Prototype (Certificate cloning system)
  - Singleton (Game world, Dice implementations)
  - *Exercise implementations*: Banking system with account factories

- **Structural Patterns**
  - Bridge (Shape and color abstraction)
  - Composite (Order and product hierarchies)
  - Decorator (Christmas tree decoration system)
  - **Adapter Pattern** (Weather data conversion)
  - **Proxy Pattern** (Weather service with caching)
  - *Exercise implementations*: Document editor with renderer abstraction

- **Behavioral Patterns**
  - Chain of Responsibility (Customer service escalation)
  - Command (Light control system)
  - Observer (Stock market tracking, Book store notifications)
  - State (Traffic light, game state management)
  - Strategy (Airport transportation, discount systems)
  - Template Method (Online ordering for different product types)

- **Architectural Patterns**
  - **Layered Architecture** (Car rental system with presentation, business, and data layers)
  - **MVC Pattern** (Banking system and car rental examples)
  - **Microservices Architecture** (E-commerce system with catalog, cart, ordering services)

### 💼 Practical Applications
Located in `src/practice/`, featuring real-world implementations:

- **Book Store Management System**
  - Observer pattern for customer notifications
  - Strategy pattern for discount systems (percentage, fixed)
  - Complete inventory management with search functionality

- **Stock Market Tracking Platform**
  - Observer pattern for analyst notifications
  - Abstract Factory for different stock types (Tech, Finance, Energy)
  - Real-time price update system with subscription management

- **Order Management System**
  - Factory Method pattern for order creation (normal vs bulk orders)
  - Strategy pattern for discount implementations
  - Food ordering system with multiple discount strategies

### 📚 Java Fundamentals
Located in `src/java_basics/`, covering core Java programming concepts:

- **Basic Programming** (Chapters 2-4): Classes, objects, methods, string manipulation
- **Object-Oriented Programming** (Chapters 5-6): Inheritance, polymorphism, abstract classes
- **Exception Handling** (Chapter 7): Try-catch blocks, custom exceptions, error management
- **File I/O and Streams** (Chapter 8): File operations, RandomAccessFile, buffered I/O, data streams
- **Collections and Generics** (Chapter 9): TreeMap, TreeSet, iterators, networking concepts

## 🚀 Key Features

### Design Pattern Implementations
- **Complete pattern catalog**: 20+ patterns with practical, real-world examples
- **Interactive demos**: Each pattern includes runnable main classes demonstrating usage
- **Complex combinations**: Some examples combine multiple patterns (e.g., Factory + Strategy)
- **Architectural patterns**: Full layered architecture and MVC implementations

### Real-World Applications
- **Book Store System**: Complete e-commerce backend with inventory, customer management, and notifications
- **Stock Trading Platform**: Real-time market simulation with analyst tracking and price alerts
- **Food Ordering System**: Multi-vendor platform with dynamic pricing and order management

### Educational Value
- **Progressive complexity**: From basic Java concepts to advanced architectural patterns
- **Comprehensive comments**: Code includes detailed explanations and pattern descriptions
- **Practical exercises**: Multiple exercise implementations testing pattern understanding

## 🛠️ Technical Highlights

- **Exception Handling**: Comprehensive error management throughout all systems
- **File Operations**: Advanced file I/O including RandomAccessFile for database simulation
- **Collections Framework**: Extensive use of Java collections with custom comparators
- **Design Principles**: SOLID principles demonstrated through pattern implementations
- **Clean Architecture**: Proper separation of concerns in layered applications

## Getting Started

To run these examples:

1. **Clone this repository**
   ```bash
   git clone https://github.com/CypherKingdom/JavaProjects.git
   ```

2. **Open in an IDE**
   - VS Code with Java Extension Pack
   - IntelliJ IDEA
   - Eclipse IDE

3. **Navigate to specific examples**
   - Design patterns: `src/design_patterns/[pattern_type]/[pattern_name]/`
   - Applications: `src/practice/[application_name]/`
   - Java basics: `src/java_basics/chap[X]/`

4. **Run the main class**
   - Look for `Demo.java`, `Main.java`, or `Client.java` files
   - Each pattern/application includes a runnable example

## 📁 Project Structure

```
src/
├── design_patterns/
│   ├── architectural/
│   │   ├── layers/          # Layered architecture (Car rental)
│   │   ├── microservice/    # Microservices (E-commerce)
│   │   ├── mvcExample1/     # MVC (Banking system)
│   │   └── mvcExample2/     # MVC (Car management)
│   ├── behavioral/
│   │   ├── chainOfResponsibility/  # Customer service escalation
│   │   ├── command/         # Light control system
│   │   ├── observer/        # Newsletter subscription
│   │   ├── state/           # Game state management
│   │   ├── strategy/        # Transportation choices
│   │   └── template/        # Online ordering process
│   ├── creational/
│   │   ├── abstractFactory/ # Chocolate product families
│   │   ├── builder/         # Pizza construction
│   │   ├── factoryMethod/   # Chocolate creation
│   │   ├── prototype/       # Certificate cloning
│   │   └── singleton/       # Game world instance
│   └── structural/
│       ├── bridge/          # Shape and color abstraction
│       ├── composite/       # Order item hierarchies
│       ├── decorator/       # Christmas tree decorations
│       ├── exercise1/       # Weather service (Adapter + Proxy)
│       └── exercise2/       # Document editor (Composite + Bridge)
├── practice/
│   ├── book_store/          # Complete bookstore system
│   ├── order_factory/       # Food ordering platform
│   └── stock/               # Stock market simulation
└── java_basics/
    ├── chap2-4/             # Basic programming concepts
    ├── chap5-6/             # OOP fundamentals
    ├── chap7/               # Exception handling
    ├── chap8/               # File I/O and streams
    └── chap9/               # Collections and networking
```

## 🎯 Learning Path

### Beginner Level
1. Start with `java_basics/chap2/` - Basic classes and objects
2. Progress through `java_basics/chap3-4/` - Control structures and strings
3. Explore simple patterns: `creational/singleton/`, `creational/factoryMethod/`

### Intermediate Level
1. Study OOP concepts in `java_basics/chap5-6/`
2. Learn complex patterns: `structural/composite/`, `behavioral/strategy/`
3. Examine practice applications: `practice/book_store/`

### Advanced Level
1. Master architectural patterns: `architectural/layers/`, `architectural/mvcExample1/`
2. Study complex systems: `practice/stock/`, `practice/order_factory/`
3. Understand pattern combinations in exercise implementations

## Dependency Management

This project uses standard Java libraries and doesn't require external dependencies. All examples are compatible with Java 8+.

---

**Note**: This repository is designed for educational purposes and demonstrates various software engineering concepts through practical implementations. Each pattern and application includes working examples that can be executed and modified for learning purposes.
