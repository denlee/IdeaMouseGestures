package com.smardec.ideaplugin.ideamousegestures.statusbar;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.StatusBarWidget;
import com.intellij.openapi.wm.StatusBarWidgetFactory;
import org.jetbrains.annotations.NotNull;

public class PluginStatusBarWidgetFactory implements StatusBarWidgetFactory {

    @Override
    public @NotNull String getId() {
        return "mouse-gestures-plugin-status-bar-widget-factory-id";
    }

    @Override
    public @NotNull String getDisplayName() {
        return "Mouse Gestures";
    }

    @Override
    public @NotNull StatusBarWidget createWidget(@NotNull Project project) {
        return new PluginStatusBarWidget();
    }

}