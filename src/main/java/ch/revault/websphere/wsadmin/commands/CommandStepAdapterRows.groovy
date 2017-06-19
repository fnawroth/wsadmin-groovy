/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands

/**
 * Created by urs on 6/17/2017.
 */
class CommandStepAdapterRows {
    def adapter
    CommandStepAdapterRows(CommandStepAdapter adapter) {
        this.adapter = adapter
    }
    def methodMissing(String name, args) {
        if (args.length == 1) {
            adapter.put(name, args[0])
        } else {
            adapter.put(name, args)
        }
    }
}
