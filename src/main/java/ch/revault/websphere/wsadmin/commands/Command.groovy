/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands

import ch.revault.websphere.wsadmin.Client

/**
 * Created by urs on 6/15/2017.
 */
interface Command<T>{
    Tuple2<Client, T> execute(Client client)
    boolean failOnError()
    /**
     * Set to false if errors should be ignored for this command
     * @param failOnError
     */
    void failOnError(boolean failOnError)

    String commandName()
}
