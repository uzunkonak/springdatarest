#Spring Data Rest Sample Application with Spring Boot and Mysql

**Sample World Application**

Easily Restify your entities

**Domain classes(Entities) :**

City.java
```java
@Entity
@Table(name = "City")
public class City implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long ID;

    @Column(nullable = false)
    private String Name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Country_Code",referencedColumnName = "Code")
    private Country Country;

    @Column(nullable = false)
    private String District;

    @Column(nullable = false)
    private Long Population;
}
```
Country.java

```java
@Entity
@Table(name = "Country")
@Embeddable
public class Country implements Serializable {
    @Id
    @Column(nullable = false)
    private String Code;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Continent;

    @Column(nullable = false)
    private String Region;

    @Column(nullable = false)
    private Double Surface_Area;

    @Column(nullable = false)
    private Integer Indep_Year;

    @Column(nullable = false)
    private Long Population;

    @Column(nullable = false)
    private Double Life_Expectancy;

    @Column(nullable = false)
    private Double GNP;

    @Column(nullable = false)
    private Double GNP_Old;

    @Column(nullable = false)
    private String Local_Name;

    @Column(nullable = false)
    private String Government_Form;

    @Column(nullable = false)
    private String Head_Of_State;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Capital",referencedColumnName = "ID")
    private City Capital;

    @Column(nullable = false)
    private String Code2;
}
```
**Repository classes :**

CityRepository.java

```java
@RepositoryRestResource(collectionResourceRel = "cities", path = "cities", excerptProjection = CityProjection.class)
public interface CityRepository extends JpaRepository<City, Long> {
}
```

CountryRepository.java

```java
@RepositoryRestResource(collectionResourceRel = "countries", path = "countries", excerptProjection = CountryProjection.class)
public interface CountryRepository extends JpaRepository<Country, String> {
}
```

**Projection classes :**

CityProjection.java

```java
@Projection(types = City.class)
public interface CityProjection {

    Long getID();

    String getName();

    String getDistrict();

    Long getPopulation();
}
```

CountryProjection.java
```java
@Projection(types = Country.class)
public interface CountryProjection{

    String getCode();

    String getName();

    String getContinent();

    String getRegion();

    String getSurface_Area();

    Integer getIndep_Year();

    Long getPopulation();

    Double getLife_Expectancy();

    Double getGNP();

    Double getGNP_Old();

    String getLocal_Name();

    String getGovernment_Form();

    String getHead_Of_State();

    String getCode2();
}
```
**application.properties :**

```key-value
spring.data.rest.base-path=/api
spring.datasource.url=jdbc:mysql://localhost/world
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
```

**How to Run :**
```bash
mvn spring-boot:run
```

Access http://localhost:8080/api via THE HAL Browser

**Spring Data Rest:** http://projects.spring.io/spring-data-rest/

**Spring Boot:** http://projects.spring.io/spring-boot/

**The HAL Browser:** https://github.com/mikekelly/hal-browser




