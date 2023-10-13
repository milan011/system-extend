@echo off
echo.
echo [ÐÅÏ¢] ´ò°üWeb¹¤³Ì£¬Éú³Éwar/jar°üÎÄ¼þ¡£
echo.

%~d0
cd %~dp0

cd ..
call mvn clean package -Dmaven.test.skip=true

pause