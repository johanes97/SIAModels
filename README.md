[![Build Status](https://travis-ci.org/johanes97/SIAModels.svg?branch=master)](https://travis-ci.org/johanes97/SIAModels)

# SIAModels
Java classes representing objects available in UNPAR's Sistem Informasi Akademik. Requires Java 1.8.

## Prerequisites
Pastikan versi JDK tidak kurang dari 1.8.3
1. Download Binary zip archive maven (https://maven.apache.org/download.cgi)
2. Extract zip tersebut, lalu simpan di drive C:/
3. Tambahkan direktori folder **bin** ke environment variable PATH  

## Test Plan, Test Report, Code Coverage 
ketik kode berikut pada cmd atau powershell di folder tempat file **pom.xml** berada

**mvn test site**

1. Code coverage dapat dilihat di folder **target\site\jacoco**, file **index.html**
2. Test plan dapat dilihat di folder **target\site\testapidocs**, file **index.html**
3. Test report, ketik kode **mvn surefire-report:report** , kemudian buka folder **target\site**, file **surefire-report.html**


