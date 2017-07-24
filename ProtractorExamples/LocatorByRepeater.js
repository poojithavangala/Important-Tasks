describe("Calc page Locator-by.repeater",function(){

	it("Test Case1 validation",function(){
		
		browser.get("http://www.way2automation.com/angularjs-protractor/calc/");
		
		element(by.model("first")).sendKeys("2");
		element(by.model("second")).sendKeys("4");
		element(by.buttonText("Go!")).click();
		
		
		element(by.model("first")).sendKeys("5");
		element(by.model("second")).sendKeys("3");
		element(by.buttonText("Go!")).click();
	});
	//printing first row data
	it("History block testcase",function(){
		
		console.log("Printing first row");
		
		element(by.repeater("result in memory").row(0)).getText().then(function(text){
			console.log(text);
		
		});
	
	
	});
	//printing column data
	it("History block col data",function(){
		
		console.log("Printing column data");
		
		element.all(by.repeater("result in memory").column("result.timestamp ")).getText().then(function(text){ //to print all the column data use element.all
			console.log(text);
		
		});
	
	
	});
	//printing whole table data
	it("print Table data",function(){
		
		console.log("Print table data row wise");
		element.all(by.repeater("result in memory")).getText().then(function(rows){
			var noOfItems = rows.length;
			for (i=0;i<noOfItems;i++)
				
				{
					var table = element(by.repeater("result in memory").row(i)).getText();
					table.then(function(text){
						console.log(text);
					});
				}
		
		
		
		
		});
	
	
	
	
	});


});