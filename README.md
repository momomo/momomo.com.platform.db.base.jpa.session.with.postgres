<!---
-->

##### Provides the postgres related implementations towards our database related repositories 

##### Dependencies 
* **[`momomo.com.platform.Core`](https://github.com/momomo/momomo.com.platform.Core)** 
* **[`momomo.com.platform.Lambda`](https://github.com/momomo/momomo.com.platform.Lambda)**
* **[`momomo.com.platform.db.base`](https://github.com/momomo/momomo.com.platform.db.base)**
* **[`momomo.com.platform.db.base.jpa`](https://github.com/momomo/momomo.com.platform.db.base.jpa)**
* **[`momomo.com.platform.db.base.jpa.session`](https://github.com/momomo/momomo.com.platform.db.base.jpa.session)**
* `<artifactId>postgresql</artifactId>` `<version>42.2.19</version>`

##### Used by
   * *Your own application*  
     &nbsp;     
   We provided an *example app* [`momomo.com.example.app.Crypto`](https://github.com/momomo/momomo.com.example.app.Crypto)   
   that right now mostly demonstrates and provide a **fully working setup** with a working `static void main` as well as containing a bunch of examples on  
    how we can use and configure the `sessionFactory` easily, **setup** your database, and **jpa entities** as well as bunch of examples on how to use the `$Transactional` **API**:    
       * **[`momomo.com.platform.db.transactional`](https://github.com/momomo/momomo.com.platform.db.transactional)**
       * **[`momomo.com.platform.db.transactional.Hibernate`](https://github.com/momomo/momomo.com.platform.db.transactional.Hiberante)**     
       * **[`momomo.com.platform.db.transactional.Spring`](https://github.com/momomo/momomo.com.platform.db.transactional.Spring)**
    
##### Maven dependencies available on maven central [search.maven.org](https://search.maven.org/search?q=com.momomo)

##### Dependency   
```xml
<dependency>
  <groupId>com.momomo</groupId>
  <artifactId>momomo.com.platform.db.base.jpa.session.with.postgres</artifactId>
  <version>2.1.9</version>
</dependency>                                                      
```                                                                    

##### Repository
```xml
<repository>
    <id>maven-central</id>
    <url>http://repo1.maven.org/maven2</url>
</repository>
```

##### Our significant repositories                          

* **[`momomo.com.platform.Core`](https://github.com/momomo/momomo.com.platform.Core)**  
Is essentially what makes the our the core of several of momomo.com's public releases and contains a bunch of Java utility.

* **[`momomo.com.platform.Lambda`](https://github.com/momomo/momomo.com.platform.Lambda)**  
Contains a bunch of `functional interfaces` similar to `Runnable`, `Supplier`, `Function`, `BiFunction`, `Consumer` `...` and so forth all packed in a easily accessed and understood intuitive pattern that are used plenty in our libraries. **`Lambda.V1E`**, **`Lambda.V2E`**, **`Lambda.R1E`**, **`Lambda.R2E`**, ...

* **[`momomo.com.platform.Return`](https://github.com/momomo/momomo.com.platform.Return)**  
An intuitive library that allows you to return multiple return values with defined types on the fly from any method rather than being limited to the default maximum of one.

* **[`momomo.com.platform.Nanotime`](https://github.com/momomo/momomo.com.platform.Nanotime)**  
Allows for nanosecond time resolution when asking for time from Java Runtime in contrast with `System.currentTimeMillis()`.

* **[`momomo.com.platform.db.transactional.Hibernate`](https://github.com/momomo/momomo.com.platform.db.transactional.Hibernate)**  
A library to execute database command in transactions without having to use annotations based on Hibernate libraries. No Spring!
          
### Background

Imports the `postgresql` libraries in the [pom.xml](pom.xml) as well as provides basic implementation in [$DatabasePostgres.java](src/momomo/com/db/$DatabasePostgres.java) for the interface [$Database.java](https://github.com/momomo/momomo.com.platform.db.base/tree/master/src/momomo/com/db/$Database.java) and optional interface [$DatabaseSystemSequences.java](https://github.com/momomo/momomo.com.platform.db.base/tree/master/src/momomo/com/db/$DatabaseSystemSequences.java). 

Basically ready to go.


### Contribute
Send an email to `opensource{at}momomo.com` if you would like to contribute in any way, make changes or otherwise have thoughts and/or ideas on things to improve.
