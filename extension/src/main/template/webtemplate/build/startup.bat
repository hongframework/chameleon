set ENV_PATH=.\

if "%OS%" == "Windows_NT" set ENV_PATH=%~dp0%

cd %ENV_PATH%\..
mvn compile -Pdeamon