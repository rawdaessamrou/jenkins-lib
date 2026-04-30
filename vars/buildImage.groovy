def call(String imageName) { // Added String imageName here
    echo "--- Building Docker Image: ${imageName} ---"
    
    dir('CI-CD/Lab 23 - CICD Pipeline Implementation with Jenkins Agents and Shared Libraries/Jenkins_App') {
        sh "docker build -t ${imageName} ."
    }
}
