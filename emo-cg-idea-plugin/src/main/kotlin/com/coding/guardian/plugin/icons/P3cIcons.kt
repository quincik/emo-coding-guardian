package com.coding.guardian.plugin.icons

import com.coding.guardian.plugin.config.SkinConfig
import com.intellij.openapi.util.IconLoader

object P3cIcons {

    private var SKIN_PATH = "/skin/"+ SkinConfig.NAME

    val ANALYSIS_ACTION = IconLoader.getIcon(SKIN_PATH+"/icons/ali-ide-run.png", javaClass)

    val PROJECT_INSPECTION_ON = IconLoader.getIcon(SKIN_PATH+"/icons/qiyong.png", javaClass)
    val PROJECT_INSPECTION_OFF = IconLoader.getIcon(SKIN_PATH+"/icons/tingyong.png", javaClass)
    val LANGUAGE = IconLoader.getIcon(SKIN_PATH+"/icons/language.png", javaClass)
    val ALIBABA = IconLoader.getIcon(SKIN_PATH+"/icons/"+SkinConfig.NAME+".png", javaClass)
}