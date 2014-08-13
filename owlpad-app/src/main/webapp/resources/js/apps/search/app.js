/**
 * Modularized Backbone.Marionette Application
 */
define([ 'jquery', 
         'underscore', 
         'backbone', 
         'marionette',
         'common/utils',
         'apps/search/mediators/searchMediator'],
         function($, _, Backbone, Marionette,AppUtils,SearchMediator) {

	var App = new Backbone.Marionette.Application();
    
	App.addRegions({
		header:".navbar-default",
		gridRegion : '.gridRegion',
		preview:'.previewRegion'
	});
	
	var utils = new AppUtils();
	utils.setup();
	
	var appRegions = {'header':App.header,'gridRegion':App.gridRegion,preview:App.preview};

	var searchMediator = new SearchMediator(appRegions);

	return App;
});