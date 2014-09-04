/**
 * Modularized Backbone.Marionette Application
 */
define(['jquery', 
        'underscore', 
        'backbone', 
        'marionette', 
        'common/utils', 
        'apps/search/mediators/searchMediator',
        'apps/search/mediators/configMediator'], 
        function($, _, Backbone, Marionette, AppUtils, SearchMediator, ConfigMediator) {

    var App = new Backbone.Marionette.Application();

    App.addRegions({
        header : ".navbar-default",
        gridRegion : '.gridRegion',
        preview : '.previewRegion'
    });

    var utils = new AppUtils();
    utils.setup();

    var appRegions = {
        'header' : App.header,
        'gridRegion' : App.gridRegion,
        'preview' : App.preview
    };

    var configMediator = new ConfigMediator();
    configMediator.loadConfig();
    
    var searchMediator = new SearchMediator(appRegions);

    //kick off a "*" search on app startup.
    var searchCriteria = {
        resultStart : 0,
        keyWord : "*",
        hitsPerPage : 20
    };
    searchMediator.search(searchCriteria);

    return App;
}); 