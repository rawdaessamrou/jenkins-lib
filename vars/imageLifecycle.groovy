def call(String imageName, String credentialsId) {
    echo "--- Building Docker Image: ${imageName} ---"

    dir('CI-CD/Lab 23 - CICD Pipeline Implementation with Jenkins Agents and Shared Libraries/Jenkins_App') {
        sh "docker build -t ${imageName} ."
    }

    echo "--- Scanning Image: ${imageName} ---"
    sh """
        trivy image \\
          --timeout 20m \\
          --exit-code 0 \\
          --db-repository public.ecr.aws/aquasecurity/trivy-db \\
          --scanners vuln \\
          ${imageName}
    """

    echo "--- Pushing Image: ${imageName} ---"
    docker.withRegistry('', credentialsId) {
        sh "docker push ${imageName}"
    }

    echo "--- Cleaning up local Docker images ---"
    sh "docker rmi ${imageName}"
}
