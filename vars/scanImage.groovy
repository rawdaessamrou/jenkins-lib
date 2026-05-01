def call(String imageName) {
    echo "--- Scanning Image: ${imageName} ---"
    scanImage(env.DOCKER_IMAGE)
}
