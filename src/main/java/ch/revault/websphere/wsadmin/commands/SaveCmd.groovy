/*
 *  Copyright (c) Revault Sàrl, <info@revault.ch> 2017
 *  License: GPLv3
 *
 */

package ch.revault.websphere.wsadmin.commands

import ch.revault.websphere.wsadmin.Client

/**
 * Created by urs on 6/16/2017.
 */
class SaveCmd extends BaseCommand<Void>{
    private boolean overwriteOnConflict

    @Override
    Tuple2<Client, Void> execute(Client client) {
        client.save(overwriteOnConflict)
        return [client,null]
    }
    def overwriteOnConflict(overwriteOnConflict) {
        this.overwriteOnConflict = overwriteOnConflict
    }
}
