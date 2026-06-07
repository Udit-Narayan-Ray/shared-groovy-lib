def call(String dockerHubUser, String imageName, String imageTag){
    withCredentials([usernamePassword(credentialsId: "DockerHubCred", usernameVariable: "dockerHubUser", passwordVariable: "dockerHubPass")]){
      sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    }
    sh "docker push ${dockerHubUser}/${imageName}:${imageTag}"
}
