/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands

import org.slf4j.LoggerFactory

/**
 * Created by urs on 6/16/2017.
 */
abstract class BaseCommand<T> implements Command<T>{
    final def logger = LoggerFactory.getLogger(getClass())

    private failOnError = true
    @Override
    void failOnError(boolean failOnError) {
        this.failOnError = failOnError
    }
    @Override
    boolean failOnError() {
        return this.failOnError
    }

    @Override
    String commandName() {
        getClass().getSimpleName().uncapitalize()
    }
}
