@echo off
For /f "tokens=2-4 delims=/ " %%a in ('date /t') do (set mydate=%%c-%%a-%%b)
For /f "tokens=1-2 delims=/:" %%a in ("%TIME%") do (set mytime=%%a%%b)
adb wait-for-device pull /sdcard/data.csv data@%mydate%_%mytime%.csv
adb wait-for-device pull /sdcard/data_pit.csv data_pit@%mydate%_%mytime%.csv
adb kill-server