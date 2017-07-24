//reduce effort during drop down using wrapper class.

var SelectWrapper = require('./Select-Wrapper.js'); 
var mySelect = new SelectWrapper(By.id("userSelect"));
describe("Select Wrapper class",function(){

	it("handling dropdown with wrapper class locator",function(){
	
		browser.get("http://www.way2automation.com/angularjs-protractor/banking/#/customer");
		mySelect.selectByText("Harry Potter");
		browser.sleep(3000);
	
	});
	
	it("Finding count and printing all dropdown items",function(){
	
		browser.get("http://www.way2automation.com/angularjs-protractor/banking/#/customer");
		var dropoptions = mySelect.getOptions();
		dropoptions.then(function(options){
			
			console.log(options.length);
		}); 
	
	});



});