def call(String imageName) {
    echo "--- Scanning Image: ${imageName} ---"
    sh "trivy image --timeout 20m --exit-code 0 ${imageName}"
}
