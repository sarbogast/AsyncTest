package com.epseelon

import grails.async.Promises
import grails.transaction.Transactional

@Transactional
class TestService {

    def serviceMethod() {
        Promises.task {
            sleep(10000)
        }
        return "42"
    }
}
