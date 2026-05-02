# Jenkins Shared Library

## Overview
This repository contains a Jenkins Shared Library used to centralize and reuse common CI/CD pipeline logic across multiple Jenkins pipelines. Instead of duplicating pipeline code in every project, these reusable functions are defined once here and called from any Jenkinsfile that loads this library.

## Available Functions

### `buildAndTest`
Handles the build and test stage of the pipeline. It compiles the Java project using Maven and confirms that unit tests have passed.

### `imageLifecycle`
Manages the full Docker image lifecycle in a single call. It builds the Docker image, scans it for vulnerabilities using Trivy, pushes it to DockerHub, and removes the image from the local Docker daemon to keep the agent clean.

### `deployOnK8s`
Handles deployment to a Kubernetes cluster. It loads the kubeconfig from a Jenkins credential, locates the deployment manifest, and applies it to the cluster.

## Tools Used
- **Maven** – Compiles and packages the Java application.
- **Docker** – Builds, pushes, and cleans up images.
- **Trivy** – Scans the Docker image for vulnerabilities before pushing.
- **kubectl** – Applies the Kubernetes deployment manifest.
