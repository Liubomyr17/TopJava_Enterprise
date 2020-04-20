call mvn -B -s settings.xml -DskipTests=true clean package
call java -Dspring.profiles.active="datajpa,heroku" -DDATABASE_URL="jdbc:postgresql://localhost:5432/topjava" -jar target/dependency/webapp-runner.jar target/*.war
