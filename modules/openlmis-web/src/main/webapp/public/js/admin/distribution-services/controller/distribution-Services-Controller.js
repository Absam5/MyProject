function distributionServicesController($scope, distributionServeService){
/*alert('My first angular project');*/

/*$scope.mydata = 'Makunduchi';*/



/*console.log(distributionServices);*/

/*Tunaipa uhai*/
$scope.submit = function(distributionServices){
    if(distributionServices.supplier === undefined || distributionServices.receiver === undefined || distributionServices.status === undefined){
   $scope.showColor = true;
    $scope.message="Please fill All the required field";

   return;
}

   var saveTheData = {};
   saveTheData.supplier = distributionServices.supplier;
   saveTheData.receiver = distributionServices.receiver;
   saveTheData.status = distributionServices.status;

 distributionServeService.save(saveTheData, function(data){
 $scope.distributionServices = undefined;
 $scope.message1 ="Successfully Added";
 });

}
}
/*var supplier = distributionServices.supplier;*/
/*var receiver = distributionServices.receiver;*/
/*var status = distributionServices.status;*/

/*ifute form*/
/*$scope.distributionServices.supplier='';
$scope.distributionServices.receiver='';
$scope.distributionServices.status='';*/

/*console.log(supplier);
console.log(receiver);
console.log(status);*/


