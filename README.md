# Author
## DennisKingsman
# Contents
## Chapter 1 
OOP base, SOLID, ACID, design-patterns  
Pattern types  
Generative patterns are intended for creating instances of classes or objects.  
Structural patterns are designed to organize various classes and objects to form larger structures and provide new functionality.  
Behavioral patterns are designed for effective communication between objects.  
[you-tube-design-patterns-guide](https://www.youtube.com/playlist?list=PLF206E906175C7E07)  
Strategy  
The first rule: you do not need to add methods to super classes that will be useless for at least one child class.  
The second rule: avoid situations that lead to code duplication.  
The essence of the "Strategy"pattern:  
A Strategy is a `behavioral` design pattern that defines a family of similar algorithms and puts each of them in its own class, after which the algorithms can be interchanged right during program execution. These classes can implement an interface that assumes a certain behavior, but use their own unique algorithms for this behavior.  
Negatives: increased number of classes  
Starting with Java 8, many examples of the strategy can be replaced with simple lambda expressions.  
[java-strategy-pattern-java-v8](https://www.baeldung.com/java-strategy-pattern)  
[strategy](https://refactoring.guru/ru/design-patterns/strategy)  
Допустим у нас есть абстракция "Животное", от которой последуют наследники. Животное может уметь летать, а может не летать, поэтому, вместо того чтоб имплементировать поведение и переопределять методы, связанные с полетом, можно создать поле внутри абстракции, которое отвечает за полет, и два класса реализации - "Летающие" и "Нелетающие", которые имплементят контракт поведения. А после, при создании объекта конкретного наследника класса "Животные", подставлять в его поле одну из реализаций, в зависимости от того, летает животное или нет.  
Observer  
The Observer pattern is a `behavioral` design pattern. It allows you to notify a set of objects, so-called Listeners (or Subscribers), about a change in the state of some other Subject (or Publisher) object.  
Nagatives: The Subject (publisher) may send updates that don't matter to the Observer (subscriber).  
The scope in Java that uses the Observer template is the Java Message Service (JMS).  
[java-observer-pattern](https://www.baeldung.com/java-observer-pattern)  
[observer](https://refactoring.guru/ru/design-patterns/observer)  
Допустим у нас есть некий объект, который следит за ценами, он может хранить список Обзерверов и оповещать их когда цена меняется, при этом объект отвечает за одну логику с этими ценами, а обзерверы за другую. Обзерверы в свою очередь хранят в себе реф на объект, за которым они следят. Этот реф передается в конструктор.  
Factory  
A Factory is a design pattern that helps solve the problem of creating different objects depending on certain conditions. (`Generating` pattern.)  
Uses when the method return one of the several possible classes that share a common super class.  
Фабрика создает и возвращает конкретную необходимую в рантайм реализацию, в зависимости от переданных в нее параметров.  
[factory-method](https://refactoring.guru/ru/design-patterns/factory-method)  
Abstract Factory  
It is like the Factory pattern but everything is encapsulated:  
The method that orders the object  
The factories that build the object  
The final object  
The final objects contains objects that use the Strategy Pattern  
It's a factory of factories.  
[habr-abstract-factory](https://habr.com/ru/post/465835/)  
[abstract-factory](https://refactoring.guru/ru/design-patterns/abstract-factory)  
Singleton  
A `generative` pattern that ensures that only one object is created for a certain class, and also provides an access point to this object.  
[javarush-singleton](https://javarush.ru/groups/posts/2365-patternih-proektirovanija-singleton)  
[habr-singleton-vs-staticClass](https://habr.com/ru/post/103681/)  
[singleton](https://refactoring.guru/ru/design-patterns/singleton)  
Builder  
The Builder pattern is a design pattern that allows you to create complex objects in stages using a well-defined sequence of actions.  
The construction is controlled by the managing object (director), who only needs to know the type of the object being created.  
A builder is a `generative` design pattern.  
Директор имеет в себе поле, хранящее ссылку на Строитель. Строитель имеет в себе поле, ссылющееся на объект, который необходимо поэтапно построить. В конструкторе Строителя сразу создается этот объект. После, директор вызовом одного метода принуждает Строитель исполнить поэтапное строительство(инициализацию полей объекта).  Другим методом Директор может вернуть сам построенный объект.  
[builder](https://refactoring.guru/ru/design-patterns/builder)  
Prototype  
A Prototype is a `generative` design pattern that allows you to copy objects without going into the details of their implementation.  
Создание фабрики копий, которая клонирует, создавая новый объект. Объект должен имплементировать Cloneable, реализация клонирования на классе объекта, а не классе фабрики. (по крайней мере в примере)  
[prototype](https://refactoring.guru/ru/design-patterns/prototype)  
Decorater  
A Decorator is a `structural` design pattern that allows you to dynamically add new functionality to objects, wrapping them in useful "wrappers".  
The decorator stores the decorated object in itself and implemets the same behavior.  
A decorator is an abstraction inherited by classes that make changes on top of (decorating) the main class.  
Декоратор хранит в себе декорируемый объект, реализует его поведение, и добавляет функционал работая с ссылкой на хранимый объект.  
[habr-decorator](https://habr.com/ru/post/86255/)  
[decorator](https://refactoring.guru/ru/design-patterns/decorator)  
Command  
A Command is a `behavioral` design pattern that turns requests into objects, allowing you to pass them as arguments when calling methods, queue requests, log them, and support the cancellation of operations.  
[command](https://refactoring.guru/ru/design-patterns/command)  
[habr-command](https://habr.com/ru/post/114455/)  
Команда хранит в себе то, по отношению к чему должна быть применена команда и внутри метода своего исполнения вызывает соответствующее действие объекта. При инициализации устройство является входным параметром в конструкторе Команды. Invoker в свою очередь имеет поле для ссылки на Команду и вызывает эту Команду. Внутри команды есть только методы execute() и undo().  
Adapter  
An Adapter is a `structural` design pattern that allows objects with incompatible interfaces to work together.  
[adapter](https://refactoring.guru/ru/design-patterns/adapter)  
Facade  
A Facade is a `structural` design pattern that provides a simple interface to a complex class system, library, or framework.  
For me it is the same as service layer.  
[facade](https://refactoring.guru/ru/design-patterns/facade)  
Bridge  
A Bridge is a `structural` design pattern that divides one or more classes into two separate hierarchies — abstraction and implementation, allowing them to be changed independently of each other.  
Progressively adding functionality while separating out major differences using abstract classes.  
Допустим у нас есть абстракция в которой несколько методов. У этой абстракции будут свои наследники и поведение их методов может быть как схожим так и различным. Затем появляется необходимость унаследовать все это поведение и добавить новый метод при этом сохранить различие поведения у реализаций старых методов. Если унаследовать класс, то старые методы придется переопределить единым образом или создать еще больше наследников, которые уже будут иметь новую функциональность. Вместо этого можно создать Новую Абстракцию которая методом композиции будет хранить в себе поле типа Старой Абстракции. Передавая в конструктор Новой Абстракции реализацию Старой, мы будет иметь уже готовое переопределенное поведение старых методов. Причем оно будет переопределено нужным образом под переданную реализацию. При этом теперь есть возможность в Новой Абстракции обозначить новые методы. Объект реализации Новой Абстракции будет вынужден при создании в конструктор поместить объект Старой Абстракции. Таким образом он унаследует поведение старых методов, а сама Новая Реализация даст ему необходимое поведение новых методов.  
[bridge](https://refactoring.guru/ru/design-patterns/bridge)  
Template Method  
A Template Method is a `behavioral` design pattern that defines the skeleton of an algorithm, shifting responsibility for some of its steps to subclasses. The pattern allows subclasses to redefine the steps of the algorithm without changing its overall structure.  
В классе Шаблоне есть метод Шаблон в котором вызвана куча войд методов. Так же класс Шаблон содержит кучу методов флагов, которые по дефолту говорят о необходимости вызова того или иного войд метода в шаблоне. Классы наследники Шаблона определят эти методы по своему, и при необходимости они могут выключить флаг необходимости и оставить войд метод пустым.  
[template-method](https://refactoring.guru/ru/design-patterns/template-method)  
Iterator  
An Iterator is a `behavioral` design pattern that makes it possible to consistently bypass the elements of composite objects without revealing their internal representation.  
Создать интерфейс который будет иметь метод возвращающий итератор и реализовывать его.  
[iterator](https://refactoring.guru/ru/design-patterns/iterator)  
Composite  
A Composite is a `structural` design pattern that allows you to group many objects into a tree structure, and then work with it as if it were a single object.  
Создать абстракцию, которая будет являться компонентом дерева. Реализовать абстракцию классом списком(корнем нескольких листьев) и классом листом, который будет храниться в списке. Таким образом один корень сможет хранить в себе другие корни и листы.  
[composite](https://refactoring.guru/ru/design-patterns/composite)  
Flyweight  
Flyweight is a `structural` design pattern that allows you to fit a larger number of objects into the allocated RAM. Lightweight saves memory by sharing the general state of objects among themselves, instead of storing the same data in each object.  
Сохранять созданные объекты если у них уже есть необходимое свойство.  
[flyweight](https://refactoring.guru/ru/design-patterns/flyweight)  
State  
A State is a `behavioral` design pattern that allows objects to change behavior depending on their state. From the outside, it seems that the object class has changed.  
У нас есть интерфейс состояний и несколько классов состояний которые его реализуют. Есть класс, объект которого может прибывать в этих состояниях. Этот класс имеет поля в виде Состояний, а состояния хранят в себе ссылку на объект этого класса. При создании объекта, хранящего в себе свои состояния, он инициализирует состояния в своем конструкторе.  При вызове метода у объекта, эти методы вызываются у состояния объекта, в котором он находится. (так как предполагается, что в разных состояниях будет разное поведение) В свою очередь состояние, при вызове этих методов, храня в себе ссылку на объект главного класса, может при необходимости в этих методах поменять состояние объекта и перевести его в другое состояние. Главный класс, помимо полей - состояний, имеет в себе все те же методы, что и состояния, но не реализовывает интерфейс состояний, а в этих методах просто вызывает тот же метод у своего состояния.  
[state](https://refactoring.guru/ru/design-patterns/state)  
Proxy  
A proxy is a `structural` design pattern that allows you to substitute special proxy objects instead of real objects. These objects intercept calls to the original object, allowing you to do something before or after passing the call to the original.  
Основной класс и прокси реализуют один интерфейс с методами, которые можно выкинуть наружу. При этом основной класс так же реализует методы, доступ к которым давать не безопасно. Тогда при создании прокси будут доступны только безопасные методы. Прокси же внутри себя создает инстанс основного класса.  
Если создать ссылку интерфейса с безопасными методами, то даже инициализировав ее основным классом невозможно будет обратиться к методам, которые не указаны в интерфейсе.  
[proxy](https://refactoring.guru/ru/design-patterns/proxy)  
Chain of Responsibility  
A Chain of Responsibilities is a `behavioral` design pattern that allows you to pass requests sequentially through a chain of handlers. Each subsequent handler decides whether it can process the request itself and whether it is worth passing the request further along the chain.  
Интерфейс цепочка имеет два метода:  
Установить следующий элемент цепочки  
Выполнить действие  
Можно инициализировать цепочку создав первый эл-т и добавить в него след. и т.д. и потом просто вызвать действие у первого, который в случае невозможности выполнения вызовет действие у следующего и т.д.  
Smth like spring security config or securityFilter or webFlux.  
[chain-of-responsibility](https://refactoring.guru/ru/design-patterns/chain-of-responsibility)  
Interpreter  
Interpreter design pattern is one of the `behavioral` design pattern. Interpreter pattern is used to defines a grammatical representation for a language and provides an interpreter to deal with this grammar.  
У нас есть сообщение в которых могут быть выражения и действия с ними. Это выносится в абстракцию а под каждое отдельное выражение создается реализация. И есть сам интерпретатор который парсит целое сообщение на выражение и другие составные части. Это основная часть паттерна, но с помощью рефлексии можно достичь большего. Допустим в сообщении написаны выражения и действия с ними которые совпадают с названиями классов и методов этих классов. Тогда распарсив это выражение можно получать классы и методы по имени.  
[habr-interpreter](https://habr.com/ru/post/136371/)  
[baeldung-interpreter](https://www.baeldung.com/java-interpreter-pattern)  
[springframework.guru-interpreter](https://springframework.guru/gang-of-four-design-patterns/interpreter-pattern/)  
Mediator  
A Mediator is a `behavioral` design pattern that allows you to reduce the connectivity of many classes to each other by moving these connections into one intermediary class.  
Допустим есть два класса которые должны как то взаимодействовать с третьим для своих целей. Можно создать Медиатор, который будет лист из объектов этих двух "коллег" классов и дополнительные объекты третьего. "Коллеги" в свою очередь хранят ссылку на общий Медиатор и выполняют действия с третьим классом через нее.  
[mediator](https://refactoring.guru/ru/design-patterns/mediator)  
[mediator-2](http://cpp-reference.ru/patterns/behavioral-patterns/mediator/)  
Memento  
A Memento is a `behavioral` design pattern that allows you to save and restore the past states of objects without revealing the details of their implementation.  
Есть класс "Моменто" состояния объекта которого надо сохранять. Есть класс который хранит в себе состояния. И есть класс который работает с "Моменто", создает новые и возвращает то что уже есть.  
[memento](https://refactoring.guru/ru/design-patterns/memento)  
Visitor  
A `visitor` is a behavioral design pattern that allows you to add new operations to the program without changing the classes of objects on which these operations can be performed.  
Есть несколько классов которые могут стать "визитуемыми" дополнительным поведением. Вместо того чтобы добавлять это поведение и менять эти классы им следует реализовывать интерфейс "Визитуемый" с одним методом принятия "Визита" в который передается "Визитор" и выполняет в нем метод "Визит".  В этот метод "Визит" передается ссылка на "визитируемый" объект. В свою очередь интерфейс "Визитор" определяет сигнатуру для нескольких разных "визитируемых" классов одно и того же метода "визит". (перегружает этот метод) В свою очередь реализации "Визитора" переопределяют эти методы. Реализаций может быть несколько и все они  могут быть приняты "визитируемым" объектом.  
[visitor](https://refactoring.guru/ru/design-patterns/visitor)  
MVC  
Pattern or idea of three components: model, view and controller.  
[mvc-design-pattern](https://www.geeksforgeeks.org/mvc-design-pattern/)  
[habr-mvc](https://habr.com/ru/post/215605/)  
[mvc-j-rush](https://javarush.ru/groups/posts/2536-chastjh-7-znakomstvo-s-patternom-mvc-model-view-controller)  
## Chapter 2 
Json, xml  
## Chapter 3 
XSD  
## Chapter 4
XSLT, SAX  
## Chapter 5

## Chapter 6
Identification, authorization, authentication, OAth2, OpenID, JWT  
## Chapter 7

## Chapter 8
OSI, TCP\IP  
## Chapter 9 
HTTP, HTTPS, Cookie  
## Chapter 10
SOAP protocol  
## Chapter 11 
REST protocol  
## Chapter 12
RESTfull APi  
## Chapter 13  
SOAP, WSDL  
## Chapter 14

## Chapter 15
OpenAPI \ Swagger 
## Chapter 16 
Java Core  
## Chapter 17
Java Collection 
## Chapter 18
Java 8
## Chapter 19
Java 11
## Chapter 20
Java Reflection Api  
## Chapter 21
MultiThreading 
## Chapter 22 
JDBC EE
## Chapter 23
JMS EE 
## Chapter 24

## Chapter 25
JPA EE
## Chapter 26
Legacy: EJB, JSP, JSF  
Session  
## Chapter 27 
Spring DI\ IoC  
Spring Core
## Chapter 28
Spring AOP  
## Chapter 29 
Spring Boot
## Chapter 30
Spring Async, Scheduler
## Chapter 31
Spring Validation
## Chapter 32
Spring MVC: Controller, RestController, RestTemplate, Session
## Chapter 33
Spring Data, JPA
## Chapter 34
Security, OAuth2
## Chapter 35
Cloud (Config, Discovery, Bus, Streams, Routing, Circuit Breaker, Tracing)
## Chapter 36 
Reactive: WebFlux, Spring Data R2DBC
## Chapter 37

## Chapter 38
Spring Web Services
## Chapter 39
Spring Data Adapters (Redis, MongoDB, Elasticsearch, Solr, Cassandra)
## Chapter 40
Spring Data Reactive Adapters (Redis, MongoDB, Cassandra)
## Chapter 41
Spring Websocket
## Chapter 42

## Chapter 43

## Chapter 44

## Chpater 45

## Chapter 46
LDAP
## Chapter 47

## Chapter 48

## Chapter 49

## Chapter 50
OLTP  
База: SQL, НФ,  
Isolation Level,  
PL/SQL,  
Trigger, Index, Constraint, Foreign Key,  
Partitioning  
## Chapter 51
Oracle  
## Chapter 52 
PostgreSQL: json/jsonb, replication, pgbouncer/pgpool/patroni, Partitioning, ts_vector  
## Chapter 53
MS SQL  
## Chapter 54 
sybase  
## Chapter 55
H2  
## Chapter 56
SQLite  
## Chapter 57
ClickHouse  
## Chapter 58
ElasticSearch  
## Chapter 59
graphDB  
## Chapter 60 
Apache Cassandra/ScyllaDB  
## Chapter 61
Redis  
## Chapter 62
Tarantool  
## Chapter 63
Hazelcast  
## Chapter 64
MCS  
## Chapter 65
Patterns:  
circuit breaker,  
lockAndRead,  
api-gateway,  
data replication,  
configmap-notification  
## Chapter 66
Apache Kafka: broker, streams, strategy  
## Chapter 67

## Chapter 68
 
## Chapter 69
IBM MQ
## Chapter 70
Drivers:  
jUnit4, Jupiter, TestNG  
## Chapter 71
Mockito, Powermock  
## Chapter 72
Assertion: Harmcrest, Assertj  
## Chapter 73 
Testcontainers  
## Chapter 74
Git  
## Chapter 75 

## Chapter 76
 
## Chapter 77
SoapUI/Postman  
## Chapter 78
JMeter  
## Chapter 79
Jira  
## Chapter 80

## Chapter 81
 
## Chapter 82
Отладка:  
jmap,  
jstack,  
jProfiler,  
Memory Analyzer,  
VisualVM  
## Chapter 83
HTML/CSS  
## Chapter 84
 
## Chapter 85
BlockChain, MashineLearning  
## Chapter 86
BPM  
BPMN  
## Chapter 87

## Chapter 88

## Chapter 89

## Chapter 90

## Chapter 91

## Chapter 92

## Chapter 93
Tomcat  
## Chapter 94
Jetty  
## Chapter 95
 
## Chapter 96
Docker  
## Chapter 97
K8S, helm, minikube  
## Chapter 98
OpenShift  
## Chapter 99
JMX  
## Chapter 100
 
## Chapter 101
CI/CD  
GitLab  
## Chapter 102
Jenkins  
## Chapter 103

## Chapter 104
Apache Commons Lang  
## Chapter 105
Guava  
## Chapter 106
Lombok  
## Chapter 107 
itext, apachePOI, jasperReport, PdfConv  
## Chapter 108
Liquibase  
## Chapter 109
Flyway  
## Chapter 110 
Maven  
## Chapter 111
CCCC  
## Chapter 112
Scrum  
## Chapter 113
GitFlow  
## Chapter 114

## Chapter 115

## Chapter 116

## Chapter 110
