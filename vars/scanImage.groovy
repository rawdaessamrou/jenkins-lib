def call(String imageName) {
    echo "--- Scanning Image: ${imageName} ---"
    sh "docker run --rm -v /var/run/docker.sock:/var/run/docker.sock aquasec/trivy:latest image ${imageName}"
}
