package com.klukasz;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class VersioningGradlePlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getLogger().quiet("======================");
    }
}
