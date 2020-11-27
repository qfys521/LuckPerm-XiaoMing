/*
 * Copyright (c) 2018-2020 Karlatemp. All rights reserved.
 * @author Karlatemp <karlatemp@vip.qq.com> <https://github.com/Karlatemp>
 *
 * LuckPerms-Mirai/LuckPerms-Mirai.main/DebugKit.kt
 *
 * Use of this source code is governed by the GNU AFFERO GENERAL PUBLIC LICENSE version 3 license that can be found via the following link.
 *
 * https://github.com/Karlatemp/LuckPerms-Mirai/blob/master/LICENSE
 */

package io.github.karlatemp.luckperms.mirai.logging

import io.github.karlatemp.luckperms.mirai.LPMiraiPlugin

internal object DebugKit {
    var isDebugEnabled = false
    inline fun log(msg: () -> String) {
        if (isDebugEnabled) {
            LPMiraiPlugin.logger.info("[DEBUG] ${msg()}")
        }
    }
}
