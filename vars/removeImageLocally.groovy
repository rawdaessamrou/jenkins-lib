def call(String imageName) {
    echo "--- Cleaning up local Docker images ---"
    sh "docker rmi ${imageName}"
}
