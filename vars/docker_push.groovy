def call(String dockerHubUser, String imageName, String imageTag){
    withCredentails([usernamePassword(credentailsId: "DockerHubCred", usernameVariable: "dockerHubUser", passwordVariable: "dockerHubPass")]){
      sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    }
    sh "docker push ${dockerHubUser}/${imageName}:${imageTag}"
}
