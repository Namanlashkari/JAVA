# Advance Java/JEE

Banuprakash C

Full Stack Architect,

Co-founder Lucida Technologies Pvt Ltd.,

Corporate Trainer,

Email: banuprakashc@yahoo.co.in

https://www.linkedin.com/in/banu-prakash-50416019/


https://github.com/BanuPrakash/JAVA

===================================

Softwares Required:
1) Java 8+
	https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html

2) Eclipse for JEE  
	https://www.eclipse.org/downloads/packages/release/2021-09/m1/eclipse-ide-enterprise-java-and-web-developers

3) MySQL  [ Prefer on Docker]

Install Docker Desktop

Docker steps:

a) docker pull mysql

b) docker run --name local-mysql –p 3306:3306 -e MYSQL_ROOT_PASSWORD=Welcome123 -d mysql

container name given here is "local-mysql"

For Mac:
docker run -p 3306:3306 -d --name local-mysql -e MYSQL_ROOT_PASSWORD=Welcome123 mysql


c) CONNECT TO A MYSQL RUNNING CONTAINER:

$ docker exec -t -i <container_name> /bin/bash

d) Run MySQL client:

bash terminal> mysql -u "root" -p

mysql> exit

================

* Java Web application development
* Spring Framework and JPA
* Traditional Web application development
* Spring Boot and JPARepository
* RESTful Web services
* Secure

============

Requirements: Java + Eclipse IDE + MySQL

============================

Web application development ==> JEE ==> Java Enterprise Edition

Servlet Container / Servlet engine / Web Container
* Life cycle management of servlets [ server side java code] and other objects like [request / response]
* Mapping of URL to server side code

----------------------------------------------------------------
* Servlet interface
* GenericServlet
* HttpServlet

public class LoginServlet extends HttpServlet {

}

HTTP methods ==> GET, POST, PUT, PATCH, DELETE

GET ==> Address Bar / Hyperlink
POST ==> submit payload / form data

public void service(HttpServletRequest request, HttpServletResponse response) {
	default has a Switch statement
	case(request.getRequestMethod()) {
		case GET:
			doGet(request, response); break;
		case POST:
			doPost(request, response); break;
		..
	}
}

public void doGet(HttpServletRequest request, HttpServletResponse response) {
}


public void doPost(HttpServletRequest request, HttpServletResponse response) {
}

==========================

Jetty / Tomcat are Containers

Apache/ NginX / GlassFish / Jboss / Weblogic / WebSphere ==> load balancers / reverse proxies / 

=================

Deployment Descriptor

web.xml

<servlet>
  <servlet-name>One</servlet-name>
  <servlet-class>com.cisco.prj.web.LoginServlet</servlet-class>
</servlet>

<servlet>
  <servlet-name>Two</servlet-name>
  <servlet-class>com.cisco.prj.web.RegisterServlet</servlet-class>
</servlet>

<servlet-mapping>
	 <servlet-name>One</servlet-name>
	 <url-pattern>/login</url-pattern>
</servlet-mapping>

<servlet-mapping>
	 <servlet-name>Two</servlet-name>
	 <url-pattern>/register</url-pattern>
</servlet-mapping>

==========================

Servlet API version 2.5 ==> Annotation way of decription [ Java 5]

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

}

================================================

Maven is java tool
* Dependency management
Every dependency is identified by :

1) GroupID // organization + project [ swiggy / com.cisco.hathway] ==> com.cisco
2) ArtificatID // module ==> Customer / Product / payment ==> sampleweb
3) version  ==> 1.0.0
4) packaging ==> war

=================


packaging
* jar
==> Java library  / Standalone application
* war
==> Web Archive ==> Engines need "war"
* ear
==> EJB Container ==> Distributed computing Enterpise Archine
* sar
==> SOA

* pom
 ==> Multi module application
 ==> Parent project which internally contains many sub-modules

 ============================================



<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>3.1.0</version>
			<scope>provided</scope>
</dependency>


HttpServlet, HttpServletRequest, HttpServletResponse, ... < == not a part of Java API

By Default when a module is built all dependcny is added to your "jar"/ "war" 

<scope>provided</scope>
use this only for development / compilation
When deployed on server ==> Engine/container provides this dependecny ==> Jetty / Tomcat

========

<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.5.1</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
				</configuration>
</plugin>

==

Configure Servlet engine plugin ==> jetty
<plugin>
				<groupId>org.eclipse.jetty</groupId>
				<artifactId>jetty-maven-plugin</artifactId>
				<version>9.3.7.v20160115</version>
</plugin>

==

War plugin

<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-war-plugin</artifactId>
				<version>2.3</version>
				<configuration>
					<failOnMissingWebXml>false</failOnMissingWebXml>
				</configuration>
			</plugin>

mvn package


========
 
With Eclipse:
Run As ==> Maven build ==> Goals: 
jetty:run


terminal
application$ mvn jetty:run

=========

JDBC ==> integration aPis are provided by database vendors [ MySQL/ Oracle]

Java ==> interfaces; implmentation classes are provided by database vendors

========================

Steps:

--------
1) load driver classes provided by database vendors

Class.forName("com.mysql.cj.jdbc.Driver");

Class.forName("oracle.jdbc.Driver");

2) Establish a database connection
// using factory method

Connection con = DriverManager.getConnection(URL, USER, PWD);

URL is ==> jdbc:mysql://localhost:3306/CISCO_SAMPLE

URL is ==> jdbc:oracle:thin:@198.22.44.11:1521/CISCO_SAMPLE

3) interact with database
3.1) Statement
	use this to send SQL if Statements are same for all users
	select * from products
3.2) PreparedStatement
	SQL is based on IN parameters from client
	select * from accounts where accNo = ?

	select * from users where username = ? and password = ?

	insert into users values (?, ?, ? , ?);
--
3.a) executeUpdate() ==> INSERT, DELETE or UPDATE SQL
     ResultSet executeQuery() ==> SELECT statement

     ResultSet is a cursor to fetched records

    ========

 docker exec -it local-mysql bash

$ mysql -u "root" -p
 Enter Password: Welcome123

mysql> create database CISCO_SAMPLE;

mysql> use CISCO_SAMPLE;

mysql> create table products (id int PRIMARY KEY AUTO_INCREMENT, name varchar(100), price double, quantity int);

mysql> insert into products values (0, 'iPhone 12', 89000.00, 100);

mysql> insert into products values (0, 'Sony Bravia', 129000.00, 100);

==============

Resume @ 2:00

====================================










