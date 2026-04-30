def call() {
    dir('CI-CD/Lab 23 - CICD Pipeline Implementation with Jenkins Agents and Shared Libraries/Jenkins_App') {
        sh "docker build -t my-registry/jenkins-app:${env.BUILD_ID} ."
    }
}
