<!---
-->

## momomo.com.platform.db.base.jpa.session.with.postgres

###### Provides the postgres related implementations towards our database related repositories 

#### Dependencies 
* [`momomo.com.platform.Core`](https://github.com/momomo/momomo.com.platform.Core) 
* [`momomo.com.platform.Lambda`](https://github.com/momomo/momomo.com.platform.Lambda)
* [`momomo.com.platform.db.base`](https://github.com/momomo/momomo.com.platform.db.base)
* [`momomo.com.platform.db.base.jpa`](https://github.com/momomo/momomo.com.platform.db.base.jpa)
* [`momomo.com.platform.db.base.jpa.session`](https://github.com/momomo/momomo.com.platform.db.base.jpa.session)
* ```
   <artifactId>postgresql</artifactId>  ... <version>42.2.19</version>
   ```

#### Used by
   * *Your own application*   
   We provided an *example app* [`momomo.com.example.app.Crypto`](https://github.com/momomo/momomo.com.example.app.Crypto)   
   that right now mostly demonstrates and provide a **fully working setup** with a working `static void main` as well as containing a bunch of examples on  
    how we can use and configure the `sessionFactory` easily, **setup** your database, and **jpa entities** as well as bunch of examples on how to use the `$Transactional` **API**:    
       * [`momomo.com.platform.db.transactional`](https://github.com/momomo/momomo.com.platform.db.transactional)
       * [`momomo.com.platform.db.transactional.Hibernate`](https://github.com/momomo/momomo.com.platform.db.transactional.Hiberante)     
       * [`momomo.com.platform.db.transactional.Spring`](https://github.com/momomo/momomo.com.platform.db.transactional.Spring)
    
##### Maven dependencies available on maven central [search.maven.org](https://search.maven.org/search?q=com.momomo)

##### Dependency   
```xml
<dependency>
  <groupId>com.momomo</groupId>
  <artifactId>momomo.com.platform.db.base.jpa.session.with.postgres</artifactId>
  <version>2.1.7</version>
</dependency>                                                      
```                                                                    

##### Repository
```xml
<repository>
    <id>maven-central</id>
    <url>http://repo1.maven.org/maven2</url>
</repository>
```                                                  

### Background

Imports the `postgresql` libraries in the [pom.xml](pom.xml) as well as provides basic implementation in [$DatabasePostgres.java](src/momomo/com/db/$DatabasePostgres.java) for the interface [$Database.java](https://github.com/momomo/momomo.com.platform.db.base/tree/master/src/momomo/com/db/$Database.java) and optional interface [$DatabaseSystemSequences.java](https://github.com/momomo/momomo.com.platform.db.base/tree/master/src/momomo/com/db/$DatabaseSystemSequences.java). 

Basically ready to go.


### Contribute
Send an email to `opensource{at}momomo.com` if you would like to contribute in any way, make changes or otherwise have thoughts and/or ideas on things to improve.
