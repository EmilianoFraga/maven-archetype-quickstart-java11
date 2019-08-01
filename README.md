# maven-archetype-quickstart-java11

This is a Maven quickstart archetype that I use in my pet projects.

As expected, it creates a standard Java 11 Maven enabled project with a quite "complete" pom.xml and directory structure.

```
src/main/resources/archetype-resources
├── pom.xml
└── src
    ├── assembly
    │   └── empty-file.txt
    ├── it
    │   └── empty-file.txt
    ├── main
    │   ├── java
    │   │   └── App.java
    │   └── resources
    │       └── empty-file.txt
    └── test
        ├── java
        │   └── AppTest.java
        └── resources
            └── empty-file.txt
```

## Usage - Installing into local maven repository

After clonning or extracting this project contents, at the project root:

`mvn clean install`

The latest archetype version shall be installed into your maven repository.

_For example, let us say the the installed version is 1.1_

## Usage - Creating a new Java 11 project using this archetype

This guide follows the standard Maven documented instructions already available at [Maven Creating Archetype Guide](https://maven.apache.org/guides/mini/guide-creating-archetypes.html#a4._Install_the_archetype_and_run_the_archetype_plugin).

Anyway, having the archetype installed (see above), one level above the root for your new project, you can type in the command line:

`mvn archetype:generate -DarchetypeGroupId=org.cornputer -DarchetypeArtifactId=quickstart-java11 -DarchetypeVersion=1.1 -DgroupId=YOUR_PROJECT_GROUP_ID -DartifactId=YOUR_ARTIFACT_ID -Dversion=YOUR_ARTIFACT_VERSION`

 _For example, let us say that you are creating a new Java 11 project named "MyProject", starting at 1.0-SNAPSHOT version, under your "projects" directory:_
 
 ```
 cd ~/projects
 mvn archetype:generate -DarchetypeGroupId=org.cornputer -DarchetypeArtifactId=quickstart-java11 -DarchetypeVersion=1.1 -DgroupId=yourgroup -DartifactId=my-project-Dversion=1.0-SNAPSHOT
 ```

_After that, the "My Project" project structure will be created in the `~/projects/my-project` directory_  

