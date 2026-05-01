def call(String imageName, String credentialsId) {
    docker.withRegistry('', credentialsId) {
        sh "docker push ${imageName}"
    }
}
