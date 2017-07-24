describe("Validation of expect statement",function(){
	
	var expected_text;
	
	beforeEach(function(){
		browser.get("http://www.way2automation.com/angularjs-protractor/calc/");
		element(by.model("first")).sendKeys("2");
		element(by.model("second")).sendKeys("4");
		element(by.buttonText("Go!")).click();
		expected_text=element(by.binding("latest")).getText();
	});
	
	it("validation test1 for 2+4 is true",function(){
		
		
		expected_text.then(function(text){
			
			console.log("Result is:" +text);
			expect(parseInt(text)).toBe(6);
		
		});
	});
		
	it("validation test1 for 2+4 is not 6",function(){
		
		
		expected_text.then(function(text){
			
			console.log("Result is:" +text);
			expect(parseInt(text)).not.toBe(4);
		
		});
		
		
	});

});