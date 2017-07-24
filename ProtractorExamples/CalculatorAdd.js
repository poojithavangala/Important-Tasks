describe("Calculator App Testing",function(){
	
	beforeEach(function(){
		browser.get("http://www.way2automation.com/angularjs-protractor/calc/");
	});
	
	afterEach(function(){
		browser.sleep(4000);
		console.log("executed it block");
	});
	
	it("Test Case1 validation",function(){
		
		
		element(by.model("first")).sendKeys("2");
		element(by.model("second")).sendKeys("4");
		element(by.buttonText("Go!")).click();
		element(by.binding("latest")).getText().then(function(text){
			
			console.log("Result is : " +text);
		});
	});
		
		
	it("Test Case1 validation",function(){
		
		element(by.model("first")).sendKeys("2");
		element(by.model("second")).sendKeys("5");
		element(by.buttonText("Go!")).click();
		element(by.binding("latest")).getText().then(function(text){
			
			console.log("Result is : " +text);
		});
	
		
	
	});


});