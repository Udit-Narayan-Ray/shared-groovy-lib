def call(String sonarqube_scanner_server_variable, String ProjectName, String ProjectKey){
  withSonarQubeEnv("${sonarqube_scanner_server_variable}"){
    sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${ProjectName} -Dsonar.projectKey=${ProjectKey} -X"
  }
}
