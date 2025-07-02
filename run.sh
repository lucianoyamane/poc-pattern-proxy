#!/bin/bash
set -e

# Limpa a pasta de saída
rm -rf out

# Compila todos os arquivos Java
javac -d out src/main/java/realscenario/**/*.java

# Executa a aplicação principal
java -cp out realscenario.app.ScenarioApp 