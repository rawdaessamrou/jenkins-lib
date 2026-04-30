def call(String imageName) {
    echo "--- Scanning Image: ${imageName} ---"
    sh "trivy image --debug --download-java-db-only" 
    sh "trivy image ${imageName}"
}
