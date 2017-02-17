package com.epseelon


import grails.rest.*
import grails.converters.*

class TestController {
	static responseFormats = ['json', 'xml']

    def testService

    def index() {
        def result = testService.serviceMethod()
        render status: 200, text: result
    }
}
