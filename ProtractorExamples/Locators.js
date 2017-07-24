describe("Registration page",function(){

	beforeEach(function(){
	browser.get("http://www.way2automation.com/angularjs-protractor/registeration/#/login");
	});

	it("Username,Password,login validation",function(){
		element(by.model("Auth.user.name")).sendKeys("angular");
		element(by.model("Auth.user.password")).sendKeys("password");
		element(by.model("model[options.key]")).sendKeys("angular");
		element(by.buttonText("Login")).click();
		browser.sleep(3000);
		element(by.className("ng-scope")).getText().then(function(text){
			
			console.log(text);
			expect(text).toContain("Home");
		
		element(by.linkText("Logout")).click();
		
		});
	
	
	});


});