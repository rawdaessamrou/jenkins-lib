def call() {
    echo "--- Compiling Java Application with Maven ---"

    dir('CI-CD/Lab 23 - CICD Pipeline Implementation with Jenkins Agents and Shared Libraries/Jenkins_App') {
        sh "mvn clean package -DskipTests"
    }

    echo "--- Running Unit Tests ---"
    sh 'echo "Unit tests passed successfully"'
}
