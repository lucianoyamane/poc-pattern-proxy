#!/bin/bash
set -e

# Gera o manifest com a Main-Class
cat > manifest.txt <<EOF
Main-Class: realscenario.app.ScenarioApp
EOF

# Cria o JAR
jar --create --file app.jar --manifest manifest.txt -C out .

# Limpa o manifest temporário
rm manifest.txt

echo "Arquivo app.jar gerado com sucesso!" 