describe("Customer Login",function(){

	it("click on customer login",function(){
	
		browser.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		element(by.buttonText("Customer Login")).click();
		browser.sleep(3000);
		element.all(by.css("#userSelect option")).then(function(items){
			
			console.log("Total values in dropdown are"+items.length);
			
			for (i=0;i<items.length;i++){
				items[i].getText().then(function(text){
					
					console.log(text);
				});
				
			}
			
			for (i=0;i<items.length;i++){
				items[i].getAttribute("value").then(function(text){
					
					console.log(text);
				});
				
			}
			
			element(by.model("custId")).$("[value='2']").click();
			browser.sleep(3000);
		});
		
	
	});
	


});