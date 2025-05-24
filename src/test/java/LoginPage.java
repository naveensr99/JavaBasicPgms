import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static void main(StringInbuiltFunc[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().fullscreen();
        driver.quit();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        <project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.ecolab</groupId>
	<artifactId>Koerber-Integration-Tests</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>
	<name>Ecolab Koerber Functional Tests</name>
	<url>http://maven.apache.org</url>
	<dependencies>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.16.1</version>
		</dependency>
		<dependency>
			<groupId>tech.grasshopper</groupId>
			<artifactId>extentreports-cucumber6-adapter</artifactId>
			<version>1.2.0</version>
		</dependency>
		<dependency>
			<groupId>com.aventstack</groupId>
			<artifactId>extentreports</artifactId>
			<version>4.1.7</version>
		</dependency>
		<dependency>
			<groupId>org.freemarker</groupId>
			<artifactId>freemarker</artifactId>
			<version>2.3.32</version>
		</dependency>

		<dependency>
			<groupId>com.aventstack</groupId>
			<artifactId>klov-reporter</artifactId>
			<version>5.0.5</version>
		</dependency>
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>6.2.2</version>
		</dependency>
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-jvm-deps</artifactId>
			<version>1.0.6</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-testng</artifactId>
			<version>6.2.0</version>
		</dependency>
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.7.1</version>
		</dependency>
		<dependency>
			<groupId>com.microsoft.sqlserver</groupId>
			<artifactId>mssql-jdbc</artifactId>
			<version>12.8.1.jre11</version>
		</dependency>
		<!-- <dependency> <groupId>net.masterthought</groupId> <artifactId>cucumber-reporting</artifactId> 
			<version>5.3.0</version> </dependency> -->
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi</artifactId>
			<version>5.2.3</version>
		</dependency>
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>5.2.3</version>
		</dependency>
		<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.11.0</version>
		</dependency>
		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>5.6.2</version>
		</dependency>
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>gherkin</artifactId>
			<version>14.0.1</version>
		</dependency>
		<dependency>
			<groupId>org.json</groupId>
			<artifactId>json</artifactId>
			<version>20230227</version>
		</dependency>
		<dependency>
			<groupId>org.apache.pdfbox</groupId>
			<artifactId>pdfbox</artifactId>
			<version>2.0.28</version>
		</dependency>
		<dependency>
			<groupId>javax.xml.bind</groupId>
			<artifactId>jaxb-api</artifactId>
			<version>2.3.1</version>
		</dependency>
		<dependency>
			<groupId>com.google.code.gson</groupId>
			<artifactId>gson</artifactId>
			<version>2.10.1</version>
		</dependency>
		<dependency>
			<groupId>com.jayway.jsonpath</groupId>
			<artifactId>json-path</artifactId>
			<version>2.8.0</version>
		</dependency>
	</dependencies>
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-dependency-plugin</artifactId>
				<version>3.6.1</version>
				<executions>
					<execution>
						<id>unpack</id>
						<phase>package</phase>
						<goals>
							<goal>unpack</goal>
						</goals>
						<configuration>
							<artifactItems>
								<artifactItem>
									<groupId>junit</groupId>
									<artifactId>junit</artifactId>
									<version>3.8.1</version>
									<type>jar</type>
									<overWrite>false</overWrite>
									<outputDirectory>${project.build.directory}/alternateLocation</outputDirectory>
									<destFileName>optional-new-name.jar</destFileName>
									<includes>**/*.class,**/*.xml</includes>
									<excludes>**/*test.class</excludes>
								</artifactItem>
							</artifactItems>
							<includes>**/*.java</includes>
							<excludes>**/*.properties</excludes>
							<outputDirectory>${project.build.directory}/wars</outputDirectory>
							<overWriteReleases>false</overWriteReleases>
							<overWriteSnapshots>true</overWriteSnapshots>
						</configuration>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.13.0</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
					|
					<encoding>UTF-8</encoding>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-resources-plugin</artifactId>
				<version>3.3.1</version>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.5.0</version>
				<configuration>
					<suiteXmlFiles>
						<!-- pass testng.xml files as argument from command line -->
						<suiteXmlFile>${suiteXmlFile}</suiteXmlFile>
					</suiteXmlFiles>
				</configuration>
			</plugin>

		</plugins>
	</build>
</project>
        
        

        
        
        
    }
}
