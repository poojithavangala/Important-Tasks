describe("Validation of expect statement",function(){
	var title;
	
	beforeEach(function(){
		browser.get("http://www.way2automation.com/angularjs-protractor/calc/");
		title = browser.getTitle();
		
	});
	
	it("validation of exact title",function(){
		
		
		title.then(function(text){
			console.log(text);
			expect(title).toEqual("Protractor practice website - Calculator");
		});
		
	
	});
	
	it("validation of exact title",function(){
		
		
		title.then(function(text){
			console.log(text);
			expect(title).toMatch("practice website");
		});
		
	
	});
	
});