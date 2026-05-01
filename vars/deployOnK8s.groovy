def call() {
    withCredentials([file(credentialsId: 'kubeconfig', variable: 'KUBECONFIG_PATH')]) {
        sh '''
            export KUBECONFIG="$KUBECONFIG_PATH"
            DEPLOY_PATH=$(find . -path "*Lab 23*/Jenkins_App/deployment.yaml" | head -n 1)

            if [ -z "$DEPLOY_PATH" ]; then
                echo "ERROR: deployment.yaml not found for Lab 23"
                exit 1
            fi

            echo "Found deployment file at: $DEPLOY_PATH"
            kubectl apply -f "$DEPLOY_PATH"
        '''
    }
}
