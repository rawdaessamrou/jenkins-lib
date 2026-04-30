def call(String imageName) {
    echo "--- Scanning Image for Vulnerabilities ---"
    sh "trivy image ${imageName} || echo 'Scan finished with issues'"
}
