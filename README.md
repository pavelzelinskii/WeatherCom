Parsing value of temperature and current location, Compare actual/expected results, Validating elements on Pages Reporting using extentReports and AllureReport mvn package -DskipTests; mvn site -Dbrowser=Firefox -Dtest=ExtentReportsTest; open ./test-output/extentreports.html and then mvn site -Dbrowser=Firefox -Dtest=AllureReportTest; open -a firefox ./target/site/allure-maven-plugin/index.html

