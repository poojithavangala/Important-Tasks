describe("To test a banking app",function(){

	it("Enter Text",function(){
		
		browser.get("https://angularjs.org/");
		element(by.model("yourName")).sendKeys("poojitha");
		element(by.binding("yourName")).getText().then(function(text){
		
			console.log(text);
		});
		
		
	
	
	});


});