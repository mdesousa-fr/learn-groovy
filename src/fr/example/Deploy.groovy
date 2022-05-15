package fr.example

import groovy.transform.NamedParam
import groovy.transform.NamedParams

class Deploy {
    private helm_chart = "backend"
    private helm_version = "1.0.0"

    static void helm(final String chart) {
        helm(chart: chart, version: "")
    }

    static Object helm(@NamedParams([
            @NamedParam(value = "chart", type = String, required = true),
            @NamedParam(value = "version", type = String),
    ]) final Map param) {
        if (param.version) {
            println("Deploying Helm chart ${param.chart}:${param.version}");
        } else {
            println("Deploying Helm chart ${param.chart}:latest");
        }
    }

    static void main(final String[] args) {
        Deploy deploy = new Deploy();
        deploy.helm("backend");
    }
}
