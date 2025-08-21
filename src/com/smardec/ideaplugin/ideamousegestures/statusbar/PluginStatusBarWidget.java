package com.smardec.ideaplugin.ideamousegestures.statusbar;

import com.intellij.openapi.wm.StatusBar;
import com.intellij.openapi.wm.StatusBarWidget;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.*;

public class PluginStatusBarWidget implements StatusBarWidget {

    public static final String ID = "mouse-gestures-plugin-status-bar-widget-id";

    private StatusBar statusBar;
    private String tooltipText = "Mouse Gestures Plugin";
    private boolean recognized = true;

    @NotNull
    @Override
    public String ID() {
        return ID;
    }

    @Override
    public void install(@NotNull StatusBar statusBar) {
        this.statusBar = statusBar;
    }

    @Nullable
    @Override
    public WidgetPresentation getPresentation(@NotNull PlatformType type) {

        return new StatusBarWidget.TextPresentation() {
            @NotNull
            @Override
            public String getText() {
                return recognized ? "M" : "m";
            }

            @Nullable
            @Override
            public String getTooltipText() {
                return tooltipText;
            }

            @Override
            public float getAlignment() {
                return Component.CENTER_ALIGNMENT;
            }

        };
    }

    public void setState(boolean recognized, String text) {
        this.recognized = recognized;
        this.tooltipText = text;
        if (statusBar != null) {
            statusBar.updateWidget(ID());
        }
    }

}