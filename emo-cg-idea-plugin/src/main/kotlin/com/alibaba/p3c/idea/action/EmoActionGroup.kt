package com.alibaba.p3c.idea.action

import com.coding.guardian.plugin.icons.P3cIcons
import com.intellij.openapi.actionSystem.DefaultActionGroup

class EmoActionGroup:DefaultActionGroup() {

    init {
        templatePresentation.icon = P3cIcons.ALIBABA
    }
}