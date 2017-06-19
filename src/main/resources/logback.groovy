/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

appender("Console-Appender", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n"
    }
}
def appenders = ["Console-Appender"]
logger("ch.qos.logback", ERROR, appenders, false)
//logger("ch.revault.websphere.wsadmin.Script", DEBUG, appenders, false)
root(INFO, appenders)
