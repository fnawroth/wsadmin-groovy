/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin

import ch.revault.websphere.wsadmin.commands.Command

/**
 * Created by urs on 6/16/2017.
 */
interface ScriptInterface {
     def runDelegate(Command command, Closure<?> block)
}