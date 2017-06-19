# wsadmin-groovy

A groovy DSL for Websphere administration, it regroups functionality found in AdminTask and AdminConfig
to configure Websphere Application Servers.

## License
The source code in this repository is licensed under [GPLv3](LICENSE.md), Copyright(c) Revault Sàrl <info@revault.ch>

## Build and run
```
$env:WAS_HOME="c:\ibm\websphere\appserver"
$env:WAS_VERSION_MAJOR="9"
$env:WAS_VERSION_MINOR="0"

mvn install
java -jar .\target\wasdmin-groovy-1.0.0-SNAPSHOT.jar sample.groovy
```

## Script development
Include this project into your IDE for script development, you should get completion on all objects


## Feedback
You can find us on @revaultch you can use the issue tracker on this project for bug reports or feature requests.
Pull requests are welcome!


