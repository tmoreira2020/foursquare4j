Foursquare4j
==========
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/br.com.thiagomoreira.foursquare/foursquare4j/badge.svg)](https://maven-badges.herokuapp.com/maven-central/br.com.thiagomoreira.foursquare/foursquare4j)

Foursquare4j is a Java/REST client to access the Foursquare API available at [Foursquare's Developer Documentation](https://foursquare.com/api/docs). It was developed based on [Retrofit2](http://square.github.io/retrofit/).

### License

Foursquare4j is licensed under [Apache 2](http://www.apache.org/licenses/LICENSE-2.0) license.

### Getting Started

It's really simple to use the client, first of all you need credentials, e.g. client_id and client_secret that must be requested at [Foursquare Add App](https://foursquare.com/developers/apps)

The second step is create a object of `br.com.thiagomoreira.foursquare.Foursquare` class and  start to invoke its methods. That's it!


```java
import br.com.thiagomoreira.foursquare.Foursquare;
import br.com.thiagomoreira.foursquare.model.Venue;

public static void main(String[] args) {
    String clientId = "...";
    String clientSecret = "...";

    Foursquare foursquare = new Foursquare(clientId, clientSecret);

    Venue venue = foursquare.getVenue("4ef0e7cf7beb5932d5bdeb4e");

    System.out.println(venue.getId());
    System.out.println(venue.getName());
}
```

### Which methods are implemented?

Yep, it is a small list. Can you help me? Look here: [Contributing](#contributing).
* getVenue(String venueId)

### Maven/Gradle

Foursquare4j is available on Maven central, the artifact is as follows:

Maven:

```xml
<dependency>
    <groupId>br.com.thiagomoreira.foursquare</groupId>
    <artifactId>foursquare4j</artifactId>
    <version>1.0.0</version>
</dependency>
```
Gradle:

```groovy
dependencies {
    compile(group: "br.com.thiagomoreira.foursquare", name: "foursquare4j", version: "1.0.0");
}
```
### Support
Foursquare4j tracks [bugs and feature requests](https://github.com/tmoreira2020/foursquare4j/issues) with Github's issue system. Feel free to open your [new ticket](https://github.com/tmoreira2020/foursquare4j/issues/new)!

### Contributing

Foursquare4j is a project based on Maven to improve it you just need to fork the repository, clone it and from the command line invoke

```shell
mvn package
```
After complete your work you can send a pull request to incorporate the modifications.

Enjoy!