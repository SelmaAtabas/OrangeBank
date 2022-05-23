# Orange Bank
This is a maven project and is built with Cucumber framework with Gherkin language.

1-Install Intellj Ide 2020.2
2-Install JDK 13.0.2
3- Install plugins Cucumber for Java , Gherkin and Junit
4-Add Dependencies
    Selenium
            <dependency>
                <groupId>org.seleniumhq.selenium</groupId>
                <artifactId>selenium-java</artifactId>
                <version>3.141.59</version>
            </dependency>
            
    WebdriverManager
            <dependency>
                <groupId>io.github.bonigarcia</groupId>
                <artifactId>webdrivermanager</artifactId>
                <version>4.1.0</version>
            </dependency>
     
    Cucumber java 
            <dependency>
                 <groupId>io.cucumber</groupId>
                 <artifactId>cucumber-java</artifactId>
                 <version>5.7.0</version>
             </dependency>
    Junit
            <dependency>
                        <groupId>io.cucumber</groupId>
                        <artifactId>cucumber-junit</artifactId>
                        <version>5.7.0</version>
                        <scope>test</scope>
                    </dependency>
                    <dependency>
                        <groupId>junit</groupId>
                        <artifactId>junit</artifactId>
                        <version>4.13</version>
                        <scope>test</scope>
                    </dependency>
    Cucumber report and html report
            <build>
                    <plugins>
                        <plugin>
                            <groupId>net.masterthought</groupId>
                            <artifactId>maven-cucumber-reporting</artifactId>
                            <version>5.0.0</version>
                            <executions>
                                <execution>
                                    <id>execution</id>
                                    <phase>verify</phase>
                                    <goals>
                                        <goal>generate</goal>
                                    </goals>
                                    <configuration>
                                        <projectName>Cucumber HTML Reports</projectName>
                                        <outputDirectory>${project.build.directory}</outputDirectory>
                                        <inputDirectory>${project.build.directory}</inputDirectory>
                                        <jsonFiles>
                                            <param>**/cucumber*.json</param>
                                        </jsonFiles>
                                    </configuration>
                                </execution>
                            </executions>
                        </plugin>
                    </plugins>
            
                </build>

About Test Steps
- Open google.es
- Search Orange Bank
     - More than 100,000 results [OK]
     - Less than 10,000 results [NOK]
     
     Test reports under the Target folder.It has also screenshot and attachment.
         