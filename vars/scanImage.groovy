def call(String imageName) {
    echo "--- Scanning Image: ${imageName} ---"
    sh """
        trivy image \
          --timeout 20m \
          --exit-code 0 \
          --db-repository public.ecr.aws/aquasecurity/trivy-db \
          --scanners vuln \
          ${imageName}
    """
}
