def call(String sonarqube_scannertool_variable, String ProjectName, String ProjectKey){
  withSonarQubeEnv("${sonarqube_scannertool_variable}"){
    sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${ProjectName} -Dsonar.projectKey=${ProjectKey} -X"
  }
}
