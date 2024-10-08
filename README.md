## Java Entwicklung mit VSC

1. In der `settings.json` des Benutzers das JDK konfigurieren, z.B.:
```json
"java.configuration.runtimes": [
    {"name": "JavaSE-17", "path": "C:\\Program Files\\BellSoft\\LibericaJDK-17", "default": true}
]
```

## Java Entwicklung ohne IDE

1. `javac -version` überprüft, ob ein Java Compiler installiert ist und in welcher Version
1. `javac App.java` kompiliert die Datei `App.java`, d.h. die Datei `App.class` wird erzeugt
1. `java -version` überprüft, ob eine Java Runtime (JVM) installiert und in welcher Version
1. `java App` führt die vorhin erzeugte `App.class` Datei aus

### Mögliche Fehler

1. `App.java` Datei wird geändert aber nicht erneut kompiliert, so dass die alte `App.class`
    Datei ausgeführt wird.
1. `App.java` Datei wird geändert aber nicht gespeichert und der alte Zustand der Datei wird
    kompiliert, was zu keiner Änderung in der `App.class` Datei führt.

## GitHub Codespaces

Für die Konfiguration, siehe die `.devcontainer/docker-compose.yml` Datei und folgende Dokumentation
https://containers.dev/guide/dockerfile.
