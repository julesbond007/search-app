define([
        'jquery',
        'underscore',
        'backbone',
        'marionette'
    ], function($,_,Backbone,Marionette) {

	EventManager = _.extend({}, Backbone.Events);
    
    return EventManager;
});