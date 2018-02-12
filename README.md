# wsadmin-groovy

A groovy DSL for Websphere administration, it regroups functionality found in AdminTask and AdminConfig
to configure Websphere Application Servers.

While the original code (up to now) has focused on configuring WebSphere Traditional, the changes on this branch will mainly push towards configuring WebSphere Network Deployment in WAS9.0

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
For feedback on this fork, please use the issue tracker.

The authors of the original project, Revault Sàrl <info@revault.ch>, invite you to give feedback regarding their codebase at <https://github.com/revaultch/wsadmin-groovy>.

Pull requests are welcome!
